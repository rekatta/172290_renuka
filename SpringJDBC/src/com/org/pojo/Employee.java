package com.org.pojo;

import java.sql.Date;

public class Employee {
 
 private int empNo;
 private String eName;
 private String job;
 private int mgr;
 //private Date hiredate;
 private int sal;
 private int comm;
 private int deptNo;
 
 
 public int getEmpNo() {
	return empNo;
}
public void setEmpNo(int empNo) {
	this.empNo = empNo;
}
public String geteName() {
	return eName;
}
public void seteName(String eName) {
	this.eName = eName;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}

public int getMgr() {
	return mgr;
}
public void setMgr(int mgr) {
	this.mgr = mgr;
}
//public Date getHiredate() {
//	return hiredate;
//}
//public void setHiredate(Date hiredate) {
//	this.hiredate = hiredate;
//}
public double getSal() {
	return sal;
}

public double getComm() {
	return comm;
}

public void setSal(int sal) {
	this.sal = sal;
}
public void setComm(int comm) {
	this.comm = comm;
}
public int getDeptNo() {
	return deptNo;
}
public void setDeptNo(int deptNo) {
	this.deptNo = deptNo;
}
@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hiredate=" 
			+ ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
}
}
