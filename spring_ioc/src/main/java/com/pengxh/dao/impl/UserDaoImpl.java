package com.pengxh.dao.impl;

import com.pengxh.dao.UserDao;

/**
 * @program: SpringStudy
 * @description: 实现类
 * @author: Pengxh
 * @create: 2020-10-25 12:51
 **/
public class UserDaoImpl implements UserDao {

    private String userName;
    private int age;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void save() {
        System.out.println(userName + "=====" + age);
        System.out.println("save running...");
    }
}
