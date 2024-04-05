package com.suchiit.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {
	@Id
private Long id;
@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + "]";
	}
public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
public Address(Long id, String street, String city) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
	}
public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
private String street;
private String city;
}
