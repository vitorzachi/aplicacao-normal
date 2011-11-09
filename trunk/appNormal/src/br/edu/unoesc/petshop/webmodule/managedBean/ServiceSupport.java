package br.edu.unoesc.petshop.webmodule.managedBean;

import javax.faces.bean.ManagedProperty;

import br.edu.unoesc.petshop.service.AnimalService;
import br.edu.unoesc.petshop.service.AtendimentoService;
import br.edu.unoesc.petshop.service.AtividadeService;
import br.edu.unoesc.petshop.service.CepService;
import br.edu.unoesc.petshop.service.CidadeService;
import br.edu.unoesc.petshop.service.ClienteService;
import br.edu.unoesc.petshop.service.EmpresaService;
import br.edu.unoesc.petshop.service.TipoAnimalService;
import br.edu.unoesc.petshop.service.UnidadeFederativaService;
import br.edu.unoesc.petshop.service.UsuarioService;

public abstract class ServiceSupport {
	@ManagedProperty(value = AnimalService.EL_BEAN)
	protected AnimalService animalService;

	@ManagedProperty(value = AtendimentoService.EL_BEAN)
	protected AtendimentoService atendimentoService;

	@ManagedProperty(value = AtividadeService.EL_BEAN)
	protected AtividadeService atividadeService;

	@ManagedProperty(value = CepService.EL_BEAN)
	protected CepService cepService;

	@ManagedProperty(value = UsuarioService.EL_BEAN)
	protected UsuarioService usuarioService;

	@ManagedProperty(value = EmpresaService.EL_BEAN)
	protected EmpresaService empresaService;

	@ManagedProperty(value = ClienteService.EL_BEAN)
	protected ClienteService clienteService;

	@ManagedProperty(value = CidadeService.EL_BEAN)
	protected CidadeService cidadeService;

	@ManagedProperty(value = TipoAnimalService.EL_BEAN)
	protected TipoAnimalService tipoAnimalService;

	@ManagedProperty(value = UnidadeFederativaService.EL_BEAN)
	protected UnidadeFederativaService unidadeFederativaService;

	// = getters and setters ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public AnimalService getAnimalService() {
		return animalService;
	}

	public void setAnimalService(AnimalService animalService) {
		this.animalService = animalService;
	}

	public AtendimentoService getAtendimentoService() {
		return atendimentoService;
	}

	public void setAtendimentoService(AtendimentoService atendimentoService) {
		this.atendimentoService = atendimentoService;
	}

	public AtividadeService getAtividadeService() {
		return atividadeService;
	}

	public void setAtividadeService(AtividadeService atividadeService) {
		this.atividadeService = atividadeService;
	}

	public CepService getCepService() {
		return cepService;
	}

	public void setCepService(CepService cepService) {
		this.cepService = cepService;
	}

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public EmpresaService getEmpresaService() {
		return empresaService;
	}

	public void setEmpresaService(EmpresaService empresaService) {
		this.empresaService = empresaService;
	}

	public ClienteService getClienteService() {
		return clienteService;
	}

	public void setClienteService(ClienteService clienteService) {
		this.clienteService = clienteService;
	}

	public CidadeService getCidadeService() {
		return cidadeService;
	}

	public void setCidadeService(CidadeService cidadeService) {
		this.cidadeService = cidadeService;
	}

	public TipoAnimalService getTipoAnimalService() {
		return tipoAnimalService;
	}

	public void setTipoAnimalService(TipoAnimalService tipoAnimalService) {
		this.tipoAnimalService = tipoAnimalService;
	}

	public UnidadeFederativaService getUnidadeFederativaService() {
		return unidadeFederativaService;
	}

	public void setUnidadeFederativaService(UnidadeFederativaService unidadeFederativaService) {
		this.unidadeFederativaService = unidadeFederativaService;
	}
}
