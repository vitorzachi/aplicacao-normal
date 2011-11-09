package br.edu.unoesc.petshop.webmodule.managedBean.app;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import br.edu.unoesc.petshop.model.Usuario;
import br.edu.unoesc.petshop.service.UsuarioService;
import br.edu.unoesc.petshop.webmodule.managedBean.BaseMB;

@ManagedBean
@ViewScoped
public class UsuarioMB extends BaseMB<Usuario, UsuarioService> {

	private static final long serialVersionUID = 920051392490481062L;
	@ManagedProperty(value = UsuarioService.EL_BEAN)
	private UsuarioService usuarioService;

	@Override
	public UsuarioService getService() {
		return usuarioService;
	}

	@Override
	@PostConstruct
	public void inicio() {
		setEntidade(new Usuario());
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

}
