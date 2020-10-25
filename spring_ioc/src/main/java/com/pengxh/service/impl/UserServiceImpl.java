package com.pengxh.service.impl;

import com.pengxh.dao.UserDao;
import com.pengxh.service.UserService;

/**
 * @program: SpringStudy
 * @description: TODO
 * @author: Pengxh
 * @create: 2020-10-25 14:09
 **/
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
