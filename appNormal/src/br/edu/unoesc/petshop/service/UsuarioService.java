package br.edu.unoesc.petshop.service;

import br.edu.unoesc.petshop.model.Usuario;

public interface UsuarioService extends BaseService<Usuario> {

	public static final String NOME_BEAN = "usuarioService";
	public static final String EL_BEAN = "#{usuarioService}";

	Usuario getUsuarioPorLoginESenha(String login, String senha);
}
