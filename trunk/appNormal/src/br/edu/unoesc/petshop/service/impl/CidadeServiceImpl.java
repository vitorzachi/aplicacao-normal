package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Cidade;
import br.edu.unoesc.petshop.service.CidadeService;

@ManagedBean(name = CidadeService.NOME_BEAN)
@ApplicationScoped
public class CidadeServiceImpl extends BaseServiceImpl<Cidade> implements CidadeService {

	private static final long serialVersionUID = -1633736733048361424L;

}
