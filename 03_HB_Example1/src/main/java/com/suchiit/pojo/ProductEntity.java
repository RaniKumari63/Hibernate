package com.suchiit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

public class ProductEntity {

private int pid;

private String pname;

private int pqty;

private int pprice;
public ProductEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public ProductEntity(int pid, String pname, int pqty, int pprice) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.pqty = pqty;
	this.pprice = pprice;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public int getPqty() {
	return pqty;
}
public void setPqty(int pqty) {
	this.pqty = pqty;
}
public int getPprice() {
	return pprice;
}
public void setPprice(int pprice) {
	this.pprice = pprice;
}
}
