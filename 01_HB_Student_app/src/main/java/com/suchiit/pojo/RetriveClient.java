package com.suchiit.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RetriveClient {

	public static void main(String args[])
	{
		
		Configuration cfg=new Configuration();
		cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
		SessionFactory factory=cfg.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tx=ses.beginTransaction();
		StudentEntity stu=ses.get(StudentEntity.class, 10);
		if(stu!=null)
			System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
		
		StudentEntity stu1=ses.load(StudentEntity.class, 10);
		System.out.println(stu1.getSno()+"\t"+stu1.getSname()+"\t"+stu1.getSadd());
		
	}
	
}
