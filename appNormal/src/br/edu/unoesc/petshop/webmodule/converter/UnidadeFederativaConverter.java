package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.UnidadeFederativa;

@FacesConverter(forClass = UnidadeFederativa.class, value = "unidadeFederativaConverter")
public class UnidadeFederativaConverter extends BaseConverter {

}
