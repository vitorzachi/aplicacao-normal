package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Cidade;
import br.edu.unoesc.petshop.service.CidadeService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class CidadeMB extends BaseMB<Cidade, CidadeService> {

	private static final long serialVersionUID = 4491253865628683279L;
	@ManagedProperty(value = CidadeService.EL_BEAN)
	private CidadeService cidadeService;

	@Override
	public CidadeService getService() {
		return cidadeService;
	}

	public CidadeService getCidadeService() {
		return cidadeService;
	}

	public void setCidadeService(CidadeService cidadeService) {
		this.cidadeService = cidadeService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Cidade());
	}
}
