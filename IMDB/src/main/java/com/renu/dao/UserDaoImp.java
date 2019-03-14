package com.renu.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.renu.pojo.User;

public class UserDaoImp implements UserDao
{

	@Autowired

	private JdbcTemplate jdbcTemplate;
	String emailid;
	String password1;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {  
	    this.jdbcTemplate = jdbcTemplate;  
	} 

	@Override
	public boolean insert(final User u) {
		String query="insert into users values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){  
		    @Override  
		    public Boolean doInPreparedStatement(PreparedStatement ps)  
		            throws SQLException, DataAccessException {  
		    	  ps.setString(1, u.getUser_emailid());
				  ps.setString(2, u.getUser_password());
				  ps.setString(3, u.getUser_phonenumber());
				 
				return ps.execute();
		    }          
		    });
		
	}

	@Override
	public List<User> getUser() {

		 String sql="select user_emailid,user_password from users";                                  
		return this.jdbcTemplate.query(sql, new UserMapper());
		
	}

	
	public boolean validation(String email,String password) {
		boolean status = false;
		
		List<User> list= getUser();
		
		for(User user:list)
		{
			emailid=user.getUser_emailid();
			password1=user.getUser_password();
			
			if(emailid.equals(email)&&password1.equals(password))
			{
				status= true;
				return status;
				
			}
			System.out.println(status);
		}
		return status;
		
	}
}