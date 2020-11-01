package com.pengxh.service.impl;

import com.pengxh.dao.UserDao;
import com.pengxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: spring_tx
 * @description:
 * @author: Pengxh
 * @Email: 290677893@qq.com
 * @create: 2020-10-31 23:32
 **/

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void serviceSave() {
        userDao.daoSave();
    }
}
