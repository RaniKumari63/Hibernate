package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("se")
public class SoftwareEmployee extends Employee {
 @Column(name="tool")
	private String tool;

	public String getTool() {
		return tool;
	}

	public void setTool(String tool) {
		this.tool = tool;
	}

	public SoftwareEmployee(int id, String name, String email, int salary, String tool) {
		super(id, name, email, salary);
		this.tool = tool;
	}

	public SoftwareEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SoftwareEmployee(int id, String name, String email, int salary) {
		super(id, name, email, salary);
		// TODO Auto-generated constructor stub
	}
	
}
