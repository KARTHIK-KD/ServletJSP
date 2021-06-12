package com.onebill.spring.Projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarEngineMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("CarEngineCoinfig.xml");
		Car c=(Car)context.getBean("car");
		System.out.println(c);

	}

}
