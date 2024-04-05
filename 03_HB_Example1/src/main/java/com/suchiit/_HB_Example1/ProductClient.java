package com.suchiit._HB_Example1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.suchiit.pojo.ProductEntity;

public class ProductClient {

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
		proEn.setPid(26);
		proEn.setPname("table");
		proEn.setPqty(8);
		proEn.setPprice(787787);
		int pid=(Integer)session.save(proEn);
		tx.commit();
		if(pid==26)
			System.out.println("product inserted successfully");
		
		else
			System.out.println("product not inserted successfully");
		session.close();
		sessionfactory.close();
		
	}

}
