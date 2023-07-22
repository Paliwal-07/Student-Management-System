package com.sis.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.sis.bean.StudentBean;
import com.sis.utility.ConnectionPool;

public class StudentDAO {
	static Connection conn;
	public int addStudent(StudentBean sb){
		int res=0;
		conn=ConnectionPool.connectDB();
		String query="insert into student(Enrollment,Name,Address,Branch,College,Semester,Gender,Subject1,Subject2,Subject3,Subject4,Grade,Status) values('"+sb.getEnrollmentno()+"','"+sb.getName()+"','"+sb.getAddress()+"','"+sb.getBranch()+"','"+sb.getCollege()+"','"+sb.getSemester()+"','"+sb.getGender()+"','"+sb.getSubject1()+"','"+sb.getSubject2()+"','"+sb.getSubject3()+"','"+sb.getSubject4()+"','"+sb.getGrade()+"','"+sb.getStatus()+"' )";
		try {
			Statement stmt=conn.createStatement();
			res=stmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int updateStudent(StudentBean sb) {
		int res=0;
		conn=ConnectionPool.connectDB();
		String query="update student set Name='"+sb.getName()+"',Address='"+sb.getAddress()+"',Branch='"+sb.getBranch()+"',College='"+sb.getCollege()+"',Semester='"+sb.getSemester()+"',Subject1='"+sb.getSubject1()+"',Subject2='"+sb.getSubject2()+"',Subject3='"+sb.getSubject3()+"',Subject4='"+sb.getSubject4()+"',Grade='"+sb.getGrade()+"',Status='"+sb.getStatus()+"' where Enrollment='"+sb.getEnrollmentno()+"'";
		try {
			Statement stmt=conn.createStatement();
			res=stmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int deleteStudent(String enrollmentno) {
		int res=0;
		conn=ConnectionPool.connectDB();
		String query="delete from student where Enrollment='"+enrollmentno+"'";
		try {
			Statement stmt = conn.createStatement();
			res=stmt.executeUpdate(query);
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public ArrayList<StudentBean> findAllStudent() {
		ArrayList<StudentBean> al=new ArrayList<StudentBean>();
		conn=ConnectionPool.connectDB();
		String query="select * from student";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(rs.getString("Enrollment"));
				sb.setName(rs.getString("Name"));
				sb.setAddress(rs.getString("Address"));
				sb.setBranch(rs.getString("Branch"));
				sb.setCollege(rs.getString("College"));
				sb.setSemester(rs.getInt("Semester"));
				sb.setGender(rs.getString("Gender"));
				sb.setSubject1(rs.getFloat("Subject1"));
				sb.setSubject2(rs.getFloat("Subject2"));
				sb.setSubject3(rs.getFloat("Subject3"));
				sb.setSubject4(rs.getFloat("Subject4"));
				sb.setGrade(rs.getString("Grade"));
				al.add(sb);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public ArrayList<StudentBean> findByEnrollment(String enrollmentno) {
		ArrayList<StudentBean> al=new ArrayList<StudentBean>();
		conn=ConnectionPool.connectDB();
		String query="select * from student where Enrollment='"+enrollmentno+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(rs.getString("Enrollment"));
				sb.setName(rs.getString("Name"));
				sb.setAddress(rs.getString("Address"));
				sb.setBranch(rs.getString("Branch"));
				sb.setCollege(rs.getString("College"));
				sb.setSemester(rs.getInt("Semester"));
				sb.setGender(rs.getString("Gender"));
				sb.setSubject1(rs.getFloat("Subject1"));
				sb.setSubject2(rs.getFloat("Subject2"));
				sb.setSubject3(rs.getFloat("Subject3"));
				sb.setSubject4(rs.getFloat("Subject4"));
				sb.setGrade(rs.getString("Grade"));
				al.add(sb);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public ArrayList<StudentBean> findBySemester(int semester) {
		ArrayList<StudentBean> al=new ArrayList<StudentBean>();
		conn=ConnectionPool.connectDB();
		String query="select * from student where Semester='"+semester+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(rs.getString("Enrollment"));
				sb.setName(rs.getString("Name"));
				sb.setAddress(rs.getString("Address"));
				sb.setBranch(rs.getString("Branch"));
				sb.setCollege(rs.getString("College"));
				sb.setSemester(rs.getInt("Semester"));
				sb.setGender(rs.getString("Gender"));
				sb.setSubject1(rs.getFloat("Subject1"));
				sb.setSubject2(rs.getFloat("Subject2"));
				sb.setSubject3(rs.getFloat("Subject3"));
				sb.setSubject4(rs.getFloat("Subject4"));
				sb.setGrade(rs.getString("Grade"));
				al.add(sb);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public ArrayList<StudentBean> findByStatus(String stat) {
		ArrayList<StudentBean> al=new ArrayList<StudentBean>();
		conn=ConnectionPool.connectDB();
		String query="select * from student where Status='"+stat+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(rs.getString("Enrollment"));
				sb.setName(rs.getString("Name"));
				sb.setAddress(rs.getString("Address"));
				sb.setBranch(rs.getString("Branch"));
				sb.setCollege(rs.getString("College"));
				sb.setSemester(rs.getInt("Semester"));
				sb.setGender(rs.getString("Gender"));
				sb.setSubject1(rs.getFloat("Subject1"));
				sb.setSubject2(rs.getFloat("Subject2"));
				sb.setSubject3(rs.getFloat("Subject3"));
				sb.setSubject4(rs.getFloat("Subject4"));
				sb.setGrade(rs.getString("Grade"));
				al.add(sb);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public ArrayList<StudentBean> findByCollege(String college) {
		ArrayList<StudentBean> al=new ArrayList<StudentBean>();
		conn=ConnectionPool.connectDB();
		String query="select * from student where College='"+college+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(rs.getString("Enrollment"));
				sb.setName(rs.getString("Name"));
				sb.setAddress(rs.getString("Address"));
				sb.setBranch(rs.getString("Branch"));
				sb.setCollege(rs.getString("College"));
				sb.setSemester(rs.getInt("Semester"));
				sb.setGender(rs.getString("Gender"));
				sb.setSubject1(rs.getFloat("Subject1"));
				sb.setSubject2(rs.getFloat("Subject2"));
				sb.setSubject3(rs.getFloat("Subject3"));
				sb.setSubject4(rs.getFloat("Subject4"));
				sb.setGrade(rs.getString("Grade"));
				al.add(sb);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public ArrayList<StudentBean> findByBranch(String branch) {
		ArrayList<StudentBean> al=new ArrayList<StudentBean>();
		conn=ConnectionPool.connectDB();
		String query="select * from student where Branch='"+branch+"'";
		try {
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				StudentBean sb=new StudentBean();
				sb.setEnrollmentno(rs.getString("Enrollment"));
				sb.setName(rs.getString("Name"));
				sb.setAddress(rs.getString("Address"));
				sb.setBranch(rs.getString("Branch"));
				sb.setCollege(rs.getString("College"));
				sb.setSemester(rs.getInt("Semester"));
				sb.setGender(rs.getString("Gender"));
				sb.setSubject1(rs.getFloat("Subject1"));
				sb.setSubject2(rs.getFloat("Subject2"));
				sb.setSubject3(rs.getFloat("Subject3"));
				sb.setSubject4(rs.getFloat("Subject4"));
				sb.setGrade(rs.getString("Grade"));
				al.add(sb);
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	
	public static void main(String[] args) {
//		StudentBean sb=new StudentBean();
//		sb.setEnrollmentno("0157CS201143");
//		sb.setName("Richa Sarathe");
//		sb.setAddress("Kalchuri nagar Bhopal");
//		sb.setBranch("CSE");
//		sb.setCollege("LNCTS");
//		sb.setSemester(7);
//		sb.setGender("Female");
//		sb.setSubject1(85);
//		sb.setSubject2(86);
//		sb.setSubject3(82);
//		sb.setSubject4(89);
//		
		StudentDAO sd=new StudentDAO();
//		int x=sd.addStudent(sb);
//		if(x>0) {
//			System.out.println("Student added successfully");
//		}else {
//			System.out.println("Failed to add Student");
//		}
		
		ArrayList<StudentBean> al=sd.findByBranch("CY");
		for(StudentBean x:al) {
			System.out.println(x.getEnrollmentno()+"\t"+x.getName()+"\t"+x.getAddress()+"\t"+x.getBranch()+"\t"+x.getCollege()+"\t"+x.getSemester()+"\t"+x.getGender()+"\t"+x.getSubject1()+"\t"+x.getSubject2()+"\t"+x.getSubject3()+"\t"+x.getSubject4()+"\t"+x.getGrade()+"\t"+x.getStatus());
		}
	}
}