package com.suchiit._HB_Student_app;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;

import com.suchiit.pojo.StudentEntity;

public class App3 
{
    public static void main( String[] args )
    {StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
    
    }
}
