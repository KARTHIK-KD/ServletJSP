package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Director {
	@Id
	@Column
	private int did;
	@Column
	private String dname;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name = "Awards", joinColumns = @JoinColumn(name="did"),inverseJoinColumns = @JoinColumn(name ="dmid"))
	private List<DirectorsMovies> directorsMovies;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public List<DirectorsMovies> getDirectorsMovies() {
		return directorsMovies;
	}

	public void setDirectorsMovies(List<DirectorsMovies> directorsMovies) {
		this.directorsMovies = directorsMovies;
	}
	
	
	
	
	

}
