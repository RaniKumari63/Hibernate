package com.suchiit.utility;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
private static Session session;
public static Session getSession()
{
	Session session=new Configuration().configure("\\com\\suchiit\\config\\hibernate.cfg.xml").buildSessionFactory().openSession();
return session;	
}
}
