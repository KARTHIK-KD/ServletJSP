package com.onebill.hibernate.HibernateDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MaxAvgSum {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String query = "select max(salary) from Employee";
		Query q = entityManager.createQuery(query);
		String max =(String) q.getSingleResult();
		System.out.println("Maximum of salary = " + max);
		
		String query1 = "select sum(salary) from Employee";
		Query q1 = entityManager.createQuery(query1);
		String sum =(String)q1.getSingleResult();
		System.out.println("Sum of Salary = " +sum);
		
		String query2 = "select avg(salary) from Employee";
		Query q2 = entityManager.createQuery(query2);
		Double avg =(Double)q2.getSingleResult();
		System.out.println("Average of salary = " + avg);
		
	}

}
