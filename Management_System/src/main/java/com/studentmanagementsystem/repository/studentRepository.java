package com.studentmanagementsystem.repository;

import org.springframework.data.repository.CrudRepository;

import com.studentmanagementsystem.entity.student;

public interface studentRepository extends CrudRepository<student, String>
{

}
