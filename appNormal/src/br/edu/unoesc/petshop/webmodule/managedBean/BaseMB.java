package br.edu.unoesc.petshop.webmodule.managedBean;

import java.io.Serializable;

import br.edu.unoesc.petshop.exception.ServiceException;
import br.edu.unoesc.petshop.model.BaseModel;
import br.edu.unoesc.petshop.service.BaseService;
import br.edu.unoesc.petshop.webmodule.facesMessages.FacesMessageUtil;

public abstract class BaseMB<Model extends BaseModel, Service extends BaseService<Model>> implements Serializable {

	private static final long serialVersionUID = -1279732751235389947L;
	private Model entidade;

	public void salvar() {
		try {
			getService().salvarOuAlterar(entidade);
			FacesMessageUtil.showInfo("Salvo com sucesso");
		} catch (ServiceException e) {
			FacesMessageUtil.showError(e.getLocalizedMessage(), null);
		}
	}

	public void remover() {
		try {
			getService().remover(entidade);
			FacesMessageUtil.showInfo("Salvo com sucesso");
		} catch (ServiceException e) {
			FacesMessageUtil.showError(e.getLocalizedMessage(), null);
		}
	}

	public void remover(Long codigo) {
		try {
			getService().remover(codigo);
			FacesMessageUtil.showInfo("Salvo com sucesso");
		} catch (ServiceException e) {
			FacesMessageUtil.showError(e.getLocalizedMessage(), null);
		}
	}

	public void editar(Long codigo) {
		try {
			entidade = getService().buscaPorCodigo(codigo);
			FacesMessageUtil.showInfo("Salvo com sucesso");
		} catch (ServiceException e) {
			FacesMessageUtil.showError(e.getLocalizedMessage(), null);
		}
	}

	public Model getEntidade() {
		return entidade;
	}

	public void setEntidade(Model entidade) {
		this.entidade = entidade;
	}

	public abstract Service getService();

	public abstract void inicio();
}
