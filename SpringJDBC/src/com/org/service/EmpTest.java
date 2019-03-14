package com.org.service;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.DAO.EmployeeDAO;
import com.org.DAO.EmployeeDAOimpl;
import com.org.pojo.Employee;
import com.org.services.EmployeeServices;
import com.org.services.EmployeeServicesImpl;



public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("spring.xml");
		Employee employee=new Employee();
        employee.setEmpNo(90765);
        employee.seteName("sahithi");
        employee.setJob("manager");
        employee.setMgr(0);
         employee.setSal(5500);
        employee.setComm(9990);
        employee.setDeptNo(20);
        
        EmployeeDAO de=(EmployeeDAO)c.getBean("edao");
     // de.insert(employee);
     // de.delete(employee);
      //  de.update(employee);
   //   de.getAll();
       // EmployeeServicesImpl services=new EmployeeServicesImpl();
//       services.deleteEmp(employee);
//       services.getMaxSal();. ,
//       services.getEmp(employee);
//       services.getWithoutComm();
//         List<Employee> list=  de.orderBy();
//       
      List<Employee> list=  de.getAll();
         for(Employee e1:list)
         {
        	 System.out.println(e1);
         }
//         
//      Map<Integer,String> list1=  de.groupBy();
//         
//         System.out.println(list1);
//        
	}

}
