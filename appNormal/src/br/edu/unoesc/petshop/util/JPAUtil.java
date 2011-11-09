package br.edu.unoesc.petshop.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory emf = null;
	private static EntityManager em = null;

	private static void createEntityManagerFactory() {
		if (emf == null) {
			emf = Persistence.createEntityManagerFactory("unitPetshop");
		}
	}

	public static EntityManager getEntityManager() {
		createEntityManagerFactory();
		if (em == null) {
			em = emf.createEntityManager();
		}
		return em;
	}

}