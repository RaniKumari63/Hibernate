package com.suchiit.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student3")
public class StudentEntity {
	@Id
	@Column(name="sid")
private int id;
	@Column(name="semail")
private String email;
	@Column(name="sname")
private String name;
	@Column(name="smarks")
private int marks;
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int id, String email, String name, int marks) {
	super();
	this.id = id;
	this.email = email;
	this.name = name;
	this.marks = marks;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
}
