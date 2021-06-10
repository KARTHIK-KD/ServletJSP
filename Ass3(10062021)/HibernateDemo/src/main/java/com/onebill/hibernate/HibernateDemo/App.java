///Print Only Employee Names

package com.onebill.hibernate.HibernateDemo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.onebill.hibernate.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory entitymanageFactory=Persistence.createEntityManagerFactory("Employee");
        EntityManager entityManager=entitymanageFactory.createEntityManager();
        String query="from Employee";
        Query q=entityManager.createQuery(query);
        List<Employee> list=q.getResultList();
        for(Employee e:list){
        	System.out.println(e.getName());
        }
        
    }
}
