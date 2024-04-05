package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("bus")
public class Bus extends Vehicle {
	@Column(name="bustype")
private String bustype;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String color, int vehicleno) {
		super(id, color, vehicleno);
		// TODO Auto-generated constructor stub
	}

	public Bus(int id, String color, int vehicleno, String bustype) {
		super(id, color, vehicleno);
		this.bustype = bustype;
	}

}
