package com.paic.cms.userinfo.dto;


/**
 * 用户
 * @author liang
 */
public class UserInfo {

	private int sid;
	private String username;
	private String password;
	private String age;

	public UserInfo() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
}
