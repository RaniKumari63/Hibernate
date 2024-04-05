package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="hardwareemployee")
@PrimaryKeyJoinColumn(name="id")
public class HardwareEmployee extends Employee {
	@Column(name="wh")
private int wh;

public HardwareEmployee(int id, String name, String email, int salary, int wh) {
	super(id, name, email, salary);
	this.wh = wh;
}

public HardwareEmployee() {
	super();
	// TODO Auto-generated constructor stub
}

public HardwareEmployee(int id, String name, String email, int salary) {
	super(id, name, email, salary);
	// TODO Auto-generated constructor stub
}
}
