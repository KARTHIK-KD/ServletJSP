package com.onebill.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class AutoRequiredBean {
	@Autowired(required=false)
	public AutoRequiredDemo demo;
	
	public void diplay(){
		System.out.println("Atowired required Concept....");
	}

}
