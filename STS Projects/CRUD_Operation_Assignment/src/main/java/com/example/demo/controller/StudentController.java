package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController 
{
	@Autowired
	StudentService studService;
	
	@GetMapping("/get/all")
	public List<Student> getAll()
	{
		return studService.getAll();
	}
	
	/*
	@GetMapping("/add")
	public String getAll(@RequestBody Student stud)
	{
		return studService.add(stud);
	}
	
	*/
	
	@PostMapping("/add")
	public String getAll(@RequestBody Student stud)
	{
		return studService.add(stud);
	}
	
	@PutMapping("/edit")
	public String edit(@RequestBody Student stud)
	{
		return studService.edit(stud);
	}
	
	@DeleteMapping("/delete")
	public String delete(@RequestParam int studentNum)
	{
		return studService.delete(studentNum);
	}
}
