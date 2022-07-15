package com.masai.usecase;

import java.util.Scanner;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.masai.Entity.Account;

public class Depost {

	public static void main(String[] args) {
		
		
	AccountDao dao = new AccountDaoImpl();
	
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter Acc no to Deposit Amount");
	int accountNo = sc.nextInt();
	
   Account acc = dao.findAccount(accountNo);
   
   if(acc != null) {
	   System.out.println("Enter the amount You Want to add... ");
	   int amount = sc.nextInt();
	   
	   acc.setBalance(acc.getBalance()+amount);
	   dao.update(acc);
	   
	   System.out.println("Amount added Successfully..");
   }else {
	   System.out.println("Account Does'nt exist...");
   }
		
		
		
		
		
		
	}
}
