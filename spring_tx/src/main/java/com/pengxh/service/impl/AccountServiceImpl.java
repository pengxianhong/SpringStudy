package com.pengxh.service.impl;

import com.pengxh.dao.AccountDao;
import com.pengxh.dao.impl.AccountDaoImpl;
import com.pengxh.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDaoImpl accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void serviceTransfer(String outAccountName, String inAccountName, double money) {
        accountDao.transferOut(outAccountName, money);
        //模拟事务失败场景
//        int i = 1 / 0;
        accountDao.transferIn(inAccountName, money);
    }
}
