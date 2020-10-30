package com.pengxh.dao;

public interface AccountDao {
    void daoTransfer(String outAccountName, String inAccountName, double money);
}
