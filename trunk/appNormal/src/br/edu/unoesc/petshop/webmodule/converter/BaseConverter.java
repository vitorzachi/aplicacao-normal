package br.edu.unoesc.petshop.webmodule.converter;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import br.edu.unoesc.petshop.model.BaseModel;

public class BaseConverter implements Converter {

	public Object getAsObject(FacesContext ctx, UIComponent component, String value) {
		if (value != null) {
			return this.getAttributesFrom(component).get(value);
		}
		return null;
	}

	public String getAsString(FacesContext ctx, UIComponent component, Object value) {
		if (value != null && !"".equals(value)) {
			BaseModel entity = (BaseModel) value;
			this.addAttribute(component, entity);
			Long codigo = entity.getCodigo();
			if (codigo != null) {
				return String.valueOf(codigo);
			}
		}
		return value.toString();
	}

	protected void addAttribute(UIComponent component, BaseModel entity) {
		if (entity != null && entity.getCodigo() != null) {
			String chave = entity.getCodigo().toString();
			this.getAttributesFrom(component).put(chave, entity);
		}
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}

}