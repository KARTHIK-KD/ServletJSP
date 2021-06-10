package com.onebill.hibernate.HibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

public class getReferenceMethodDemo {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Employee employee=entityManager.getReference(Employee.class, 1);
		System.out.println(employee.getName());
	}
}
