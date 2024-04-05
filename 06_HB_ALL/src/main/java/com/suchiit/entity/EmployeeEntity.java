package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="EMPLOYEE3")
public class EmployeeEntity {

	@Id
	@Column(name="ENO")
	@GenericGenerator(name="mygenerator" ,strategy="increment")
	@GeneratedValue(strategy= GenerationType.AUTO)
	//@GenericGenerator(name="mygenerator" ,strategy="assigned")
//	@GeneratedValue(strategy= GenerationType.AUTO)
	//@GeneratedValue(strategy= GenerationType.IDENTITY)
	//@GeneratedValue(strategy= GenerationType.SEQUENCE)
    private int eno;
	@Column(name="fNAME")
	private String firstName;
	@Column(name="lNAME")
	private String lastName;
	@Column(name="EMAIL")
	private String email;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public EmployeeEntity(int eno, String firstName, String lastName, String email) {
		super();
		this.eno = eno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
}