package br.edu.unoesc.petshop.webmodule.converter;

import javax.faces.convert.FacesConverter;

import br.edu.unoesc.petshop.model.Usuario;

@FacesConverter(forClass = Usuario.class, value = "usuarioConverter")
public class UsuarioConverter extends BaseConverter {

}
