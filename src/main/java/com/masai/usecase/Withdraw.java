package com.masai.usecase;

import java.util.Scanner;

import com.dao.AccountDao;
import com.dao.AccountDaoImpl;
import com.masai.Entity.Account;

public class Withdraw {

	public static void main(String[] args) {
		
		AccountDao dao = new AccountDaoImpl();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the account no to withdraw...");
		int accountNo = sc.nextInt();
		
	Account acc = dao.findAccount(accountNo);
		
	if(acc != null) {
		
		System.out.println("Enter the amount...");
		int amount = sc.nextInt();
		
		if(amount<=acc.getBalance()) {
		
		acc.setBalance(acc.getBalance()-amount);
		dao.update(acc);
		
		}else {
			System.out.println("Insufficent Balance...");
		}
		
		System.out.println("Amount withdrawn Successfully...");
	}else {
		System.out.println("Account Does'nt Found...");
	}
	
	}
}
