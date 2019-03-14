package com.capgemini.interfaces;

import java.sql.SQLException;

public interface BankAccountRepository {
	public double getBalance(long accountId) throws SQLException;
	public double updateBalance(long accountId, double newBalance);
}
