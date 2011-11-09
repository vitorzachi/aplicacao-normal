package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Cliente;
import br.edu.unoesc.petshop.service.ClienteService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class ClienteMB extends BaseMB<Cliente, ClienteService> {

	private static final long serialVersionUID = 9208251929326266490L;
	@ManagedProperty(value = ClienteService.EL_BEAN)
	private ClienteService clienteService;

	@Override
	public ClienteService getService() {
		return clienteService;
	}

	public ClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Cliente());
	}
}
