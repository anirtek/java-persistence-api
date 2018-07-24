package io.anirtek.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import io.anirtek.persistence.entity.Employee;

public class PersistenceTester {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("anirtek-jpa");

		EntityManager em = emf.createEntityManager();

		// INSERT INTO action
		// Employee emp = new Employee();
		// emp.setFirstName("Mayank");
		// emp.setLastName("Jain");
		// emp.setEmail("mjain8@binghamton.edu");
		// emp.setCity("San Francisco");
		//
		// em.getTransaction().begin();
		// em.persist(emp);
		// em.getTransaction().commit();

		// FIND BY ID
		// Employee emp = em.find(Employee.class,
		// "a13f3cb4-0530-4e2e-b7c0-dbfc75953426");
		// Employee emp = em.find(Employee.class, "a13f3cb4dbfc75953426");
		// System.out.println(emp.toString());

		// UPDATE BY ID
		// Employee emp = em.find(Employee.class,
		// "a13f3cb4-0530-4e2e-b7c0-dbfc75953426");
		// emp.setFirstName("Jack");
		// emp.setLastName("Sparrow");
		// emp.setEmail("jsparrow@binghamton.edu");
		// emp.setCity("Los Angeles");
		//
		// em.getTransaction().begin();
		// em.merge(emp);
		// em.getTransaction().commit();

		// DELETE
		// Employee emp = em.find(Employee.class,
		// "a13f3cb4-0530-4e2e-b7c0-dbfc75953426");
		// if (emp != null) {
		// em.getTransaction().begin();
		// em.remove(emp);
		// em.getTransaction().commit();
		// }

		// FIND ALL
		// TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e",
		// Employee.class);
		// List<Employee> employees = query.getResultList();
		// System.out.println(employees);
		
		//FIND BY EMAIL
		TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e where e.email=:pEmail", Employee.class); //pEmail is just a name used
		query.setParameter("pEmail", "atekade1@binghamton.edu");
		List<Employee> employees = query.getResultList();
		System.out.println(employees);
		
		em.close();
		emf.close();
	}
}
