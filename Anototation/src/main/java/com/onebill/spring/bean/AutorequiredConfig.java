package com.onebill.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutorequiredConfig {
	@Bean
	public AutoRequiredBean autoRequiredBean(){
		return new AutoRequiredBean();
	}

}
