package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Atendimento;

public interface AtendimentoService extends BaseService<Atendimento> {

	public static final String NOME_BEAN = "atendimentoService";
	public static final String EL_BEAN = "#{atendimentoService}";

}
