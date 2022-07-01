package com.example.demo.entity;

public class Student 
{
	
	private int id;
	private String student_name;
	private int age;
	private double gpa;
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String student_name, int age, double gpa) {
		super();
		this.id = id;
		this.student_name = student_name;
		this.age = age;
		this.gpa = gpa;
	}

	// ----------------------------------------------------------

	public int getId() {
		return id;
	}
	
	public String getStudent_name() {
		return student_name;
	}
	
	public int getAge() {
		return age;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	// ----------------------------------------------------------
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
}