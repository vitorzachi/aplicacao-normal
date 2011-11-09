package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Empresa;
import br.edu.unoesc.petshop.service.EmpresaService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class EmpresaMB extends BaseMB<Empresa, EmpresaService> {

	private static final long serialVersionUID = 7549071706464179167L;
	@ManagedProperty(value = EmpresaService.EL_BEAN)
	private EmpresaService empresaService;

	@Override
	public EmpresaService getService() {
		return empresaService;
	}

	public EmpresaService getEmpresaService() {
		return empresaService;
	}

	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Empresa());
	}
}
