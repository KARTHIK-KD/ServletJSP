package com.onebill.hibernate.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Movie1 {
	@Id
	@Column
	private int mid;
	@Column
	private String mname;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="Movie1")
	@JoinColumn(name ="cid")
	private List<Comedience> comedience;

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

	public List<Comedience> getComedience() {
		return comedience;
	}

	public void setComedience(List<Comedience> comedience) {
		this.comedience = comedience;
	}

	
}
