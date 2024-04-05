package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="admin")
@PrimaryKeyJoinColumn(name="id")
public class Admin extends Employee {
	@Column(name="branchname")
private String branchname;

public Admin(int id, String name, String email, int salary, String branchname) {
		super(id, name, email, salary);
		this.branchname = branchname;
	}

public String getBranchname() {
	return branchname;
}

public void setBranchname(String branchname) {
	this.branchname = branchname;
}

public Admin() {
	super();
	// TODO Auto-generated constructor stub
}

public Admin(int id, String name, String email, int salary) {
	super(id, name, email, salary);
	// TODO Auto-generated constructor stub
}

}
