package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.CEP;

@FacesConverter(forClass = CEP.class, value = "cepConverter")
public class CepConverter extends BaseConverter {

}
