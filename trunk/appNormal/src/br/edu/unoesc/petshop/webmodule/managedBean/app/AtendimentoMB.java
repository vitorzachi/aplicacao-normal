package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Atendimento;
import br.edu.unoesc.petshop.service.AtendimentoService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class AtendimentoMB extends BaseMB<Atendimento, AtendimentoService> {

	private static final long serialVersionUID = -5875206805800055463L;
	@ManagedProperty(value = AtendimentoService.EL_BEAN)
	private AtendimentoService atendimentoService;

	@Override
	public AtendimentoService getService() {
		return atendimentoService;
	}

	public AtendimentoService getAtendimentoService() {
		return atendimentoService;
	}

	public void setAtendimentoService(AtendimentoService atendimentoService) {
		this.atendimentoService = atendimentoService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Atendimento());
	}
}
