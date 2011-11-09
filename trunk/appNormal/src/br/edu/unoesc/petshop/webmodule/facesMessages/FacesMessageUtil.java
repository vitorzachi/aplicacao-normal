package br.edu.unoesc.petshop.webmodule.facesMessages;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class FacesMessageUtil {

	public static void showInfo(String info) {
		FacesMessage fm = new FacesMessage();
		fm.setSummary(info);
		fm.setSeverity(FacesMessage.SEVERITY_INFO);

		FacesContext.getCurrentInstance().addMessage(null, fm);
	}

	public static void showError(String info, String idComponent) {
		FacesMessage fm = new FacesMessage();
		fm.setSummary(info);
		fm.setSeverity(FacesMessage.SEVERITY_ERROR);

		FacesContext.getCurrentInstance().addMessage(idComponent, fm);
	}
}
