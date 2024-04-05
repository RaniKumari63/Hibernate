package com.suchiit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee10")
public class Employee {
	@Id
private Long id;
private String empFirstName;
private String empLastName;
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public Employee(Long id, String empFirstName, String empLastName) {
	super();
	this.id = id;
	this.empFirstName = empFirstName;
	this.empLastName = empLastName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getEmpFirstName() {
	return empFirstName;
}
public void setEmpFirstName(String empFirstName) {
	this.empFirstName = empFirstName;
}
public String getEmpLastName() {
	return empLastName;
}
public void setEmpLastName(String empLastName) {
	this.empLastName = empLastName;
}
}
