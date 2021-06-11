package com.onebill.hibernate.MappingDemos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.onebill.hibernate.bean.Hero;
import com.onebill.hibernate.bean.Movie;

public class OneToOne {

	public static void main(String[] args) {
		Hero h1=new Hero();
		h1.setHid(1);
		h1.setHname("Vijay");
		
		Movie m1=new Movie();
		m1.setMid(101);
		m1.setMname("Killi");
		
		m1.setHero(h1);
		EntityManagerFactory factory = null;
		EntityManager manager = null;
		
		try {
			factory = Persistence.createEntityManagerFactory("mapping");
			manager = factory.createEntityManager();
			EntityTransaction transaction = manager.getTransaction();
			
			transaction.begin();	
			manager.persist(m1);
			transaction.commit();
			
			System.out.println("Add Successfully");
		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

/*package com.onebill.hibernate.mappings;
​
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
​
import com.onebill.hibernate.bean.Cart;
import com.onebill.hibernate.bean.Item;
​
*//**
 * @author Rathesh Prabakar
 *
 *//*
public class OneToOneMappings {
​
	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cart c = new Cart();
	c.setCid(5);
	c.setCname("cart 5");
	
	Item i = new Item();
	i.setId(105);
	i.setItemname("Trouser");
	
	i.setCart(c);
	//c.setItem(i);
	
	EntityManagerFactory factory = null;
	EntityManager manager = null;
	
	try {
		factory = Persistence.createEntityManagerFactory("mapping");
		manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		transaction.begin();	
		manager.persist(i);
		transaction.commit();
		
		System.out.println("Added");
	
		
	} catch (Exception e) {
		// TODO: handle exception
	}
​
	}
​
}*/