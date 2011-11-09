package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.UnidadeFederativa;
import br.edu.unoesc.petshop.service.UnidadeFederativaService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class UnidadeFederativaMB extends BaseMB<UnidadeFederativa, UnidadeFederativaService> {

	private static final long serialVersionUID = 3332873639064154986L;
	@ManagedProperty(value = UnidadeFederativaService.EL_BEAN)
	private UnidadeFederativaService unidadeFederativaService;

	@Override
	public UnidadeFederativaService getService() {
		return unidadeFederativaService;
	}

	public UnidadeFederativaService getUnidadeFederativaService() {
		return unidadeFederativaService;
	}

	public void setUnidadeFederativaService(UnidadeFederativaService unidadeFederativaService) {
		this.unidadeFederativaService = unidadeFederativaService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new UnidadeFederativa());
	}
}
