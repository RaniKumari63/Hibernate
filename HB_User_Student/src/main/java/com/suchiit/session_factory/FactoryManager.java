package com.suchiit.session_factory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryManager {

	public static SessionFactory getFactoryMethod()
	{
		Configuration config=new Configuration();
		
		config.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
		
		SessionFactory sessionfactory=config.buildSessionFactory();
		
	
	  return sessionfactory;
	}

	public static void closeResources(SessionFactory sessionfactory)
	{
		
		sessionfactory.close();
	}
}
