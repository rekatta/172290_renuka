package com.org.bankimplservice;

import java.util.ArrayList;
import java.util.List;

import com.org.interfaces.BankAccountRepository;
import com.org.pojo.BankAccount;
public class BankAccountepositoryImpl implements BankAccountRepository {

	public List<BankAccount> dummydb() {
		
	List<BankAccount> l1=new ArrayList();
    l1.add(new BankAccount(101,"renu","saving",25000));
    l1.add(new BankAccount(102,"pooja","saving",30000));
    l1.add(new BankAccount(102,"raja","current",10000));
	return l1;
	
	}
	double account_balance=0;
	
	@Override
	public double getBalance(long accountId) {
		List<BankAccount> value=dummydb();
		for(BankAccount l:value)
		{
			if(accountId==l.getAccountId())
			{
				account_balance = l.getAccountBalance();
			}
		}
		
		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		
		return 0;
	}

}
