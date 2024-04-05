package com.suchiit._HB_Example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

public class StudentClient2 {

	public static void main(String args[])
	{
		Configuration config=new Configuration();
		config.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
		SessionFactory sessionfactory=config.buildSessionFactory();
		Session session=sessionfactory.openSession();
		//Transaction transcation=session.beginTransaction();
		Transaction transaction=session.getTransaction();
		transaction.begin();
		StudentEntity stuEn=new StudentEntity();
		stuEn.setSno(1);
		session.delete(stuEn);
		transaction.commit();
		session.close();
		sessionfactory.close();
		
	}
}
