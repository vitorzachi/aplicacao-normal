package br.edu.unoesc.petshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTE")
public class Cliente implements BaseModel {

	private static final long serialVersionUID = -5578225472074149342L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "cpf", unique = true, nullable = false, length = 100)
	private Long cpf;

	@ManyToOne
	@JoinColumn(name = "codendereco", nullable = false)
	private Endereco endereco;

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

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cliente) {
			Cliente tmp = (Cliente) obj;
			return new GeraEquals(tmp.getCpf(), this.getCpf()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getCpf()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}
}
