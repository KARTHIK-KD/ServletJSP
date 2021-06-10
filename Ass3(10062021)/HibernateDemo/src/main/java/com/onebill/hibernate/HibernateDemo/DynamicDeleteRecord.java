package com.onebill.hibernate.HibernateDemo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DynamicDeleteRecord {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Employee");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String query="delete from Employee where id=:empid";
		Query q=entityManager.createQuery(query);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employee ID : ");
		int id=scan.nextInt();
		q.setParameter("empid",id);
		q.executeUpdate();
		entityTransaction.commit();
		System.out.println("Deleted Successfully");

	}

}
