package com.sis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sis.bean.UsersBean;
import com.sis.utility.ConnectionPool;

public class UsersDAO {
	static Connection conn;
	public int registerUser(UsersBean ub) {
		int res=0;
		conn=ConnectionPool.connectDB();
		String query="insert into users(Name,Username,Password,Email,MobileNo,Address) values('"+ub.getName()+"','"+ub.getUsername()+"','"+ub.getPassword()+"','"+ub.getEmail()+"','"+ub.getMobileno()+"','"+ub.getAddress()+"')";
		try {
			Statement stmt=conn.createStatement();
			res=stmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int loginUser(String username,String password) {
		int id=0;
		conn=ConnectionPool.connectDB();
		String query="select UID from users where Username='"+username+"' and Password='"+password+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet res=stmt.executeQuery(query);
			if(res.next()) {
				id=res.getInt("UID");
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;
	}
	
	public String forgotPassword(String email) {
		String password="";
		conn=ConnectionPool.connectDB();
		String query="select Password from users where Email='"+email+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet res=stmt.executeQuery(query);
			if(res.next()) {
				password=res.getString("Password");
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return password;
	}
	
	public int changePassword(String email,String password) {
		int res=0;
		conn=ConnectionPool.connectDB();
		String query="update users set Password='"+password+"' where Email='"+email+"'";
		try {
			Statement stmt=conn.createStatement();
			res=stmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public static void main(String[] args) {
//		UsersBean ub=new UsersBean();
//		ub.setName("Jayans Paliwal");
//		ub.setUsername("James07");
//		ub.setPassword("P@ssw0rd");
//		ub.setEmail("luigi@ninja.com");
//		ub.setMobileno("9114356487");
//		ub.setAddress("Saket Nagar Bhopal");
		
		UsersDAO ud=new UsersDAO();
//		int x=ud.registerUser(ub);
//		int x=ud.loginUser("James07","P@ssw0rd");
//		String pass=ud.forgotPassword("luigi@ninja.com");
		int x=ud.changePassword("luigi@ninja.com", "Password");
		if(x>0) {
			System.out.println("Password changed successfully");
		}else {
			System.out.println("Unable to change password");
		}
	}
}
