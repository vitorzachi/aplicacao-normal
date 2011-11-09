package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.Atividade;

@FacesConverter(forClass = Atividade.class, value = "atividadeConverter")
public class AtividadeConverter extends BaseConverter {

}
