package com.onebill.spring.Projects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudRegMain {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("StudentRegisterNumberCongif.xml");
		StudentBeanClassAutoWired s=(StudentBeanClassAutoWired)context.getBean("studentBeanClassAutoWired");
		s.setStudentName("Karthik");
		System.out.println(s);
	}

}
