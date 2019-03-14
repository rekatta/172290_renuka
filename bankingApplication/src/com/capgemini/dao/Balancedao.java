package com.capgemini.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capgemini.accountDetails.BankAccount;
import com.capgemini.classes.ConnectionFactory;

public class Balancedao {
	public void insert(BankAccount ac) throws SQLException {
		String query="insert into bank values(?)";
		Connection conn =ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setDouble(1,ac.getAccountBalance());
		pStatement.executeUpdate();
	}
	
	public double getBalance() throws SQLException {
		String query="select balance from bank";
		BankAccount acc=null;
		double bal = 0;
		Connection conn = ConnectionFactory.getConnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			acc=new BankAccount();
			bal=resultSet.getDouble("balance");
		}
		return bal;
	}
}
