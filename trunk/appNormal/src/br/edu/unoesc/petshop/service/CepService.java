package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.CEP;

public interface CepService extends BaseService<CEP> {

	public static final String NOME_BEAN = "cepService";
	public static final String EL_BEAN = "#{cepService}";

}
