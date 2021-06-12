package com.onebill.spring.Projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car extends Engine  {
	@Autowired
	public Engine engine;
	

	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public void display(){
		System.out.println("Car"+engine);
	}
	
	

}
