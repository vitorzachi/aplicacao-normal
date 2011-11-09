package br.edu.unoesc.petshop.webmodule.filter;

import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;
import javax.servlet.http.HttpSession;

public class LoginListener implements PhaseListener {

	private static final long serialVersionUID = -2490102924712333276L;
	public static String LOGIN_PAGE = "/login.xhtml";
	public static String WELCOME_PAGE = "/home.xhtml";
	public static String ACCESS_DENIED = "/acessoNegado.xhtml";
	private static String CADASTRO = "/primeiroCadastro.xhtml";

	public void afterPhase(PhaseEvent event) {

		FacesContext facesContext = event.getFacesContext();
		String currentPage = facesContext.getViewRoot() != null ? facesContext.getViewRoot().getViewId() : "";

		boolean isLoginPage = (currentPage.lastIndexOf(LOGIN_PAGE) > -1) || (currentPage.lastIndexOf(CADASTRO) > -1);
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(false);
		if (session == null) {
			session = (HttpSession) facesContext.getExternalContext().getSession(true);
		}
		Object currentUser = session.getAttribute(WebUtil.ATTR_USUARIO_LOGADO);
		NavigationHandler nh = facesContext.getApplication().getNavigationHandler();
		if (!isLoginPage && currentUser == null) {
			nh.handleNavigation(facesContext, null, LOGIN_PAGE + "?faces-redirect=true");
		}// else if (!currentPage.equals(WELCOME_PAGE) ) {
			// nh.handleNavigation(facesContext, null, ACCESS_DENIED +
			// "?faces-redirect=true");
			// }
	}

	public void beforePhase(PhaseEvent event) {
	}

	public PhaseId getPhaseId() {
		return PhaseId.RESTORE_VIEW;
	}

}