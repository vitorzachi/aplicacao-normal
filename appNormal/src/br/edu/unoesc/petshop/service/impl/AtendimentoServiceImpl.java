package br.edu.unoesc.petshop.service.impl;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import br.edu.unoesc.petshop.model.Atendimento;
import br.edu.unoesc.petshop.service.AtendimentoService;

@ManagedBean(name = AtendimentoService.NOME_BEAN)
@ApplicationScoped
public class AtendimentoServiceImpl extends BaseServiceImpl<Atendimento> implements AtendimentoService {

	private static final long serialVersionUID = 8708205530147414387L;

}
