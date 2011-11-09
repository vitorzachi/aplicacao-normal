package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.TipoAnimal;
import br.edu.unoesc.petshop.service.TipoAnimalService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class TipoAnimalMB extends BaseMB<TipoAnimal, TipoAnimalService> {

	private static final long serialVersionUID = 7780698631423387160L;
	@ManagedProperty(value = TipoAnimalService.EL_BEAN)
	private TipoAnimalService tipoAnimalService;

	@Override
	public TipoAnimalService getService() {
		return tipoAnimalService;
	}

	public TipoAnimalService getTipoAnimalService() {
		return tipoAnimalService;
	}

	public void setTipoAnimalService(TipoAnimalService tipoAnimalService) {
		this.tipoAnimalService = tipoAnimalService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new TipoAnimal());
	}
}
