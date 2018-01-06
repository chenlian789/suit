package com.pojo;

public class User {

	public Integer id;
	public String userId;
	public String name;
	public String passwd;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", userId='" + userId + '\'' +
				", name='" + name + '\'' +
				", passwd='" + passwd + '\'' +
				'}';
	}
}
