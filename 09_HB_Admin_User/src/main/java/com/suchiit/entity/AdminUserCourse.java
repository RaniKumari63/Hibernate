package com.suchiit.entity;

public class AdminUserCourse {

	public AdminUserCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AdminUserCourse(String userName, String userPwd, String userEmail, long userMobileNumber, String userType,
			String cname, String cduration, long cfee) {
		super();
		UserName = userName;
		UserPwd = userPwd;
		UserEmail = userEmail;
		UserMobileNumber = userMobileNumber;
		UserType = userType;
		this.cname = cname;
		this.cduration = cduration;
		this.cfee = cfee;
	}
	public AdminUserCourse(String userName, String userPwd, String userEmail, long userMobileNumber, String userType,
			String cname,int userno) {
		super();
		UserName = userName;
		UserPwd = userPwd;
		UserEmail = userEmail;
		UserMobileNumber = userMobileNumber;
		UserType = userType;
		this.cname = cname;
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
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCduration() {
		return cduration;
	}
	public void setCduration(String cduration) {
		this.cduration = cduration;
	}
	public long getCfee() {
		return cfee;
	}
	public void setCfee(int cfee) {
		this.cfee = cfee;
	}
	private String UserName;
	private String UserPwd;
	private String UserEmail;
	private long UserMobileNumber;
	private String UserType;
	private String cname;
	private String cduration;
	private long cfee;
	private int Userno;
	private int cid;
	public AdminUserCourse(String userName, String userPwd, String userEmail, long userMobileNumber, String userType,
			String cname, String cduration, long cfee, int userno) {
		super();
		UserName = userName;
		UserPwd = userPwd;
		UserEmail = userEmail;
		UserMobileNumber = userMobileNumber;
		UserType = userType;
		this.cname = cname;
		this.cduration = cduration;
		this.cfee = cfee;
		Userno = userno;
	}
	public AdminUserCourse(String userName, String userPwd, String userEmail, long userMobileNumber, String userType,
			String cname, String cduration, long cfee, int userno, int cid) {
		super();
		UserName = userName;
		UserPwd = userPwd;
		UserEmail = userEmail;
		UserMobileNumber = userMobileNumber;
		UserType = userType;
		this.cname = cname;
		this.cduration = cduration;
		this.cfee = cfee;
		Userno = userno;
		this.cid = cid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getUserno() {
		return Userno;
	}
	public void setUserno(int userno) {
		Userno = userno;
	}
	public void setCfee(long cfee) {
		this.cfee = cfee;
	}
}
