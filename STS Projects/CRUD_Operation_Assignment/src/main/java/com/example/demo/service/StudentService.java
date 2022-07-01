package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepo;
	
	public List<Student> getAll() 
	{
		return studentRepo.getAll();
	}

	public String add(Student stud) {

		return studentRepo.add(stud);
		
	}

	public String edit(Student stud) {
		return studentRepo.edit(stud);
	}

	public String delete(int studentNum) {

		return studentRepo.delete(studentNum); 
	}

}