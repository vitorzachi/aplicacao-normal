package br.edu.unoesc.petshop.service;

import java.io.Serializable;
import java.util.List;

import br.edu.unoesc.petshop.model.BaseModel;

public interface BaseService<T extends BaseModel> extends Serializable {

	List<T> buscaTodos();

	T buscaPorCodigo(Long codigo);

	void salvarOuAlterar(T object);

	void remover(T object);

	void remover(Long codigo);

	List<T> buscaPorNome(String nome);
}
