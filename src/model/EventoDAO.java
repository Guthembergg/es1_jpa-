package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import utils.JpaUtil;

public class EventoDAO {
	 static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	 static EntityManager em= emf.createEntityManager();
	 
	public static void addEvento(Evento e) {
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		System.out.println("Evento salvato!");
	}

	public static Evento findEvento(Long id) {
		em.getTransaction().begin();
		Evento e = em.find(Evento.class, id);
		em.getTransaction().commit();
		return e;
	}

	public static void updateEvento(Evento e) {
		em.getTransaction().begin();
		em.merge(e);
		em.getTransaction().commit();
		System.out.println("Evento modificato:" + findEvento(e.getId()));
	}

	public static void removeEvento(Evento e ) {
		em.getTransaction().begin();
		em.remove(e);
		em.getTransaction().commit();
		System.out.println("Evento rimosso:" + findEvento(e.getId()));
	}

	public static List<Evento> findAll() {
		Query q = em.createNamedQuery("User.findAll");
		return q.getResultList();
	}

}
