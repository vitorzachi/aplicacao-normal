package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Cidade;

public interface CidadeService extends BaseService<Cidade> {

	public static final String NOME_BEAN = "cidadeService";
	public static final String EL_BEAN = "#{cidadeService}";

}
