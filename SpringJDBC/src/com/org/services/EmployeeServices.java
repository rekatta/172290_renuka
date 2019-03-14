package com.org.services;

import java.util.List;

import com.org.pojo.Employee;

public interface EmployeeServices {
	
	public boolean addEmp(Employee e);
	public List<Employee> getEmp(Employee e);
	public boolean updateEmpSal(Employee e);
	public boolean deleteEmp(Employee e);
	public boolean getWithoutComm();
	 public String getMaxSal();
	
	
}
