package com.onebill.spring.Projects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentBeanClassAutoWired {
	@Autowired
	private RegisterNumberBeanAutowired rnbaw;
	private String studentName;
	
	public RegisterNumberBeanAutowired getRnbaw() {
		return rnbaw;
	}
	public void setRnbaw(RegisterNumberBeanAutowired rnbaw) {
		this.rnbaw = rnbaw;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student Name " + studentName +" "+rnbaw.toString() ;
	}
	
	

}
