package edu.neu.csye6200;

import java.math.BigInteger;

public class Parent  extends Person {
	
	private int parentId;
	private String email;
	private BigInteger phone;
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Parent(String firstName, String lastName,String email, BigInteger phone) {
		super(firstName, lastName);
		this.email = email;
		this.phone = phone;
	}
	

	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getPhone() {
		return phone;
	}
	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

}
