package com.onebill.spring.Projects;

import org.springframework.util.SocketUtils;

public class HelloworldSSSingleton {
	private String message;
	

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	public void display()
	{
		System.out.println(message);
	}
	
	

}
