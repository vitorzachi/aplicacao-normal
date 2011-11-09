package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.UnidadeFederativa;
import br.edu.unoesc.petshop.service.UnidadeFederativaService;

@ManagedBean(name = UnidadeFederativaService.NOME_BEAN)
@ApplicationScoped
public class UnidadeFederativaServiceImpl extends BaseServiceImpl<UnidadeFederativa> implements UnidadeFederativaService {

	private static final long serialVersionUID = 5886691787331048006L;

}
