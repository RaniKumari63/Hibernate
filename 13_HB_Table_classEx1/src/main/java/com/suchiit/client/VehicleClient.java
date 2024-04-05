package com.suchiit.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.utility.SessionUtility;

public class VehicleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=SessionUtility.getSession();
Transaction tx=session.beginTransaction();
	}

}
