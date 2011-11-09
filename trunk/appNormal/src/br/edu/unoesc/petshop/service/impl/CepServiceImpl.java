package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.CEP;
import br.edu.unoesc.petshop.service.CepService;

@ManagedBean(name = CepService.NOME_BEAN)
@ApplicationScoped
public class CepServiceImpl extends BaseServiceImpl<CEP> implements CepService {

	private static final long serialVersionUID = -2286977961283177634L;

}
