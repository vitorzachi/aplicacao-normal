package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.Animal;

@FacesConverter(forClass = Animal.class, value = "animalConverter")
public class AnimalConverter extends BaseConverter {

}
