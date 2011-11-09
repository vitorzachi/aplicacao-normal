package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Animal;

public interface AnimalService extends BaseService<Animal> {

	public static final String NOME_BEAN = "animalService";
	public static final String EL_BEAN = "#{animalService}";

}
