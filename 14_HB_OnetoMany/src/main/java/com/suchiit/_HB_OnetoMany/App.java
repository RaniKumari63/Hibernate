package com.suchiit._HB_OnetoMany;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.entity.Employee;
import com.suchiit.utility.SessionUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Employee emp=new Employee();
        emp.setId(1l);
        emp.setEmpFirstName("john");
        emp.setEmpLastName("layer");
        Session session=SessionUtility.getSession();
        Transaction tx=session.beginTransaction();
    session.persist(emp);
    session.close();
    }
}
