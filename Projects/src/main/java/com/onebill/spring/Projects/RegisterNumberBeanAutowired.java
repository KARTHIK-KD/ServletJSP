package com.onebill.spring.Projects;

public class RegisterNumberBeanAutowired {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "RegisterNumber : "+ number;
	}
	
	

}
