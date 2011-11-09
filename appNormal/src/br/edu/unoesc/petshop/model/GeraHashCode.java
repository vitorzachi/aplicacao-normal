package br.edu.unoesc.petshop.model;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class GeraHashCode {
	private static HashCodeBuilder hb;

	public GeraHashCode(Object... params) {
		hb = new HashCodeBuilder(123765, 765871);
		for (int i = 0; i < params.length; i++) {
			hb.append(params[i]);
		}
	}

	public int getHashCode() {
		if (hb != null) {
			return hb.toHashCode();
		} else {
			throw new IllegalAccessError("vc deve dar um new na classe GeraHashCode...");
		}
	}
}
