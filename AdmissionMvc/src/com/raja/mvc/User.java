package com.raja.mvc;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.format.datetime.standard.DateTimeContext;

public class User {

	private int userid;
	private Long mobile;
	private Date date;
	private ArrayList<String> models;
	private UserDetails userinfo;
	public int getUsername() {
		return userid;
	}
	public void setUsername(int username) {
		this.userid = username;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public ArrayList<String> getModels() {
		return models;
	}
	public void setModels(ArrayList<String> models) {
		this.models = models;
	}
	public UserDetails getUserinfo() {
		return userinfo;
	}
	public void setUserinfo(UserDetails userinfo) {
		this.userinfo = userinfo;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
	
}
