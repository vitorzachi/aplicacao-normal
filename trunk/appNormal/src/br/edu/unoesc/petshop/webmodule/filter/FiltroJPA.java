package br.edu.unoesc.petshop.webmodule.filter;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import br.edu.unoesc.petshop.util.JPAUtil;

@WebFilter(servletNames = ("Faces Servlet"))
public class FiltroJPA implements Filter {

	private EntityManager entityManager;

	@Override
	public void destroy() {
		this.entityManager.close();
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

		try {
			if (!entityManager.getTransaction().isActive()) {
				entityManager.getTransaction().begin();
			}
			chain.doFilter(request, response);

			if (!entityManager.getTransaction().isActive()) {
				entityManager.flush();
				entityManager.getTransaction().commit();
			}
		} catch (Exception e) {
			if (entityManager.getTransaction().isActive()) {
				try {
					entityManager.getTransaction().rollback();
				} catch (Exception e2) {
					System.out.println("*** failed to rollback");
				}
			}
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		this.entityManager = JPAUtil.getEntityManager();
	}

}
