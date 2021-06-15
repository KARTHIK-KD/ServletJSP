package com.onebill.spring.Anototation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.PostPreBean;
import com.onebill.spring.bean.PostPreConfig;

public class PostPreMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(PostPreConfig.class);
		PostPreBean bean=(PostPreBean)context.getBean(PostPreBean.class);
		System.out.println(bean.toString());
		
		

	}

}
