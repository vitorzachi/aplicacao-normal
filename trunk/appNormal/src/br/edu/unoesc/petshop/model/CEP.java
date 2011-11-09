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
@Table(name = "CEP")
public class CEP implements BaseModel {

	private static final long serialVersionUID = 503523928024841722L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@ManyToOne
	@JoinColumn(name = "coduf", nullable = false)
	private UnidadeFederativa unidadeFederativa;

	@ManyToOne
	@JoinColumn(name = "codcidade", nullable = false)
	private Cidade cidade;

	@Column(name = "cep", unique = true, nullable = false, length = 11)
	private String cep;

	// = métodos ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public UnidadeFederativa getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(UnidadeFederativa unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof CEP) {
			CEP tmp = (CEP) obj;
			return new GeraEquals(tmp.getCidade(), this.getCidade(), tmp.getCep(), this.getCep()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getCidade(), this.getCep()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}
}
