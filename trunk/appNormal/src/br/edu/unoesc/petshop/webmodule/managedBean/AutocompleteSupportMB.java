package br.edu.unoesc.petshop.webmodule.managedBean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Cliente;

@ManagedBean
@ApplicationScoped
public class AutocompleteSupportMB extends ServiceSupport {

	// = métodos ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public List<Cliente> getClientesPorNome(String nome) {
		return clienteService.buscaPorNome(nome);
	}

}
