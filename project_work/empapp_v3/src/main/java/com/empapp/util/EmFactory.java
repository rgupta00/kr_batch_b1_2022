package com.empapp.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmFactory {
	
	private static EntityManagerFactory emf;
	
	public static EntityManagerFactory getEntityManagerFactory() {
		emf=Persistence.createEntityManagerFactory("kr_b1");
		return emf;
	}
}
