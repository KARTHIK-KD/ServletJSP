package com.onebill.spring.Anototation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.AutoRequiredBean;
import com.onebill.spring.bean.AutorequiredConfig;

public class AutorequiredMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AutorequiredConfig.class);
		AutoRequiredBean bean=context.getBean(AutoRequiredBean.class);
		bean.diplay();

	}

}
