package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Empresa;

public interface EmpresaService extends BaseService<Empresa> {

	public static final String NOME_BEAN = "empresaService";
	public static final String EL_BEAN = "#{empresaService}";

}
