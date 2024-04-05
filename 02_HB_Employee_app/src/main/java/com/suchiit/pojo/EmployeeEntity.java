package com.suchiit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	@Id
	@Column(name="eno")
	//@GenericGenerator(name="myGenerator",strategy = "native")
	@SequenceGenerator(name="emp_generator",sequenceName = "emp_sequence_name",allocationSize=1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_generator")
	private int eno;
	@Column(name="ename")
private String ename;
	@Column(name="eaddr")
private String eaddr;
	@Column(name="edes")
private String edes;
public int getEno() {
	return eno;
}
public void setEno(int eno) {
	this.eno = eno;
}
public String getEname() {
	return ename;
}
public EmployeeEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEaddr() {
	return eaddr;
}
public void setEaddr(String eaddr) {
	this.eaddr = eaddr;
}
public String getEdes() {
	return edes;
}
public void setEdes(String edes) {
	this.edes = edes;
}
}
