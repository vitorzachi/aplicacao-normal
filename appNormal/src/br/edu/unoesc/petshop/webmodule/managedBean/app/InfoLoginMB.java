package br.edu.unoesc.petshop.webmodule.managedBean.app;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import br.edu.unoesc.petshop.model.Usuario;
import br.edu.unoesc.petshop.util.ListaUrl;
import br.edu.unoesc.petshop.webmodule.filter.WebUtil;

@ManagedBean
@SessionScoped
public class InfoLoginMB implements Serializable {

	private static final long serialVersionUID = -6864318981064386188L;

	public Usuario getUsuarioLogado() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		Usuario u = (Usuario) session.getAttribute(WebUtil.ATTR_USUARIO_LOGADO);
		return u;
	}

	public String logout() {
		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
		session.invalidate();
		return ListaUrl.URL_HOME + "?faces-redirect=true";
	}

	public boolean isAdministrador() {
		return getUsuarioLogado() != null && getUsuarioLogado().isAdministrador();
	}

}
