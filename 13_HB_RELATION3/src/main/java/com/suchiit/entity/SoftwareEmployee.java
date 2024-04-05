package com.suchiit.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="softwareemployee1")
@AttributeOverrides({
	
@AttributeOverride(name="id",column=@Column(name="id")),
@AttributeOverride(name="name",column=@Column(name="name")),
@AttributeOverride(name="email",column=@Column(name="email")),
@AttributeOverride(name="salary",column=@Column(name="salary"))
	
	
})
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
