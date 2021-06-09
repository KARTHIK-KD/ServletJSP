package com.onebill.hibernate.EmployeeDetails;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Employee;

public class JPAEmployeeDetails {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId(2);
		emp.setName("Ravi");
		emp.setSalary(12000.0);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
	    EntityManager manager = entityManagerFactory.createEntityManager();
	    EntityTransaction transaction = manager.getTransaction();
	    transaction.begin();
	    manager.persist(emp);
	    transaction.commit();
	    System.out.println("SuccessFully Inserted....");

	}

}
