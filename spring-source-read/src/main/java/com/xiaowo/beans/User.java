package com.xiaowo.beans;

/**
 * Created by wubo15 on 2021/6/9.
 *
 * @author wubo15
 * @date 2021/6/9
 */
public class User {

	private String username;
	private String address;

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
