package com.example.demo.repository;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

@Repository
public class StudentRepository 
{
	
	public List<Student> student = new ArrayList<Student>();

	public List<Student> getAll() 
	{
		return student;
	}

	public String add(Student stud) {
		
		 student.add(stud);
		return "Added the student in the list";
	}

	public String edit(Student stud) {

		student.stream().filter(s -> s.getId() == stud.getId()).forEach(s -> {
			s.setStudent_name(stud.getStudent_name());
			s.setAge(stud.getAge());
			s.setGpa(stud.getGpa());
		});
		
		return "Updated the data";
	}

	public String delete(int studentNum) {
		student.remove(studentNum - 1);
		return "Student Deleted";
	}
	
	
}
