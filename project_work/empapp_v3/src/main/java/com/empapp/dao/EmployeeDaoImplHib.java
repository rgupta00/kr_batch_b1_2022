package com.empapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.empapp.util.EmFactory;
@Primary
@Repository
public class EmployeeDaoImplHib implements EmployeeDao {

	private EntityManagerFactory emf;

	public EmployeeDaoImplHib() {
		emf = EmFactory.getEntityManagerFactory();
	}

	@Override
	public List<Employee> getAll() {
		EntityManager em = emf.createEntityManager();
		List<Employee> employees = em.createQuery("select e from Employee e", Employee.class).getResultList();
		em.close();
		return employees;
	}

	@Override
	public Employee getById(int id) {
		EntityManager em = emf.createEntityManager();
		Employee employees = em.find(Employee.class, id);
		em.close();
		return employees;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		try {
			tx.begin();
			em.persist(employee);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return employee;
	}

	@Override
	public Employee updateEmployee(int id, double salary) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Employee empToUpdate = null;
		try {
			tx.begin();
			empToUpdate = getById(id);
			empToUpdate.setSalary(salary);
			em.merge(empToUpdate);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return empToUpdate;
	}

	@Override
	public Employee deleteEmployee(int id) {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		Employee empToDelete = null;
		try {
			tx.begin();
			 empToDelete = em.find(Employee.class, id);
			
			em.remove(empToDelete);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return empToDelete;
	}
}
