package com.org.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowCallbackHandler;

import javax.swing.tree.TreePath;

import com.org.pojo.Employee;

public class EmployeeMapper implements org.springframework.jdbc.core.RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setEmpNo(rs.getInt("empno"));
        employee.seteName(rs.getString("ename"));
        employee.setJob(rs.getString("job"));
        employee.setMgr(rs.getInt("mgr"));
      //employee.setHiredate(rs.getDate("hiredate"));
        employee.setSal(rs.getInt("sal"));
        employee.setComm(rs.getInt("comm"));
        employee.setDeptNo(rs.getInt("deptno"));
        return employee;
    }

	public int[] getRowsForPaths(TreePath[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}
}
