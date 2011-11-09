package br.edu.unoesc.petshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.edu.unoesc.petshop.util.Encriptador;

@Entity
@Table(name = "USUARIO")
public class Usuario implements BaseModel {

	private static final long serialVersionUID = 8273750631457998873L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "nomeusuario", unique = true, nullable = false, length = 100)
	private String nome;

	@Column(name = "login", unique = true, nullable = false, length = 100)
	private String login;

	@Column(name = "senha", nullable = false, length = 40)
	private String senha;

	@Column(name = "isadministrador", nullable = false)
	private boolean administrador = true;

	@ManyToOne
	private Empresa empresa;

	// = métodos ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
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
		if (senha != null && senha.length() < 40) {
			this.senha = Encriptador.encript(senha);
		} else {
			this.senha = senha;
		}
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Usuario) {
			Usuario tmp = (Usuario) obj;
			return new GeraEquals(tmp.getCodigo(), this.getCodigo()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getCodigo()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}

}
