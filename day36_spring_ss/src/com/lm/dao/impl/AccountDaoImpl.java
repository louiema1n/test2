package com.lm.dao.impl;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.lm.dao.AccountDao;
import com.lm.domain.Account;

public class AccountDaoImpl extends HibernateDaoSupport implements AccountDao {

	public void save(Account account) {
		this.getHibernateTemplate().save(account);

	}

}
