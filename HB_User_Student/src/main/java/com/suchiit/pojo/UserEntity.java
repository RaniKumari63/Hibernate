package com.suchiit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class UserEntity {
@Id
@Column(name="uid")
	private int uid;
@Column(name="fname")
	private String fname;
@Column(name="lname")
	private String lname;
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Column(name="email")
	private String email;
	@Column(name="mobilenumber")
	private long mobilenumber;
	@Column(name="pwd")
	private String pwd;
	public UserEntity(int uid, String fname, String lname, String email, long mobilenumber, String pwd) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.mobilenumber = mobilenumber;
		this.pwd = pwd;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
