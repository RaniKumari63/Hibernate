package com.suchiit._HB_ALL;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.entity.EmployeeEntity;
import com.suchiit.utility.SessionUtility;

public class UpdateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	       Session session=SessionUtility.getSession();
	       Transaction transaction=session.beginTransaction();
	       EmployeeEntity emp=new EmployeeEntity();
	       emp.setEno(2);
	      emp.setFirstName("eshanth");
	      emp.setLastName("arikatla");
	      emp.setEmail("eshanth@gmail.com");
	      session.update(emp);
	      transaction.commit();
	      session.close();
	}

}
