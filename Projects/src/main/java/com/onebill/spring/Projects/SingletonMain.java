package com.onebill.spring.Projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Singleton.xml");
		HelloworldSSSingleton h1=(HelloworldSSSingleton)context.getBean("hello");
		h1.setMessage("Karthik");
		h1.display();
		HelloworldSSSingleton h2=(HelloworldSSSingleton)context.getBean("hello");
		h2.display();
	}

}
