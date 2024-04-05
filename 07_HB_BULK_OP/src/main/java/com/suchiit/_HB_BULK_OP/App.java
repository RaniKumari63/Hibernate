package com.suchiit._HB_BULK_OP;




import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.pojo.EmployeeEntity;
import com.suchiit.utility.SessionUtility;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

Session ses=SessionUtility.getSession();
EmployeeEntity emp=new EmployeeEntity();
emp.setFirstName("rani");
emp.setLastName("kumari");
emp.setEmail("ranikumari@gmail.com");
ses.save(emp);
Transaction tx=ses.beginTransaction();
tx.commit();
ses.close();
    }
}
