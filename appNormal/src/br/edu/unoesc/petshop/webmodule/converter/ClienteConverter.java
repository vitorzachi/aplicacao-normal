package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.Cliente;

@FacesConverter(forClass = Cliente.class, value = "clienteConverter")
public class ClienteConverter extends BaseConverter {

}
