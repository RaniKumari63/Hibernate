package com.suchiit.SessionUtility;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionUtillity {
	private static Session session;
	public static Session getSession()
	{
		 session=new Configuration().configure("\\com\\suchiit\\config\\hibernate.cfg.xml").buildSessionFactory().openSession();
			
			return session;
	}
}
