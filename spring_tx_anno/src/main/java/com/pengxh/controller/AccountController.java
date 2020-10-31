package com.pengxh.controller;

import com.pengxh.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AccountService accountService = applicationContext.getBean(AccountService.class);
        accountService.serviceTransfer("张三", "李四", 3000);
    }
}
