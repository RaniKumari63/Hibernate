package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class Car extends Vehicle {
	@Column(name="carmodel")
private int carmodel;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String color, int vehicleno) {
		super(id, color, vehicleno);
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String color, int vehicleno, int carmodel) {
		super(id, color, vehicleno);
		this.carmodel = carmodel;
	}
}
