package com.suchiit.client;

import org.hibernate.Session;

import com.suchiit.utility.SessionUtility;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=SessionUtility.getSession();
session.close();
	}

}