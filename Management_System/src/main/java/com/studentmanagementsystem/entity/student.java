package com.studentmanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class student 
{
	@Id
	private String id;
	private String fname;
	private String lname;
	private String mobileno;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public student(String id, String fname, String lname, String mobileno) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobileno = mobileno;
	}
	public student() {
		super();
	}
	
	
}
