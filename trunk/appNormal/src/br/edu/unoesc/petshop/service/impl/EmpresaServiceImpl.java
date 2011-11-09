package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Empresa;
import br.edu.unoesc.petshop.service.EmpresaService;

@ManagedBean(name = EmpresaService.NOME_BEAN)
@ApplicationScoped
public class EmpresaServiceImpl extends BaseServiceImpl<Empresa> implements EmpresaService {

	private static final long serialVersionUID = -197815452462299770L;

}
