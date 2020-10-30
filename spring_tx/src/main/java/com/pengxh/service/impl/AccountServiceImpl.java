package com.pengxh.service.impl;

import com.pengxh.dao.AccountDao;
import com.pengxh.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;

    @Override
    public void serviceTransfer(String outAccountName, String inAccountName, double money) {
        accountDao.daoTransfer(outAccountName, inAccountName, money);
    }
}
