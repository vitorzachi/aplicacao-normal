package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Atividade;

public interface AtividadeService extends BaseService<Atividade> {

	public static final String NOME_BEAN = "atividadeService";
	public static final String EL_BEAN = "#{atividadeService}";

}
