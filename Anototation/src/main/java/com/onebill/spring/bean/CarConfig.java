package com.onebill.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	
	@Bean
	public CarBean carBean(){
		return new CarBean();
		
	}
	

}
