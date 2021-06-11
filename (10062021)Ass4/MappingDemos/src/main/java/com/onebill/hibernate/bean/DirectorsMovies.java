package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class DirectorsMovies {
	@Id
	@Column
	private int dmid;
	@Column
	private String dmname;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="DirectorsMovies")
	private List<Director> director;

	public int getDmid() {
		return dmid;
	}

	public void setDmid(int dmid) {
		this.dmid = dmid;
	}

	public String getDmname() {
		return dmname;
	}

	public void setDmname(String dmname) {
		this.dmname = dmname;
	}

	public List<Director> getDirector() {
		return director;
	}

	public void setDirector(List<Director> director) {
		this.director = director;
	}
	
	
}
