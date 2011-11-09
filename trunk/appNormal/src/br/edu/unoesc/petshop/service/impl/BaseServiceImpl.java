package br.edu.unoesc.petshop.service.impl;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.persistence.EntityManager;

import br.edu.unoesc.petshop.exception.ServiceException;
import br.edu.unoesc.petshop.model.BaseModel;
import br.edu.unoesc.petshop.service.BaseService;
import br.edu.unoesc.petshop.util.JPAUtil;

public abstract class BaseServiceImpl<T extends BaseModel> implements BaseService<T> {

	private static final long serialVersionUID = 5230495180291310652L;

	private Class<T> classe;

	@Override
	public List<T> buscaTodos() {
		return getEntityManager().createQuery("select o from " + getTipoClasse().getName() + " o ", getTipoClasse()).getResultList();
	}

	@Override
	public T buscaPorCodigo(Long codigo) {
		return getEntityManager().find(getTipoClasse(), codigo);
	}

	@Override
	public void salvarOuAlterar(BaseModel object) {
		try {
			if (object.getCodigo() != null) {
				getEntityManager().merge(object);
			} else {
				getEntityManager().persist(object);
			}
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void remover(BaseModel object) {
		try {
			getEntityManager().remove(object);
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public void remover(Long codigo) {
		BaseModel temp = buscaPorCodigo(codigo);
		remover(temp);
	}

	@SuppressWarnings("unchecked")
	private Class<T> getTipoClasse() {
		if (this.classe == null) {
			Type[] types = ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments();
			return this.classe = (Class<T>) types[types.length > 1 ? 1 : 0];
		}
		return this.classe;
	}

	@Override
	public List<T> buscaPorNome(String nome) {
		String nomeTemp = "";
		if (nome != null) {
			nomeTemp = "%" + nome.toUpperCase() + "%";
		}

		try {
			return getEntityManager()
					.createQuery("select o from " + getTipoClasse().getName() + " o where upper(o.nome) like :nome", getTipoClasse())
					.setParameter("nome", nomeTemp).getResultList();
		} catch (Exception e) {
			throw new ServiceException(e);
		}
	}

	public EntityManager getEntityManager() {
		return JPAUtil.getEntityManager();
	}

}
