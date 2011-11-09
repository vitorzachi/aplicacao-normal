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
@Table(name = "ANIMAL")
public class Animal implements BaseModel {

	private static final long serialVersionUID = -5940820737852226145L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@ManyToOne
	@JoinColumn(name = "codcliente", nullable = false)
	private Cliente cliente;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@ManyToOne
	@JoinColumn(name = "codtpanimal", nullable = false)
	private TipoAnimal tipoAnimal;

	// = métodos ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoAnimal getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(TipoAnimal tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Animal) {
			Animal tmp = (Animal) obj;
			return new GeraEquals(tmp.getCliente(), this.getCliente(), tmp.getNome(), this.getNome()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getCliente(), this.getNome()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}
}
