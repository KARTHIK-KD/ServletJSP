package com.onebill.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfig {
	@Bean
	public Animal animal1(){
		Animal cat=new CatBean();
		return cat;
	}
	
	@Bean
	public Animal animal2(){
		Animal dog=new DogBean();
		return dog;
	}
	
	@Bean
	public Animal animal3(){
		Animal horse=new HorseBean();
		return horse;
	}

}
