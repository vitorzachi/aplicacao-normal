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
@Table(name = "CIDADE")
public class Cidade implements BaseModel {

	private static final long serialVersionUID = 102286973607829165L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "coduf", nullable = false)
	private UnidadeFederativa unidadeFederativa;

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

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Cidade) {
			Cidade tmp = (Cidade) obj;
			return new GeraEquals(tmp.getNome(), this.getNome(), tmp.getUnidadeFederativa(), this.getUnidadeFederativa()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getNome(), this.getUnidadeFederativa()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}
}
