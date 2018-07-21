package io.anirtek.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceTester {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("anirtek-jpa");
		
		emf.close();
	}

}
