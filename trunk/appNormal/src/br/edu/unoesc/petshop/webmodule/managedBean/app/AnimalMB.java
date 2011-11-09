package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Animal;
import br.edu.unoesc.petshop.service.AnimalService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class AnimalMB extends BaseMB<Animal, AnimalService> {

	private static final long serialVersionUID = -4023331793300989731L;

	@ManagedProperty(value = AnimalService.EL_BEAN)
	private AnimalService animalService;

	@Override
	public AnimalService getService() {
		return animalService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Animal());
	}

	public AnimalService getAnimalService() {
		return animalService;
	}

	public void setAnimalService(AnimalService animalService) {
		this.animalService = animalService;
	}

}
