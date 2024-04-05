package com.suchiit._HB_Student_app;



import java.sql.Timestamp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

public class App2 
{
    public static void main( String[] args )
    {Configuration cfg=new Configuration();
   
    cfg.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
    System.out.println(cfg.getProperty("hibernate.connection.driver_class"));
    SessionFactory factory=cfg.buildSessionFactory();
    Session ses=factory.openSession();
   String sql="select now()";
   Timestamp result=(Timestamp)ses.createNativeQuery(sql).getSingleResult();
   System.out.println(result); 
   ses.close();
    
    }
}
