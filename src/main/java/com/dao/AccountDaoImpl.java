package com.dao;

import javax.persistence.EntityManager;

import com.masai.Entity.Account;
import com.utitltiy.DbUtil;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account findAccount(int accountNo) {
	
		return DbUtil.provideEntityManager().find(Account.class, accountNo);
		
	}

	@Override
	public boolean createAccount(Account account) {
		
		boolean flag = false;
		
	EntityManager em =	DbUtil.provideEntityManager();
	
	em.getTransaction().begin();
	em.persist(account);
	flag = true;
	em.getTransaction().commit();
		
	em.close();
	
	return flag;
	}

	@Override
	public boolean update(Account account) {
		
	boolean flag = false;
		
	EntityManager em =	DbUtil.provideEntityManager();
	
	em.getTransaction().begin();
	em.merge(account);
	flag = true;
	em.getTransaction().commit();
	
	em.close();
	
		
	return flag;
	}

	@Override
	public boolean delete(int accountNo) {
		
		boolean flag = false;
		
	EntityManager em =	DbUtil.provideEntityManager();
		
	Account acc = em.find(Account.class, accountNo);
		
	if(acc != null) {
		
		em.getTransaction().begin();
		em.remove(acc);
		flag = true;
		em.getTransaction().commit();
		
		em.close();
	}
		
		return flag;
	}
	
	
	
	
	

}




