/**
 * 项目名：student
 * 作者： SL
 * 创建时间： 2018年9月17日
 */
package com.up.student.model;

/**
 * 模块说明：admin
 * 
 */
public class Admin {
	private int id;
	private String name;
	private String username;
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

}
