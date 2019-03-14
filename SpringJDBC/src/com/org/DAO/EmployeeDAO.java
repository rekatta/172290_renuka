package com.org.DAO;

import java.util.List;
import java.util.Map;

import com.org.pojo.Employee;

public  interface EmployeeDAO {

	public List<Employee> getAll();
	public boolean insert(Employee e);
	public boolean delete(Employee e);
	public boolean update(Employee e);
	public  Map<Integer,String> groupBy();
    public List<Employee> orderBy();


}
