package com.lm.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lm.service.AccountService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestAccount {
	
	@Autowired
	private AccountService accountService;

	@Test
	public void demo() {
		Account account = new Account();
		account.setName("ÍõÎå");
		account.setMoney(1500);
		
		accountService.add(account);
	}
	
	@Test
	public void demo2() {
		
	}
		
	@Test
	public void demo3() {
		
	}
}
