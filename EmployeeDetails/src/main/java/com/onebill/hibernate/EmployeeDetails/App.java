package com.onebill.hibernate.EmployeeDetails;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.onebill.hibernate.bean.Employee;

public class App 
{
    public static void main( String[] args )
    {
        Employee emp=new Employee();
        emp.setId(1);
        emp.setName("karthik");
        emp.setSalary(28000.00);
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Employee.class);
        SessionFactory factory=con.buildSessionFactory();
        Session session=factory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(emp);
        System.out.println("Successfully");
        transaction.commit();
        session.close();
        
    }
}
