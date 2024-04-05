package com.suchiit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentEntity {
@Id
@Column(name="sno")
private int sno;
@Column(name="sname")
private String sname;
@Column(name="saddr")
private String saddr;
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int sno, String sname, String saddr) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.saddr = saddr;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddr() {
	return saddr;
}
public void setSaddr(String saddr) {
	this.saddr = saddr;
}
}
