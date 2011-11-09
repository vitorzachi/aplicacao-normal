package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Atividade;
import br.edu.unoesc.petshop.service.AtividadeService;

@ManagedBean(name = AtividadeService.NOME_BEAN)
@ApplicationScoped
public class AtividadeServiceImpl extends BaseServiceImpl<Atividade> implements AtividadeService {

	private static final long serialVersionUID = 8290159727905871910L;

}
