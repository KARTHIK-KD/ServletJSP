package com.onebill.hibernate.HibernateDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Employee;

public class FindMethod {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Employee");
	    EntityManager manager = entityManagerFactory.createEntityManager();
	    String query="from Employee";
	    Query q=manager.createQuery(query);
	    List<Employee> queryResult=q.getResultList();
	    Employee[] arr=new Employee[queryResult.size()];
	    for(int i=0;i<queryResult.size();i++){
	    	arr[i]=manager.find(Employee.class,queryResult.get(i).getId());
	    }
	    for(int i=0;i<queryResult.size();i++){
	    	System.out.println("Employee name : "+arr[i].getName()+" Employee id : "+arr[i].getId());
	    }
	    
	}

}
