package com.pengxh.service.impl;

import com.pengxh.dao.AccountDao;
import com.pengxh.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Transactional(isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    @Override
    public void serviceTransfer(String outAccountName, String inAccountName, double money) {
        accountDao.transferOut(outAccountName, money);
        accountDao.transferIn(inAccountName, money);
    }
}
