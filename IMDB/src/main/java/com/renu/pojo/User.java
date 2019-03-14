package com.renu.pojo;

public class User {
private  String user_emailid;
private String user_password;
private String user_phonenumber;

public String getUser_emailid() {
	
	return user_emailid;
}
public User() {
	super();
}
public User(String user_emailid, String user_password, String user_phonenumber) {
	super();
	this.user_emailid = user_emailid;
	this.user_password = user_password;
	this.user_phonenumber = user_phonenumber;
}
@Override
public String toString() {
	return "User [user_emailid=" + user_emailid + ", user_password=" + user_password + ", user_phonenumber="
			+ user_phonenumber + "]";
}
public void setUser_emailid(String user_emailid) {
	this.user_emailid = user_emailid;
}
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public String getUser_phonenumber() {
	return user_phonenumber;
}
public void setUser_phonenumber(String user_phonenumber) {
	this.user_phonenumber = user_phonenumber;
}

}
