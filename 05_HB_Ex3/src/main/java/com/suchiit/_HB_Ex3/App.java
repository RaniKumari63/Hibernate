package com.suchiit._HB_Ex3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.StudentEntity;

public class App 
{
    public static void main( String[] args )
    {
        Configuration config=new Configuration();
        config.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
        SessionFactory sessionFactory=config.buildSessionFactory();
        Session session=sessionFactory.openSession();
     
     //  StudentEntity stuEn=(StudentEntity)session.get(StudentEntity.class, 1);
        StudentEntity stuEn=(StudentEntity)session.load(StudentEntity.class, 1); 
        System.out.println(stuEn.getSaddr());
        session.close();
        sessionFactory.close();
        
    }
}
