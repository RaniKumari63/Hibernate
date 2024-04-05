package com.suchiit._HB_ALL;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.entity.EmployeeEntity;
import com.suchiit.utility.SessionUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Session session=SessionUtility.getSession();
       Transaction transaction=session.beginTransaction();
       EmployeeEntity emp=new EmployeeEntity();
emp.setEno(0);
      emp.setFirstName("ranikk");
      emp.setLastName("kunmnmmariggg");
      emp.setEmail("ranikumari@gmail.com");
     int  eno=(Integer)session.save(emp);
     transaction.commit();
     session.close();
    }
}
