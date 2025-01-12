package com.suchiit.StudentApp1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.model.StudentEntity;
import com.suchiit.utility.SessionUtility;



/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
	{/*
		 * Configuration cfg=new Configuration();
		 * System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
		 * System.out.println( "Hello World!" );
		 * cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
		 * System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
		 * 
		 * SessionFactory factory=cfg.buildSessionFactory();
		 * 
		 * Session ses=factory.openSession();
		 */
    	Session ses=SessionUtility.getSession();
        Transaction tx=ses.beginTransaction();
        StudentEntity stuEn=new StudentEntity();
        stuEn.setSno(11);
        stuEn.setSname("ranik");
        stuEn.setSadd("gun");
        ses.save(stuEn);
        tx.commit();
        System.out.println(ses.contains(stuEn));
        ses.evict(stuEn);
        System.out.println(ses.contains(stuEn));
        ses.close();
    }
}
