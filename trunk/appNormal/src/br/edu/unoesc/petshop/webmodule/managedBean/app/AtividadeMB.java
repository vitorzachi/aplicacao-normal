package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Atividade;
import br.edu.unoesc.petshop.service.AtividadeService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class AtividadeMB extends BaseMB<Atividade, AtividadeService> {

	private static final long serialVersionUID = 5997390050407713689L;
	@ManagedProperty(value = AtividadeService.EL_BEAN)
	private AtividadeService atividadeService;

	@Override
	public AtividadeService getService() {
		return atividadeService;
	}

	public AtividadeService getAtividadeService() {
		return atividadeService;
	}

	public void setAtividadeService(AtividadeService atividadeService) {
		this.atividadeService = atividadeService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Atividade());
	}
}
