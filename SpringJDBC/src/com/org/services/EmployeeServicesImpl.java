package com.org.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.DAO.EmployeeDAOimpl;
import com.org.myAnnotation.Loggable;
import com.org.pojo.Employee;

public class EmployeeServicesImpl implements  EmployeeServices {
	
	 ApplicationContext c=new ClassPathXmlApplicationContext("spring.xml");
	 EmployeeDAOimpl d=(EmployeeDAOimpl)c.getBean("edao");

public List<Employee> getEmp(Employee e) {
			return d.employee(e);

		}
	 
@Loggable	 
public boolean addEmp(Employee e) {
	
		EmployeeDAOimpl addemp=new EmployeeDAOimpl();
		addemp.insert(e);
		return true;
		
	}

public boolean updateEmpSal(Employee e) {
	  d.update(e);
		return true;
	}
@Override
public String getMaxSal() {
	List<Employee> l=d.getAll();
	Double maxSal=l.stream().map(e->e.getSal()).max((x,y)->x.compareTo(y)).get();
	System.out.println(maxSal);
	
	return null;
}
@Override
public boolean deleteEmp(Employee e) {
	d.delete(e);
	return true;
}
@Override
public boolean getWithoutComm() {
	List<Employee> l=d.getAll();
	 List<String> result = l.stream().filter(line ->line.getComm()==0).map(e->e.geteName()).collect(Collectors.toList());
	 result.forEach(emp -> System.out.println(emp));
//	
//	  for(String s:result) { System.out.println(result); }
//	 
	
	return true;
}



}
