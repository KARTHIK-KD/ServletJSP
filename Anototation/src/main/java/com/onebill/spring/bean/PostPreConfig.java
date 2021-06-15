package com.onebill.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostPreConfig {
	@Bean
	public PostPreBean postPreBean(){
		return new PostPreBean(1,"karthik");
	}
	

}
