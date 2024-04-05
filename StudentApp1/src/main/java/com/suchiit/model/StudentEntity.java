package com.suchiit.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class StudentEntity {
	@Id
	@Column(name="sno")
private int sno;
	@Column(name="sname")
private String sname;
	@Column(name="sadd")
private String sadd;


public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSadd() {
	return sadd;
}
public void setSadd(String sadd) {
	this.sadd = sadd;
}
public StudentEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public StudentEntity(int sno, String sname, String sadd) {
	super();
	this.sno = sno;
	this.sname = sname;
	this.sadd = sadd;
}

}
