package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course4")
public class CourseEntity {
	@Id
	@Column(name="cid")
private int cid;
	@Column(name="cname")
private String cname;
	@Column(name="cfee")
private int cfee;
public CourseEntity(int cid, String cname, int cfee) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cfee = cfee;
}
public CourseEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public int getCfee() {
	return cfee;
}
public void setCfee(int cfee) {
	this.cfee = cfee;
}
}
