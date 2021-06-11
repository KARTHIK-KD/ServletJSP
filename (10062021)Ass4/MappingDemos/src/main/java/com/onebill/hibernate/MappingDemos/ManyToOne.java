package com.onebill.hibernate.MappingDemos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Comedience;
import com.onebill.hibernate.bean.Movie1;

public class ManyToOne {

	public static void main(String[] args) {
		Comedience c1=new Comedience();
		c1.setCid(1);
		c1.setName("Soori");
		
		Movie1 m1=new Movie1();
		m1.setMid(101);
		m1.setMname("KalaKalappu");
		
		Movie1 m2=new Movie1();
		m2.setMid(102);
		m2.setMname("Naan SririThal");
		
		Movie1 m3=new Movie1();
		m3.setMid(103);
		m3.setMname("Anegan");
		
		ArrayList<Movie1> arrayList=new ArrayList<Movie1>();
		arrayList.add(m1);
		arrayList.add(m2);
		arrayList.add(m3);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("mapping");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			transaction.begin();	
			manager.persist(c1);
			transaction.commit();
			
			System.out.println("Add Successfully");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
