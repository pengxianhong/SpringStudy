package com.pengxh.dao;

public interface AccountDao {

    void transferOut(String outAccountName, double money);

    void transferIn(String inAccountName, double money);
}
