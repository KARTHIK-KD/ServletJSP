package com.onebill.hibernate.bean;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Heroin {
	@Id
	@Column
	private int hid;
	@Column
	private String hname;
	
	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}
	
	
	public Collection<Movies> getMovies() {
		return movies;
	}

	public void setMovies(Collection<Movies> movies) {
		this.movies = movies;
	}


	@OneToMany(cascade=CascadeType.ALL,mappedBy="heroin")
	private Collection<Movies> movies=new ArrayList<Movies>();
	
	

}
