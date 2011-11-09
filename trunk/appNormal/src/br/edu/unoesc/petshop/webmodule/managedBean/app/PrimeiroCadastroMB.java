package br.edu.unoesc.petshop.webmodule.managedBean.app;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Empresa;
import br.edu.unoesc.petshop.model.Usuario;
import br.edu.unoesc.petshop.service.EmpresaService;
import br.edu.unoesc.petshop.service.UsuarioService;

@ManagedBean
@ViewScoped
public class PrimeiroCadastroMB implements Serializable {

	private static final long serialVersionUID = 3368425986212773676L;
	@ManagedProperty(value = UsuarioService.EL_BEAN)
	private UsuarioService usuarioService;
	@ManagedProperty(value = EmpresaService.EL_BEAN)
	private EmpresaService empresaService;

	private String nome, login, senha;

	public void criaUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setLogin(login);
		usuario.setSenha(senha);
		List<Empresa> lista = empresaService.buscaTodos();
		Empresa empresa = null;
		if (!lista.isEmpty()) {
			empresa = lista.get(0);
		}
		if (empresa == null) {
			empresa = new Empresa();
			empresa.setNome("empresa " + nome);
			empresaService.salvarOuAlterar(empresa);
		}
		usuario.setEmpresa(empresa);

		usuarioService.salvarOuAlterar(usuario);
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public EmpresaService getEmpresaService() {
		return empresaService;
	}

	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
