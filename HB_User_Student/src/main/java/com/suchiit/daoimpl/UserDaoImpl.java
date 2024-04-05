package com.suchiit.daoimpl;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.suchiit.dao.UserDao;

import com.suchiit.pojo.UserEntity;
import com.suchiit.session_factory.FactoryManager;

public class UserDaoImpl implements UserDao{

	public boolean register(UserEntity user) {
		boolean flag=false;
		SessionFactory sessionfactory=FactoryManager.getFactoryMethod();
		Session session=sessionfactory.openSession();
		
		org.hibernate.Transaction transaction=session.beginTransaction();
		UserEntity userEn=new UserEntity();
		
		userEn.setUid(user.getUid());
		userEn.setFname(user.getFname());
		userEn.setLname(user.getLname());
		userEn.setEmail(user.getEmail());
		userEn.setMobilenumber(user.getMobilenumber());
		userEn.setPwd(user.getPwd());
		int uid=(Integer)session.save(userEn);
		
		transaction.commit();
		if(uid==user.getUid())
		{ flag=true;
			
		}
		
		session.evict(userEn);
		FactoryManager.closeResources(sessionfactory);
		
		
		
		return flag;
	}

	public UserEntity getUserDetails(int uid) {
		boolean flag=false;
		SessionFactory sessionfactory=FactoryManager.getFactoryMethod();
		Session session=sessionfactory.openSession();
		
		org.hibernate.Transaction transaction=session.beginTransaction();
		UserEntity userEn=session.get(UserEntity.class, uid);
		FactoryManager.closeResources(sessionfactory);
	return userEn;
	}

	
}
