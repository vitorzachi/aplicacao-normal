package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.TipoAnimal;

public interface TipoAnimalService extends BaseService<TipoAnimal> {

	public static final String NOME_BEAN = "tipoAnimalService";
	public static final String EL_BEAN = "#{tipoAnimalService}";

}
