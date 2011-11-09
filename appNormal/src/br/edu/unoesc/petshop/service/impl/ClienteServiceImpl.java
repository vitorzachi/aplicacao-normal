package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Cliente;
import br.edu.unoesc.petshop.service.ClienteService;

@ManagedBean(name = ClienteService.NOME_BEAN)
@ApplicationScoped
public class ClienteServiceImpl extends BaseServiceImpl<Cliente> implements ClienteService {

	private static final long serialVersionUID = 7622275968985353797L;

}
