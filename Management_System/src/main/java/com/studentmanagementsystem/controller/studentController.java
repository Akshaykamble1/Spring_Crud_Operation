package com.studentmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.studentmanagementsystem.entity.student;
import com.studentmanagementsystem.service.studentService;

@RestController
public class studentController 
{
	@Autowired
	public studentService service;
	
	@RequestMapping("/student")
	public List<student> getAllStudent()
	{
		return service.getAllStudent();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/student")
	public void addStudent(@RequestBody student student)
	{
		service.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/student/{id}")
	public void updateStudent(@RequestBody student student, @PathVariable String id)
	{
		service.updateStudent(student,id);
	}
	
	public void deleteStudent(@PathVariable String id)
	{
		service.deleteStudent(id);
	}
}
