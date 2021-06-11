package com.onebill.hibernate.bean;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comedience {
	@Id
	@Column
	private int cid;
	@Column
	private String name;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie1 movie1;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
