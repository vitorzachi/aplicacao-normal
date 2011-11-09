package br.edu.unoesc.petshop.webmodule.managedBean.app;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.edu.unoesc.petshop.model.Usuario;
import br.edu.unoesc.petshop.service.UsuarioService;
import br.edu.unoesc.petshop.webmodule.filter.LoginListener;
import br.edu.unoesc.petshop.webmodule.filter.WebUtil;

@ManagedBean
public class LoginMB implements Serializable {

	private static final long serialVersionUID = 3889419934898885895L;

	@ManagedProperty(value = UsuarioService.EL_BEAN)
	private UsuarioService usuarioService;
	private String login, password;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public String doLogin() {
		Usuario user = usuarioService.getUsuarioPorLoginESenha(login, password);

		if (user != null) {
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
			session.setAttribute(WebUtil.ATTR_USUARIO_LOGADO, user);
			return LoginListener.WELCOME_PAGE + "?faces-redirect=true";
		} else {
			// FacesUtils.mensErro("Usuário ou senha inválidos!");
			return LoginListener.LOGIN_PAGE + "?faces-redirect=true";
		}
	}
}
