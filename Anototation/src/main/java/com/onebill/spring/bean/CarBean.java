package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class CarBean extends Engine {
	@Autowired(required=false)
	public Engine engine;
	
	
	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}


	public CarBean(Engine engine) {
		super();
		this.engine = engine;
	}


	public CarBean() {
		super();
	}

	
	public void display(){
		System.out.print("This is Car Bean ");
		engine.engineType();
	}

}
