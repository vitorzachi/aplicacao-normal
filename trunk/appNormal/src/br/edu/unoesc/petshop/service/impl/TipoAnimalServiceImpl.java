package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.TipoAnimal;
import br.edu.unoesc.petshop.service.TipoAnimalService;

@ManagedBean(name = TipoAnimalService.NOME_BEAN)
@ApplicationScoped
public class TipoAnimalServiceImpl extends BaseServiceImpl<TipoAnimal> implements TipoAnimalService {

	private static final long serialVersionUID = -9016038148400036427L;

}
