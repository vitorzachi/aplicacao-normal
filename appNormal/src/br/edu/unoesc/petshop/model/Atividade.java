package br.edu.unoesc.petshop.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ATIVIDADE")
public class Atividade implements BaseModel {

	private static final long serialVersionUID = 141439439808251875L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "valor", nullable = false, precision = 2)
	private Double valor;

	@ManyToMany
	@JoinTable(name = "TPANIMAL_ATIVIDADE", joinColumns = @JoinColumn(name = "codatividade", nullable = false), inverseJoinColumns = @JoinColumn(name = "codtpanimal", nullable = false))
	private Set<TipoAnimal> tipoAnimalAplicaveis;

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

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Set<TipoAnimal> getTipoAnimalAplicaveis() {
		return tipoAnimalAplicaveis;
	}

	public void setTipoAnimalAplicaveis(Set<TipoAnimal> tipoAnimalAplicaveis) {
		this.tipoAnimalAplicaveis = tipoAnimalAplicaveis;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Atividade) {
			Atividade tmp = (Atividade) obj;
			return new GeraEquals(tmp.getNome(), this.getNome(), tmp.getCodigo(), this.getCodigo()).ehIgual();
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
