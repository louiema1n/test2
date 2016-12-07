package com.lm.web.action;

import com.lm.domain.Account;
import com.lm.service.AccountService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AccountAction extends ActionSupport implements
		ModelDriven<Account> {

	//1.封装数据
	private Account account = new Account();
	
	public Account getModel() {
		return account;
	}
	
	//2.调用service
	private AccountService accountService;
	public void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	public String add() {
		accountService.add(account);
		return "success";
	}
}
