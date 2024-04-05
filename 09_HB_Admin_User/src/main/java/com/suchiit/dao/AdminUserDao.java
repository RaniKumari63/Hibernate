package com.suchiit.dao;

import java.util.List;

import com.suchiit.entity.AdminUserCourse;
import com.suchiit.entity.AdminUser_Entity;

public interface AdminUserDao {

	
	public  String validUserNamePwd(String username,String pwd);
	public boolean register(AdminUser_Entity adminuser );
	public List<Object[]> viewAdminUser();
	public AdminUserCourse viewAdminUserspecific(int uid);
	public int getCourseId(String cname);
	public boolean UpdateAdminUser(AdminUserCourse adminusercourse);
	public int getUserId(String username, String upwd);
	public boolean deleteSpecific(int uid);
	
}
