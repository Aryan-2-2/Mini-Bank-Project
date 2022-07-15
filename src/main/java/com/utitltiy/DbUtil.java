package com.utitltiy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class DbUtil {

	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("AccountUnit");
	}
	
	public static EntityManager provideEntityManager() {
		
		
		return emf.createEntityManager();
		
	}
	
}
