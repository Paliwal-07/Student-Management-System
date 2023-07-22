package com.sis.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
	static Connection conn;
	public static Connection connectDB(){
	  try{
		  // register driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  // create the connection
		  conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","space");
		  System.out.println("Database connected");
	  } catch (ClassNotFoundException ex){
		  ex.printStackTrace();
	  } catch (SQLException e) {
		e.printStackTrace();
	  }
	  return conn; 
	}
}
