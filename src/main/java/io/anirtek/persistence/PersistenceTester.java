package io.anirtek.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import io.anirtek.persistence.entity.Employee;

public class PersistenceTester {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("anirtek-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		/**
		 * Create one object
		 */
		Employee emp = new Employee();
		emp.setFirstName("aniruddha");
		emp.setLastName("tekade");
		emp.setEmail("atekade1@binghamton.edu");
		emp.setCity("New York");
		
		/**
		 * Now let's write this object into the database of MySQL
		 */
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();
		
		em.close();
		
		emf.close();
	}

}
