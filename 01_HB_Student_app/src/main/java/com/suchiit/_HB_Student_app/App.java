package com.suchiit._HB_Student_app;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

public class App 
{
    public static void main( String[] args )
    {Configuration cfg=new Configuration();
   
    cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
    System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    SessionFactory factory=cfg.buildSessionFactory();
    Session ses=factory.openSession();
    org.hibernate.Transaction txTransaction=ses.beginTransaction();
    StudentEntity stuEn=new StudentEntity();
    stuEn.setSno(79);
    stuEn.setSname("ddd");
    stuEn.setSadd("hyd");
    ses.save(stuEn);
    txTransaction.commit();
    ses.evict(stuEn);
    ses.close();
    
    }
}