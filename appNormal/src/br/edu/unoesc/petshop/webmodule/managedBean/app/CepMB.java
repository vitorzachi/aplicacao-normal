package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.CEP;
import br.edu.unoesc.petshop.service.CepService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class CepMB extends BaseMB<CEP, CepService> {

	private static final long serialVersionUID = -5805998373788489690L;
	@ManagedProperty(value = CepService.EL_BEAN)
	private CepService cepService;

	@Override
	public CepService getService() {
		return cepService;
	}

	public CepService getCepService() {
		return cepService;
	}

	public void setCepService(CepService cepService) {
		this.cepService = cepService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new CEP());
	}
}
