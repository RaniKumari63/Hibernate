package com.suchiit.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.suchiit.dao.AdminUserDao;
import com.suchiit.entity.AdminUserCourse;
import com.suchiit.entity.AdminUser_Entity;
import com.suchiit.entity.CourseEntity;
import com.suchiit.utility.SessionUtility;

public class AdminUserDaoImpl  implements AdminUserDao{

	public String validUserNamePwd(String username, String upwd) {
		
		Session session=SessionUtility.getSession();
		AdminUser_Entity adminen=new AdminUser_Entity();
	 Query query=session.createQuery("select UserType from AdminUser_Entity where UserName=:username and UserPwd=:userpwd");
		query.setParameter("username",username);
		query.setParameter("userpwd", upwd);
	String utype=(String) query.getSingleResult();
	//session.close();
	
	return  utype;
		


	}
public int getUserId(String username, String upwd) {
		
		Session session=SessionUtility.getSession();
		AdminUser_Entity adminen=new AdminUser_Entity();
	 Query query=session.createQuery("select Userno from AdminUser_Entity where UserName=:username and UserPwd=:userpwd");
		query.setParameter("username",username);
		query.setParameter("userpwd", upwd);
	int userno=(Integer)query.getSingleResult();
	//session.close();
	
	return  userno;
		


	}

	public boolean register(AdminUser_Entity adminuser) {
		boolean flag=false;
		Session session=SessionUtility.getSession();
		Transaction tx=session.beginTransaction();
		AdminUser_Entity user=new AdminUser_Entity();
		user.setUserName(adminuser.getUserName());
		user.setUserPwd(adminuser.getUserPwd());
		user.setUserEmail(adminuser.getUserEmail());
		user.setUserMobileNumber(adminuser.getUserMobileNumber());
		user.setUserType(adminuser.getUserType());
		user.setCourseId(adminuser.getCourseId());
		int uid=(Integer)session.save(user);
		tx.commit();
		
		int uno=getUserId(adminuser.getUserName(),adminuser.getUserPwd());
		
	if(uno!=0)
	{flag=true;
		
	}
	
		
		
		return flag;
	}
	public List<Object[]> viewAdminUser() {
		
		List<AdminUser_Entity> adminusers=new ArrayList<AdminUser_Entity>();
		
		
		Session session=SessionUtility.getSession();
		
	
		Query query=session.createQuery("select a.UserName,a.UserPwd,a.UserEmail,a.UserMobileNumber,a.UserType,c.cname,c.cduration,c.cfee,a.Userno,c.id from AdminUser_Entity a join CourseEntity c on a.CourseId =c.id");
		List<Object[]> addAdminCourses=query.getResultList();
		

		return addAdminCourses;
	}
	
public AdminUserCourse viewAdminUserspecific(int uid) {
		
		AdminUserCourse usercourse=null;
		
		Session session=SessionUtility.getSession();
		AdminUser_Entity aduserentity=session.get(AdminUser_Entity.class, uid);
		
if(aduserentity!=null)
{
	CourseEntity courseentity=session.get(CourseEntity.class,aduserentity.getCourseId());
	
	usercourse=new AdminUserCourse(aduserentity.getUserName(),aduserentity.getUserPwd(), aduserentity.getUserEmail(),aduserentity.getUserMobileNumber(), aduserentity.getUserType(),courseentity.getCname(), courseentity.getCduration(), courseentity.getCfee(),aduserentity.getUserno(),courseentity.getId());

}


	return usercourse;	
	}



public boolean deleteSpecific(int uid)
{
	boolean flag=false;
	AdminUserCourse usercourse=null;
	

Session session=SessionUtility.getSession();
Transaction transaction=session.getTransaction();
transaction.begin();
Query query=session.createQuery("delete from AdminUser_Entity where Userno=:uid");

query.setParameter("uid", uid);

int count=query.executeUpdate();

transaction.commit();
if(count!=0)
flag=true;
else
	flag=false;
	return flag;
}

	public boolean UpdateAdminUser(AdminUserCourse adminusercourse)
	{
		boolean flag=false;
		Session session=SessionUtility.getSession();
		org.hibernate.Transaction tx=session.beginTransaction();
		//AdminUser_Entity admin=new AdminUser_Entity();
		//admin.setUserno(adminusercourse.getUserno());
		//AdminUser_Entity admin1=session1.get(AdminUser_Entity.class,adminusercourse.getUserno());
		//admin1.setUserName(adminusercourse.getUserName());
	//	admin1.setUserPwd(adminusercourse.getUserPwd());
		//admin1.setUserEmail(adminusercourse.getUserEmail());
		//admin1.setUserMobileNumber(adminusercourse.getUserMobileNumber());
		//admin1.setUserType(adminusercourse.getUserType());
		//admin1.setCourseId(adminusercourse.getCid());
	//	AdminUser_Entity adminen=(AdminUser_Entity)session1.merge(admin);
		//System.out.println("hhhhhhhh"+adminen);
		//session1.merge(admin1);
		
		Query query=session.createQuery("update AdminUser_Entity set userName=:userName,UserType=:UserType,userPwd=:userPwd,userEmail=:userEmail,userMobileNumber=:userMobileNumber,CourseId=:CourseId where Userno=:Userno ");
query.setParameter("userName", adminusercourse.getUserName());
query.setParameter("userPwd", adminusercourse.getUserPwd());
query.setParameter("userEmail", adminusercourse.getUserEmail());
query.setParameter("userMobileNumber", adminusercourse.getUserMobileNumber());
query.setParameter("CourseId", adminusercourse.getCid());
query.setParameter("UserType", adminusercourse.getUserType());
query.setParameter("Userno", adminusercourse.getUserno());
int count=query.executeUpdate();
System.out.println("ddddddddddddddd"+count);		
		tx.commit();
if(count!=0)
{	flag=true;

}
else
{
	flag=false;
}
	return flag;	
		
	}
	public int getCourseId(String cname) {
		return 1;
	}
	
	
}

