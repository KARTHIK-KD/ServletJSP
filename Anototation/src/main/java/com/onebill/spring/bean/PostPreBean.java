package com.onebill.spring.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class PostPreBean {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public PostPreBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@PostConstruct
	public void init(){
		System.out.println("PostConstructor");
		
	}
	@PreDestroy
	public void destroy(){
		System.out.println("PreDestory");
		
	}
	@Override
	public String toString() {
		return "PostPreBean [id=" + id + ", name=" + name + "]";
	}
	public PostPreBean() {
		super();
	}
	

}
