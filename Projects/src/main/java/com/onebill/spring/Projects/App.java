package com.onebill.spring.Projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {	
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	Car c=(Car)context.getBean("car");
    	c.display();
    }
}
