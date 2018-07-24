package io.anirtek.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import io.anirtek.persistence.entity.Employee;

public class PersistenceTester {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("anirtek-jpa");
		
		EntityManager em = emf.createEntityManager();
		
		//INSERT INTO action
		Employee emp = new Employee();
		emp.setFirstName("Mayank");
		emp.setLastName("Jain");
		emp.setEmail("mjain8@binghamton.edu");
		emp.setCity("San Francisco");
		
		em.getTransaction().begin();
		em.persist(emp);
		em.getTransaction().commit();

		
		em.close();
		
//		emf.close();
	}
}
