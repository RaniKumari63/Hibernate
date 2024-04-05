package com.suchiit._HB_ALL;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.entity.EmployeeEntity;
import com.suchiit.utility.SessionUtility;

public class PersistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=SessionUtility.getSession();
Transaction tx=session.beginTransaction();
EmployeeEntity emp=new EmployeeEntity();
emp.setEno(2);
emp.setFirstName("yaswanth");
emp.setLastName("arikatla");
emp.setEmail("yaswanth@gmail.com");
session.persist(emp);
tx.commit();
session.close();
	}

}
