package com.lm.service.impl;


import org.springframework.beans.factory.annotation.Autowired;

import com.lm.dao.AccountDao;
import com.lm.domain.Account;
import com.lm.service.AccountService;

public class AccountServiceImpl implements AccountService {

	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	
	public void add(Account account) {
		accountDao.save(account);
	}

}
