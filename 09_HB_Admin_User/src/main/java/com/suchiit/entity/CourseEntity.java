package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_course")
public class CourseEntity {
	@Id
	@Column(name="iduser_course")
private int id;
	@Column(name="cname")
private String cname;
	@Column(name="cduration")
private String cduration;
	@Column(name="cfee")
private long cfee;
public CourseEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public CourseEntity(int id, String cname, String cduration, long cfee) {
	super();
	this.id = id;
	this.cname = cname;
	this.cduration = cduration;
	this.cfee = cfee;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCduration() {
	return cduration;
}
public void setCduration(String cduration) {
	this.cduration = cduration;
}
public long getCfee() {
	return cfee;
}
public void setCfee(long cfee) {
	this.cfee = cfee;
}
}
