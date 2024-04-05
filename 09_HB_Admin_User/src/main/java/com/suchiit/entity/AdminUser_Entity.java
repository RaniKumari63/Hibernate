package com.suchiit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="adminuser")
public class AdminUser_Entity {
@Id
@Column(name="Userno")
private int Userno;
@Column(name="UserName")
private String UserName;
@Column(name="UserPwd")
private String UserPwd;
@Column(name="UserEmail")
private String UserEmail;
@Column(name="CourseId")
private int CourseId;
public int getCourseId() {
	return CourseId;
}
public void setCourseId(int courseId) {
	CourseId = courseId;
}
public void setUserno(int userno) {
	Userno = userno;
}
public AdminUser_Entity(String userName, String userPwd, String userEmail, int courseId, long userMobileNumber,
		String userType) {
	super();
	UserName = userName;
	UserPwd = userPwd;
	UserEmail = userEmail;
	CourseId = courseId;
	UserMobileNumber = userMobileNumber;
	UserType = userType;
}
public AdminUser_Entity() {
	super();
	// TODO Auto-generated constructor stub
}
public AdminUser_Entity(int userno, String userName, String userPwd, String userEmail, long userMobileNumber,
		String userType) {
	super();
	Userno = userno;
	UserName = userName;
	UserPwd = userPwd;
	UserEmail = userEmail;
	UserMobileNumber = userMobileNumber;
	UserType = userType;
}
@Column(name="UserMobileNumber")
private long UserMobileNumber;
public AdminUser_Entity(String userName, String userPwd, String userEmail, long userMobileNumber, String userType) {
	super();
	UserName = userName;
	UserPwd = userPwd;
	UserEmail = userEmail;
	UserMobileNumber = userMobileNumber;
	UserType = userType;
}
@Column(name="UserType")
private String UserType;
public int getUserno() {
	return Userno;
}
public void setUsero(int userno) {
	Userno = userno;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getUserPwd() {
	return UserPwd;
}
public void setUserPwd(String userPwd) {
	UserPwd = userPwd;
}
public String getUserEmail() {
	return UserEmail;
}
public void setUserEmail(String userEmail) {
	UserEmail = userEmail;
}
public long getUserMobileNumber() {
	return UserMobileNumber;
}
public void setUserMobileNumber(long userMobileNumber) {
	UserMobileNumber = userMobileNumber;
}
public String getUserType() {
	return UserType;
}
public void setUserType(String userType) {
	UserType = userType;
}
}
