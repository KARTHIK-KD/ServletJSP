package com.onebill.hibernate.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Movies {
	@Id
	@Column
	private int mid;
	@Column
	
	private String mname;
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	public Heroin getHeroin() {
		return heroin;
	}
	public void setHeroin(Heroin heroin) {
		this.heroin = heroin;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	private Heroin heroin;
}
