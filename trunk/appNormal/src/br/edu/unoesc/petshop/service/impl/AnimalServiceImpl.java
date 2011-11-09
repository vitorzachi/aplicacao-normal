package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Animal;
import br.edu.unoesc.petshop.service.AnimalService;

@ManagedBean(name = AnimalService.NOME_BEAN)
@ApplicationScoped
public class AnimalServiceImpl extends BaseServiceImpl<Animal> implements AnimalService {

	private static final long serialVersionUID = -1369384318403432250L;

}
