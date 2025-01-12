package com.suchiit._HB_Employee_app;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.EmployeeEntity;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg=new Configuration();
        cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        Session ses=factory.openSession();
        org.hibernate.Transaction tx=ses.beginTransaction();
        
        EmployeeEntity empEn=new EmployeeEntity();
        empEn.setEno(9);
        empEn.setEname("ggg");
        empEn.setEaddr("hyd");
        empEn.setEdes("ddd");
        ses.save(empEn);
        tx.commit();
        //ses.evict(empEn);
        ses.close();
    }
}
