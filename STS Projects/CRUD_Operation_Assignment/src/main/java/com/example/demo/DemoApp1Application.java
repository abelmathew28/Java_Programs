package com.example.demo;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApp1Application implements CommandLineRunner{


	@Autowired
	StudentRepository studentrepo;

	@Override
	public void run(String... args) throws Exception
	{
		Student s1 = new Student(1, "Abel", 22, 3.5);
		Student s2 = new Student(2, "John", 20, 3.9);
		
		studentrepo.student.addAll(Arrays.asList(s1, s2));

	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApp1Application.class, args);
	}

}
