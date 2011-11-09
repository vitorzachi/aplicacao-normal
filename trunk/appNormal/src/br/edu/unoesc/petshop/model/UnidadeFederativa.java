package br.edu.unoesc.petshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UF")
public class UnidadeFederativa implements BaseModel {

	private static final long serialVersionUID = -2150786987035873787L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "sigla", unique = true, nullable = false, length = 2)
	private String sigla;

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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UnidadeFederativa) {
			UnidadeFederativa tmp = (UnidadeFederativa) obj;
			return new GeraEquals(tmp.getCodigo(), this.getCodigo(), tmp.getNome(), this.getNome()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getCodigo(), this.getNome()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}

}
