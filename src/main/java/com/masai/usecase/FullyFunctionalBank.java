package com.masai.usecase;

import java.util.Scanner;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.masai.Entity.Account;

public class FullyFunctionalBank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 3;
		
		for(int i=1 ; i<=3 ; i++) {
			
			
         x--;			
			
			
			System.out.println("Enter: 1 to create account...");
			System.out.println("Enter: 2 if you are a existing customer...");

			int one = sc.nextInt();
			
			if(one == 1) {
				
				AccountDao dao = new AccountDaoImpl();
				
				Account acc = new Account();
				
				System.out.println("Enter your name...");
				String name = sc.next();
			

				System.out.println("Enter your first deposit...");
				int deposit = sc.nextInt();
				
				acc.setAccountHolderName(name);
				acc.setBalance(deposit);
				
				dao.createAccount(acc);
				
				
				System.out.println("Your Account is Successfully Opened...");
				
			}
			
			else if(one==2) {
				
				System.out.println("Enter your account no...");
				int accNo = sc.nextInt();
				
				AccountDao dao = new AccountDaoImpl();
				
			    Account acc = dao.findAccount(accNo);
			    
			    if(acc != null ) {
			    	
			    	System.out.println("Enter:1 to see balance...");
			    	System.out.println("Enter:2 to deposit money...");
			    	System.out.println("Enter:3 to withdraw money..");

			    	    int choice = sc.nextInt();
			    	
			    	    if(choice == 1) {
			    		System.out.println("balance is :"+acc.getBalance());
			    	
			    		System.out.println("-------------------------------");

			    		System.out.println("Enter:2 to deposit money...");
				    	System.out.println("Enter:3 to withdraw money..");
				    	
				    	int choice2 = sc.nextInt();
				    	
				    	if(choice2 == 2) {
				    		
				    		System.out.println("Enter the amount...");
				    		int amount = sc.nextInt();

				    		acc.setBalance(acc.getBalance()+amount);
				    		dao.update(acc);
				    		
				    		System.out.println("Amount deposited Succenssfully...");
				    		
				    		System.out.println("Total balance is :" +acc.getBalance());
				    		
				    		
				    	}
				    	else if(choice2 == 3) {
				    		
				    		System.out.println("Enter the amount...");
				    		int amount = sc.nextInt();

				    		acc.setBalance(acc.getBalance()-amount);
				    		dao.update(acc);
				    		
				    		System.out.println("Amount withdrawn Succenssfully...");
				    		
				    		System.out.println("Total balance is :" +acc.getBalance());
				    		
				    		
				    	}else {
				    		System.err.println("Invalid Attempt...");
				    	}
				    	
			    	}
			    	else if(choice == 2) {
			    		
			    		System.out.println("Enter the amount...");
			    		int amount = sc.nextInt();

			    		acc.setBalance(acc.getBalance()+amount);
			    		dao.update(acc);
			    		
			    		System.out.println("Amount deposited Succenssfully...");
			    		
			    		System.out.println("Total balance is :" +acc.getBalance());
			    		
			    		
			    	}else if(choice == 3) {
			    		
			    		System.out.println("Enter the amount...");
			    		int amount = sc.nextInt();

			    		acc.setBalance(acc.getBalance()-amount);
			    		dao.update(acc);
			    		
			    		System.out.println("Amount withdrawn Succenssfully...");
			    		
			    		System.out.println("Total balance is :" +acc.getBalance());
			    		
			    		
			    	}
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    	
			    }else {
			    	System.err.println("Account does't exist...");
			    }
			    
				 
				 
				
			}else {
				System.err.println("Inncorect Attempt...Remaining " + x +" Attempt Left...");
			}
			
		}
			
		
		System.err.println("You Are Blocked...");
	}
	
}
