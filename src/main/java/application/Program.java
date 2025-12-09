package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import domain.Person;

public class Program {

	public static void main(String[] args) {
		
		// Creates EntityManager to make DB operations
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("example-jpa");
		EntityManager em = emf.createEntityManager();
			
		/* Start operation
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		// End operation
		em.getTransaction().commit();
		*/
		
		/*
		// Search by Id
		Person p = em.find(Person.class, 2);
		
		System.out.println(p);
		*/
		
		// Remove operation works only with attached/monitored instances 
		// attached/monitored instance = instantiated or priorly requested instance
		Person p = em.find(Person.class, 3);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Operation complete!");
		em.close();
		emf.close();
	}
}
