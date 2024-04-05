package com.suchiit._HB_Example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.ProductEntity;

public class ProductClient2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Configuration maitains all the details of the configuration file configuration details
		Configuration config=new Configuration();
		config.configure("\\com\\suchiit\\config\\hibernate.cfg.xml");
		//sessionfactory loads the drivers and establish the connections
		SessionFactory sessionfactory=config.buildSessionFactory();
		
		Session session=sessionfactory.openSession();
		Transaction tx=session.beginTransaction();
		ProductEntity proEn=new ProductEntity();
		proEn.setPid(28);
		proEn.setPname("pens");
		proEn.setPqty(8);
		proEn.setPprice(787787);
		session.persist(proEn);
		tx.commit();
		System.out.println("Product inserted successfully");
		session.close();
		sessionfactory.close();
		
	}

}
