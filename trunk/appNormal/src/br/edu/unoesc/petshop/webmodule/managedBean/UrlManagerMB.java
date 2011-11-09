package br.edu.unoesc.petshop.webmodule.managedBean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.unoesc.petshop.util.ListaUrl;

@ManagedBean
@SessionScoped
public class UrlManagerMB implements Serializable {

	private static final long serialVersionUID = -6448689171216608618L;
	private String url;

	public String getUrl() {
		if (url == null) {
			return ListaUrl.URL_HOME;
		}
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void cadastroAnimal() {
		setUrl(ListaUrl.URL_ANIMAL);
	}

	public void cadastroAtendimento() {
		setUrl(ListaUrl.URL_ATENDIMENTO);
	}

	public void cadastroAtividade() {
		setUrl(ListaUrl.URL_ATIVIDADE);
	}

	public void cadastroCep() {
		setUrl(ListaUrl.URL_CEP);
	}

	public void cadastroCidade() {
		setUrl(ListaUrl.URL_CIDADE);
	}

	public void cadastroCliente() {
		setUrl(ListaUrl.URL_CLIENTE);
	}

	public void cadastroEmpresa() {
		setUrl(ListaUrl.URL_EMPRESA);
	}

	public void cadastroTipoAnimal() {
		setUrl(ListaUrl.URL_TIPO_ANIMAL);
	}

	public void cadastroUnidadeFederativa() {
		setUrl(ListaUrl.URL_UNIDADE_FEDERATIVA);
	}

	public void cadastroUsuario() {
		setUrl(ListaUrl.URL_USUARIO);
	}

	public void home() {
		setUrl(ListaUrl.URL_HOME);
	}
}
