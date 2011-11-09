package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Cliente;

public interface ClienteService extends BaseService<Cliente> {

	public static final String NOME_BEAN = "clienteService";
	public static final String EL_BEAN = "#{clienteService}";

}
