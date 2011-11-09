package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.TipoAnimal;

@FacesConverter(forClass = TipoAnimal.class, value = "tipoAnimalConverter")
public class TipoAnimalConverter extends BaseConverter {

}
