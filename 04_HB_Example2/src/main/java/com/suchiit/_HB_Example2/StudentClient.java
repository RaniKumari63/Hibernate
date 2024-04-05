package com.suchiit._HB_Example2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration config=new Configuration();
config.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
SessionFactory sessionfactory=config.buildSessionFactory();
Session session=sessionfactory.openSession();
//Transaction transcation=session.beginTransaction();
Transaction transaction=session.getTransaction();
transaction.begin();
StudentEntity stuEn=new StudentEntity();
stuEn.setSno(16);
stuEn.setSname("eshanth22");
stuEn.setSaddr("hyd");
session.update(stuEn);
transaction.commit();


session.close();
sessionfactory.close();


	}

}
