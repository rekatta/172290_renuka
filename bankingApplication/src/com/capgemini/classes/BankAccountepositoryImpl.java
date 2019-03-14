package com.capgemini.classes;

import java.sql.SQLException;

import com.capgemini.dao.Balancedao;
import com.capgemini.interfaces.BankAccountRepository;

public class BankAccountepositoryImpl implements BankAccountRepository{

	@Override
	public double getBalance(long accountId) throws SQLException{
		Balancedao blncedao=new Balancedao();
		return (blncedao.getBalance());
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
