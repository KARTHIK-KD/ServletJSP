package com.onebill.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@Import({CarConfig.class,EngineConfig.class})
public class CarEngineAllConfig {
	@Bean
	public CarBean carBean(){
		return new CarBean();
		
	}
	
	@Bean
	public Engine engine(){
		return new Engine();
	}

}
