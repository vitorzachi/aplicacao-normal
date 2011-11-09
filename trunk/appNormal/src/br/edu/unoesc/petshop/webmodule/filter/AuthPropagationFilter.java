package br.edu.unoesc.petshop.webmodule.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.unoesc.petshop.model.Usuario;

public class AuthPropagationFilter implements Filter {

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest http_req = (HttpServletRequest) req;
		HttpServletResponse http_resp = (HttpServletResponse) resp;
		HttpSession session = http_req.getSession();

		Usuario usuarioLogado = (Usuario) session.getAttribute(WebUtil.ATTR_USUARIO_LOGADO);
		if (usuarioLogado == null) {
			// tranca
		} else {
			chain.doFilter(http_req, http_resp);
			session = http_req.getSession(false);
			if (session == null) {
				session = http_req.getSession(true);
			}
			session.setAttribute(WebUtil.ATTR_USUARIO_LOGADO, usuarioLogado);
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
