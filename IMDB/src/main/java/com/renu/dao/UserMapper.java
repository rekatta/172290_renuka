package com.renu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.renu.pojo.User;



public class UserMapper implements RowMapper<User> {
	@Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		
        User u=new User();
        u.setUser_emailid(rs.getString("user_emailid"));
       u.setUser_password(rs.getString("user_password"));
        return u;
    }
}
