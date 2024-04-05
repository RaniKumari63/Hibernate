package com.suchiit.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtility {
public static Session getSession()
{
	SessionFactory factory=new Configuration().configure("\\com\\suchiit\\config\\hibernate.cfg.xml").buildSessionFactory();

Session ses=factory.openSession();
return ses;
}
}
