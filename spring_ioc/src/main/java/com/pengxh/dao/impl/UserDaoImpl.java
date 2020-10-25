package com.pengxh.dao.impl;

import com.pengxh.dao.UserDao;

/**
 * @program: SpringStudy
 * @description: 实现类
 * @author: Pengxh
 * @create: 2020-10-25 12:51
 **/
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }

    public void init(){
        System.out.println("init: ");
    }

    @Override
    public void save() {
        System.out.println("save running...");
    }

    public void destroy(){
        System.out.println("destroy: ");
    }
}
