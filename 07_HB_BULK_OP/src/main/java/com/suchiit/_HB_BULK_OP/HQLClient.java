package com.suchiit._HB_BULK_OP;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.suchiit.pojo.EmployeeEntity;
import com.suchiit.utility.SessionUtility;

public class HQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session ses=SessionUtility.getSession();
		Transaction tx=ses.beginTransaction();
		/*
		 * Query query=ses.createQuery("from EmployeeEntity"); List<EmployeeEntity>
		 * addEmployees=query.getResultList();
		 * addEmployees.stream().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.
		 * getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail()));
		 */
		Query query1=ses.createQuery("from EmployeeEntity");
		List<EmployeeEntity> addEmployees=query1.getResultList();
		addEmployees.stream().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.getFirstName()));
		Query query2=ses.createQuery("from EmployeeEntity where eno>1");
		List<EmployeeEntity> addEmployees1=query2.getResultList();
		addEmployees1.stream().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.getEmail()));
		
		/*
		 * Query query=ses.createQuery("from EmployeeEntity where eno>5");
		 * List<EmployeeEntity>addEmployees=query.getResultList();
		 * addEmployees.stream().forEach(emp->System.out.println(emp.getEno()+"\t"+emp.
		 * getFirstName()+"\t"+emp.getLastName()+"\t"+emp.getEmail()));
		 */
		
		/*
		 * Query query=ses.createQuery("select firstName,lastName from EmployeeEntity");
		 * List<Object[]> addEmployees=query.getResultList(); for(Object
		 * obj[]:addEmployees) { System.out.println(obj[0]+"\t"+obj[1]); }
		 */
		Query query3=ses.createQuery("select firstName,lastName from EmployeeEntity");
		List<Object[]> addEmployees3=query3.getResultList();
		for(Object obj[]:addEmployees3)
		{
			System.out.println(obj[0]+"\t"+obj[1]);
		}
		
		/*
		 * Query query=ses.createQuery("select firstName from EmployeeEntity");
		 * List<String> addEmployees=query.getResultList(); for(String st:addEmployees)
		 * { System.out.println(st); }
		 */
		
	
		/*
		 * Query
		 * query=ses.createQuery("select firstName from EmployeeEntity where eno>:no");
		 * 
		 * query.setParameter("no", 4); List<String> addEmployees=query.getResultList();
		 * 
		 * for(String st:addEmployees) { System.out.println(st); }
		 */
		
		/*
		 * Query query=ses.
		 * createQuery("update EmployeeEntity set firstName=:fname,lastName=:lname");
		 * query.setParameter("fname", "ranivvvvvvvvvvvvvv");
		 * query.setParameter("lname", "kumari"); int count=query.executeUpdate();
		 * if(count!=0) System.out.println("updated"); else
		 * System.out.println("not updated");
		 * 
		 * tx.commit();
		 */
		int value=3;
		String value2="ccc";
	Query query5=ses.createQuery("from EmployeeEntity where eno=?1 and email=?2");
	query5.setParameter(1, value);
	query5.setParameter(2, value2);
	EmployeeEntity empen=(EmployeeEntity)query5.getSingleResult();
		System.out.println("mmmmmmmmmmmmmmmmmmmm"+empen.getEno()+"\t"+empen.getFirstName());
		
		
		
		Query query6=ses.createQuery("from EmployeeEntity where eno=:eno and email=:email");
		query6.setParameter("eno", 3);
		query6.setParameter("email", "ccc");
		EmployeeEntity empen1=(EmployeeEntity)query6.getSingleResult();
			System.out.println("mmmmmmmmmmmmmmmmmmmm"+empen1.getEno()+"\t"+empen1.getFirstName());
		Query query=ses.createQuery("delete from EmployeeEntity where eno=:no ");
		query.setParameter("no",5);

		int count=query.executeUpdate();
		if(count!=0)
			System.out.println("deleted");
		else
			System.out.println("not deleted");
		
		tx.commit();
		
	
	
	
	}

}
