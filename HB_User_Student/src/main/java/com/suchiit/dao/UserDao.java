package com.suchiit.dao;

import com.suchiit.pojo.UserEntity;

public interface UserDao {
	
	public boolean register(UserEntity user);
	UserEntity getUserDetails(int uid);
	
}
