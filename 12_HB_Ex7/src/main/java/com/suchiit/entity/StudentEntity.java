package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student5")
public class StudentEntity {
@Id
@Column(name="id")
private int id;
@Column(name="name")
private String name;

@Column(name="email")
private String email;
@Column(name="address")
private String address;
public int getId() {
	return id;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int id, String name, String email, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.address = address;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
