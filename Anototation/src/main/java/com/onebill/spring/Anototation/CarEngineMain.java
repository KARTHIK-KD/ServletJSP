package com.onebill.spring.Anototation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.CarBean;
import com.onebill.spring.bean.CarEngineAllConfig;



public class CarEngineMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(CarEngineAllConfig.class);
		CarBean car=context.getBean(CarBean.class);
		car.display();
	}

}
