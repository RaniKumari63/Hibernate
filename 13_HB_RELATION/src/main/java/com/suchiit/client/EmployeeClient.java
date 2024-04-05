package com.suchiit.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.entity.Admin;
import com.suchiit.entity.HardwareEmployee;
import com.suchiit.entity.SoftwareEmployee;
import com.suchiit.utility.SessionUtility;

public class EmployeeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Session session=SessionUtility.getSession();
Transaction tx=session.beginTransaction();
SoftwareEmployee se=new SoftwareEmployee(111, "aaa", "aaa@gmail.com", 50000, "hibernate");
SoftwareEmployee se1=new SoftwareEmployee(112, "bbb", "bbb@gmail.com", 60000, "jpa");
SoftwareEmployee se2=new SoftwareEmployee(113, "ccc", "ccc@gmail.com", 80000, "sql");
HardwareEmployee he=new HardwareEmployee(222, "ddd", "ddd@gmail.com", 90000, 10);
HardwareEmployee he1=new HardwareEmployee(223, "eee", "eee@gmail.com", 100000, 12);
HardwareEmployee he2=new HardwareEmployee(224, "fff", "fff@gmail.com", 110000, 15);
Admin a=new Admin(333, "ggg", "ggg@gmail.com", 120000, "srnagar");
Admin a1=new Admin(334, "hhh", "hhh@gmail.com", 130000, "kukatapally");
Admin a2=new Admin(335, "iii", "iii@gmail.com", 140000, "aanagar");
session.save(a2);


tx.commit();
session.close();
	}

}
