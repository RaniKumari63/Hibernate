package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="vehicle1")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="vehicle")
public class Vehicle {
	@Id
	@Column(name="id")
private int id;
	@Column(name="color")
private String color;
	@Column(name="vehicleno")
private int vehicleno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getVehicleno() {
	return vehicleno;
}
public void setVehicleno(int vehicleno) {
	this.vehicleno = vehicleno;
}
public Vehicle(int id, String color, int vehicleno) {
	super();
	this.id = id;
	this.color = color;
	this.vehicleno = vehicleno;
}
public Vehicle() {
	super();
	// TODO Auto-generated constructor stub
}

}
