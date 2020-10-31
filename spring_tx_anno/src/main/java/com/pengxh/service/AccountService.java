package com.pengxh.service;

public interface AccountService {
    void serviceTransfer(String outAccountName, String inAccountName, double money);
}
