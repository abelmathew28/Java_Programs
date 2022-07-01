package com.example.demo.main;

public class User 
{
	
	private String fname;
	private String lname;
	private String address;
	private int phoneNum;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//-----------  Getters  ----------------------
	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getAddress() {
		return address;
	}
	
	public int getPhoneNum() {
		return phoneNum;
	}
	
	//-----------  Setters  ----------------------
	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}

}
