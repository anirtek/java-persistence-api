package io.anirtek.persistence.relations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RelationsPersistenceTester {
	
	public static void main(String[] args) {
		
		EntityManagerFactory relationsEmf = Persistence.createEntityManagerFactory("anirtek-jpa");
		
		EntityManager relationsEm = relationsEmf.createEntityManager();
		
		//ONE TO ONE
		User user = new User();
		user.setFirstName("Aniruddha");
		user.setLastName("Tekade");
		
		Address addr = new Address();
		addr.setStreet("80 Chapin St");
		addr.setCity("Binghamton");
		addr.setState("New York");
		addr.setZip(13905);
		
		relationsEm.getTransaction().begin();
		relationsEm.persist(addr);
		user.setAddress(addr);
		relationsEm.persist(user);
		relationsEm.getTransaction().commit();
		
//		relationsEmf.close();
	}
}
