package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="department4")
public class DepartmentEntity {
	@Id
	@Column(name="did")
	private int did;
	@Column(name="dname")
	private String dname;
	public DepartmentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DepartmentEntity(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
}
