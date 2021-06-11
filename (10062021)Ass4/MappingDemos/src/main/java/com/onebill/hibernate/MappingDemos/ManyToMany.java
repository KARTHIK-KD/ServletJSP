package com.onebill.hibernate.MappingDemos;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Director;
import com.onebill.hibernate.bean.DirectorsMovies;

public class ManyToMany {

	public static void main(String[] args) {
		Director d1=new Director();
		d1.setDid(1);
		d1.setDname("Sankar");
		
		Director d2=new Director();
		d2.setDid(2);
		d2.setDname("Siva");
		
		DirectorsMovies dm1=new DirectorsMovies();
		dm1.setDmid(101);
		dm1.setDmname("2.0");

		DirectorsMovies dm2=new DirectorsMovies();
		dm2.setDmid(102);
		dm2.setDmname("Siruthai");
		
		ArrayList<Director> arrayList=new ArrayList<Director>();
		arrayList.add(d1);
		arrayList.add(d2);
		
		dm1.setDirector(arrayList);
		dm1.setDirector(arrayList);
		
		ArrayList<DirectorsMovies> arrayList1=new ArrayList<DirectorsMovies>();
		arrayList1.add(dm1);
		arrayList1.add(dm2);
		
		d1.setDirectorsMovies(arrayList1);
		d1.setDirectorsMovies(arrayList1);
		
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("mapping");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			transaction.begin();	
			manager.persist(d1);
			transaction.commit();
			
			System.out.println("Add Successfully");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
