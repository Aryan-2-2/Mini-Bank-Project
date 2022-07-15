package com.masai.usecase;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.masai.Entity.Account;

public class CreateAccount {

	public static void main(String[] args) {
		
		
		Account acc = new Account();
		acc.setAccountHolderName("Brajkishor");
		acc.setBalance(60000);
		
		AccountDao dao = new AccountDaoImpl();
		
	   boolean output =	dao.createAccount(acc);
		
	   
	   if(output == true) {
			System.out.println("Account Created...");
		   
	   }else {
			System.out.println("Failed to Create Account...");
		   
	   }
	}
}
