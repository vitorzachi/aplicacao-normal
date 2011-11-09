package br.edu.unoesc.petshop.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "ATENDIMENTO")
public class Atendimento implements BaseModel {

	private static final long serialVersionUID = -3787963581285129653L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;

	@ManyToOne
	@JoinColumn(name = "codcliente", nullable = false)
	private Cliente cliente;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataatendimento", nullable = false)
	private Date data;

	@ManyToOne
	@JoinColumn(name = "codanimal", nullable = false)
	private Animal animal;

	@OneToMany(cascade = CascadeType.ALL)
	private Set<Atividade> atividadesRealizadas;

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

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Set<Atividade> getAtividadesRealizadas() {
		return atividadesRealizadas;
	}

	public void setAtividadesRealizadas(Set<Atividade> atividadesRealizadas) {
		this.atividadesRealizadas = atividadesRealizadas;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Atendimento) {
			Atendimento tmp = (Atendimento) obj;
			return new GeraEquals(tmp.getAnimal(), this.getAnimal(), tmp.getData(), this.getData()).ehIgual();
		}
		return false;
	}

	@Override
	public int hashCode() {
		return new GeraHashCode(this.getAnimal(), this.getData()).getHashCode();
	}

	@Override
	public String toString() {
		return getCodigo().toString();
	}
}
