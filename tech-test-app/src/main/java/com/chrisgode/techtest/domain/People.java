package com.chrisgode.techtest.domain;

import java.io.Serializable;

public class People implements Serializable{

	private static final long serialVersionUID = 3372856998062979579L;
	private long id;
	private String firstname;
    private String surname;
    
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
