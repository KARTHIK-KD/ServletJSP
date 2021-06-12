package com.onebill.spring.Projects;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainBeanFactory {

	public static void main(String[] args) {
		BeanFactory bf = new ClassPathXmlApplicationContext("SpringBf.xml");
		TriangleBeanFactory t=(TriangleBeanFactory) bf.getBean("traingle");
		t.display();
	}

}
