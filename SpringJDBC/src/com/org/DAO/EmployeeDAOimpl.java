package com.org.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.org.myAnnotation.Loggable;
import com.org.pojo.Employee;

public class EmployeeDAOimpl implements EmployeeDAO{
	

	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	} 

	
	public List<Employee> getAll() {
		 String sql="select * from emp";
			return this.jdbcTemplate.query( sql, new EmployeeMapper());
	}

	@Override
@Loggable
	public boolean insert(Employee e) {
		
		String query="insert into emp values(?,?,?,?,?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		              
		        ps.setInt(1,e.getEmpNo());  
		        ps.setString(2,e.geteName());  
		        ps.setString(3,e.getJob());  
		        ps.setInt(4, e.getMgr());
		        ps.setInt(5,(int) e.getSal());
		        ps.setInt(6,(int)e.getComm());
		        ps.setInt(7, e.getDeptNo());
		        return ps.execute();  
		    }          
		    });
	
	}

	@Override
	public boolean delete(Employee e) {
		String SQL = "delete from emp where empno = "+e.getEmpNo();
	      this.jdbcTemplate.update(SQL);
	      System.out.println("Deleted Record with ID = " + e.getEmpNo());
		return true;
	}

	@Override
	public boolean update(Employee e) {
		
		String updateQuery = "update emp set sal = ? where empno = ?";
		this.jdbcTemplate.update(updateQuery, e.getSal(), e.getEmpNo());
	    return true;
	    
	}

	@Override
	public  List<Employee> orderBy() {
	String orderbyQuery="select * from emp order by empno ";
	return this.jdbcTemplate.query(orderbyQuery, new EmployeeMapper());
	
	}

	@Override
	public Map<Integer,String> groupBy() {
		String groupby=" select count(empno),job FROM emp GROUP BY job ";
		return (Map<Integer, String>) this.jdbcTemplate.query(groupby, new EmployeeMapper());
	}


	public List<Employee> employee(Employee e) {
		
		 String sql="select * from emp";
			return this.jdbcTemplate.query( sql, new EmployeeMapper());
	}



	


	


	
	
}