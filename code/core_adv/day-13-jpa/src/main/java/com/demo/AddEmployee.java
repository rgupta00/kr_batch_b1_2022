package com.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class AddEmployee {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("kr_b1");

		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			
			Employee employee = new Employee("hari", 56000);
			em.persist(employee);
			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}

		em.close();
		emf.close();
	}

}
