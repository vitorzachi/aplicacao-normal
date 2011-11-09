package br.edu.unoesc.petshop.model;

import org.apache.commons.lang.builder.EqualsBuilder;

public class GeraEquals {

	private static EqualsBuilder eq;

	public GeraEquals(Object... params) {
		eq = new EqualsBuilder();
		if (params.length % 2 != 0) {
			throw new IllegalArgumentException("equals é baseado em dois valores. então você deve passar um número par de parâmetros.");
		}
		for (int i = 0; i < params.length; i += 2) {
			eq.append(params[i], params[i + 1]);
		}
	}

	public boolean ehIgual() {
		if (eq != null) {
			return eq.isEquals();
		}
		return false;
	}
}
