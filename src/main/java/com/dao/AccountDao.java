package com.dao;

import com.masai.Entity.Account;

public interface AccountDao {

	public Account findAccount(int accountNo);
	public boolean createAccount(Account account);
	public boolean update(Account account);
	public boolean delete(int accountNo);

	
	
}
