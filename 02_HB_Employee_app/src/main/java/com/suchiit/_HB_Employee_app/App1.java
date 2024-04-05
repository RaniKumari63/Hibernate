package com.suchiit._HB_Employee_app;

import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.EmployeeEntity;

public class App1 {

	
	    public static void main( String[] args )
	    {
	        Configuration cfg=new Configuration();
	        cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session ses=factory.openSession();
	        org.hibernate.Transaction tx=ses.beginTransaction();
	        CriteriaBuilder builder=ses.getCriteriaBuilder();
	        
	    }
}
