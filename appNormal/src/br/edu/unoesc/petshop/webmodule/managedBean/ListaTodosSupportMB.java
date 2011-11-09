package br.edu.unoesc.petshop.webmodule.managedBean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Cliente;
import br.edu.unoesc.petshop.model.TipoAnimal;

@ManagedBean
@ApplicationScoped
public class ListaTodosSupportMB extends ServiceSupport {

	// = métodos ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public List<Cliente> getClientes() {
		return clienteService.buscaTodos();
	}

	public List<TipoAnimal> getTiposAnimal() {
		return tipoAnimalService.buscaTodos();
	}
}
