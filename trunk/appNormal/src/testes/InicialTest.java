package testes;

import javax.faces.bean.ManagedProperty;

import org.junit.Test;

import br.edu.unoesc.petshop.model.UnidadeFederativa;
import br.edu.unoesc.petshop.service.UnidadeFederativaService;

public class InicialTest {

	@ManagedProperty(value = UnidadeFederativaService.EL_BEAN)
	private UnidadeFederativaService unidadeFederativaService;

	@Test
	public void teste() {
		UnidadeFederativa uf = new UnidadeFederativa();
		uf.setNome("uma uf");
		uf.setSigla("si");
	}

	public UnidadeFederativaService getUnidadeFederativaService() {
		return unidadeFederativaService;
	}

	public void setUnidadeFederativaService(UnidadeFederativaService unidadeFederativaService) {
		this.unidadeFederativaService = unidadeFederativaService;
	}

}
