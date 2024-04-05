package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee105")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class Employee {
	@Id
	
	@Column(name="id")
private int id;
	@Column(name="name")
private String name;
	@Column(name="email")
private String email;
	@Column(name="salary")
private int salary;
public int getId() {
	return id;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Employee(int id, String name, String email, int salary) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.salary = salary;
}
public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

}
