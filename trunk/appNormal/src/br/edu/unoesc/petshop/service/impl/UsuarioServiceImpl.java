package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.NoResultException;

import br.edu.unoesc.petshop.model.Usuario;
import br.edu.unoesc.petshop.service.UsuarioService;
import br.edu.unoesc.petshop.util.Encriptador;

@ManagedBean(name = UsuarioService.NOME_BEAN)
@ApplicationScoped
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario> implements UsuarioService {

	private static final long serialVersionUID = -1755515516008420077L;

	@Override
	public Usuario getUsuarioPorLoginESenha(String login, String senha) {
		if (senha != null && senha.length() < 28) {
			senha = Encriptador.encript(senha);
		}
		String sql = "select u from Usuario u where u.login=:login and u.senha=:senha";
		try {
			return getEntityManager().createQuery(sql, Usuario.class).setParameter("login", login).setParameter("senha", Encriptador.encript(senha))
					.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
}
