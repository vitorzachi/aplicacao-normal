package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.Cidade;

@FacesConverter(forClass = Cidade.class, value = "cidadeConverter")
public class CidadeConverter extends BaseConverter {

}
