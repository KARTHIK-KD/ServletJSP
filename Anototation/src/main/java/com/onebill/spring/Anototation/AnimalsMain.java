package com.onebill.spring.Anototation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.onebill.spring.bean.AnimalConfig;
import com.onebill.spring.bean.CatBean;
import com.onebill.spring.bean.DogBean;
import com.onebill.spring.bean.HorseBean;

public class AnimalsMain {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(AnimalConfig.class);
		
		CatBean cat=context.getBean(CatBean.class);
		cat.eat();
		cat.speak();
		
		DogBean dog=context.getBean(DogBean.class);
		dog.eat();
		dog.speak();
		
		HorseBean horse=context.getBean(HorseBean.class);
		horse.eat();
		horse.speak();

	}

}
