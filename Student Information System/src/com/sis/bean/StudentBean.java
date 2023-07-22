package com.sis.bean;

public class StudentBean {
	private int semester;
	private String enrollmentno,name,address,branch,college,gender,grade,status;
	private float subject1,subject2,subject3,subject4;
	
	public StudentBean() {
	}
	
	public StudentBean(String enrollmentno,int semester,String name,String address,String branch,String college,float subject1,float subject2,float subject3,float subject4,String status,String gender,String grade) {
		this.setEnrollmentno(enrollmentno);
		this.setSemester(semester);
		this.setName(name);
		this.setAddress(address);
		this.setBranch(branch);
		this.setCollege(college);
		this.setSubject1(subject1);
		this.setSubject2(subject2);
		this.setSubject3(subject3);
		this.setSubject4(subject4);
		this.setStatus(status);
		this.setGender(gender);
		this.setGrade(grade);
	}

	public String getEnrollmentno() {
		return enrollmentno;
	}

	public void setEnrollmentno(String enrollmentno) {
		this.enrollmentno = enrollmentno;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public float getSubject1() {
		return subject1;
	}

	public void setSubject1(float subject1) {
		this.subject1 = subject1;
	}

	public float getSubject2() {
		return subject2;
	}

	public void setSubject2(float subject2) {
		this.subject2 = subject2;
	}

	public float getSubject3() {
		return subject3;
	}

	public void setSubject3(float subject3) {
		this.subject3 = subject3;
	}

	public float getSubject4() {
		return subject4;
	}

	public void setSubject4(float subject4) {
		this.subject4 = subject4;
	}

	public String getStatus() {
		if(grade=="F") {
			status="Fail";
		}else {
			status="Pass";
		}
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		float percent=((subject1+subject2+subject3+subject4)/400)*100;
		if(percent>=90) {
			grade="A";
		}else if(percent>=75) {
			grade="B";
		}else if(percent>=60) {
			grade="C";
		}else if(percent>=45) {
			grade="D";
		}else if(percent>=33) {
			grade="E";
		}else if(percent<33){
			grade="F";
		}else {
			grade="U";
		}
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}
