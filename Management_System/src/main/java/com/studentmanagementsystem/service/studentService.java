package com.studentmanagementsystem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentmanagementsystem.entity.student;
import com.studentmanagementsystem.repository.studentRepository;

@Service
public class studentService 
{
	@Autowired
	public studentRepository repo;
	
	public List<student> getAllStudent()
	{
		List<student> student = new ArrayList<>();
		repo.findAll().forEach(student::add);
		return student;
	}

	public void addStudent(student student)
	{
		repo.save(student);
	}

	public void updateStudent(student student, String id) 
	{
		repo.save(student);	
	}

	public void deleteStudent(String id) 
	{
		repo.deleteById(id);	
	}
}
