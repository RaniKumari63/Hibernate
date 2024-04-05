package com.suchiit._HB_Student_app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;
import com.suchiit.utility.SessionUtility;

public class RetriveClient {

	public static void main(String args[])
	{
		Session ses=SessionUtility.getSession();
		
		Transaction tx=ses.beginTransaction();
		StudentEntity stu=ses.get(StudentEntity.class, 10);
		if(stu!=null)
			System.out.println(stu.getSno()+"\t"+stu.getSname()+"\t"+stu.getSadd());
		
		StudentEntity stu1=ses.load(StudentEntity.class, 10);
		System.out.println(stu1.getSno()+"\t"+stu1.getSname()+"\t"+stu1.getSadd());
		
	}
	
}
