package com.suchiit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
 private static Session session;
	static 
	{
 session=new Configuration().configure("\\com\\suchiit\\config\\hibernate.cfg.xml").buildSessionFactory().openSession();
		
		
	}
	
	public static Session getSession()
	{
		return session;
	}
}
