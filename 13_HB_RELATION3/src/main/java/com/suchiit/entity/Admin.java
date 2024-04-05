package com.suchiit.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="admin2")
@AttributeOverrides({
@AttributeOverride(name="id",column=@Column(name="id")),
@AttributeOverride(name="name",column=@Column(name="name")),
@AttributeOverride(name="email",column=@Column(name="email")),
@AttributeOverride(name="salary",column=@Column(name="salary"))
})
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
