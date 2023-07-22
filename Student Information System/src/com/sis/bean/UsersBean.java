package com.sis.bean;

public class UsersBean {
	private int uid;
	private String name,password,username,email,mobileno,address;
	
	public UsersBean() {
		
	}
	
	public UsersBean(int uid,String name,String password,String username,String email,String mobileno,String address) {
		this.setUid(uid);
		this.setName(name);
		this.setUsername(username);
		this.setPassword(password);
		this.setEmail(email);
		this.setMobileno(mobileno);
		this.setAddress(address);
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
