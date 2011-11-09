package br.edu.unoesc.petshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIPO_ANIMAL")
public class TipoAnimal implements BaseModel {

	private static final long serialVersionUID = -584989130362633214L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@Column(name = "nome", unique = true, nullable = false, length = 100)
	private String nome;

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

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof TipoAnimal) {
			TipoAnimal tmp = (TipoAnimal) obj;
			return new GeraEquals(tmp.getNome(), this.getNome()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getNome()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}
}
