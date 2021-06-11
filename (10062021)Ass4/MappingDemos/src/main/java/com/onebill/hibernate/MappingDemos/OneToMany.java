package com.onebill.hibernate.MappingDemos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Heroin;
import com.onebill.hibernate.bean.Movies;

public class OneToMany {

	public static void main(String[] args) {
		Heroin h1=new Heroin();
		h1.setHid(1);
		h1.setHname("Dhamana");
		
		Movies m1=new Movies();
		m1.setMid(101);
		m1.setMname("Action");
		
		Movies m2=new Movies();
		m2.setMid(102);
		m2.setMname("Dhola");
		
		ArrayList<Movies> arrayList=new ArrayList<Movies>();
		arrayList.add(m1);
		arrayList.add(m2);
		
		h1.setMovies(arrayList);
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("mapping");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			transaction.begin();	
			manager.persist(h1);
			transaction.commit();
			
			System.out.println("Add Successfully");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
