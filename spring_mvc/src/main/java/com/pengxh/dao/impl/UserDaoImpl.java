package com.pengxh.dao.impl;

import com.pengxh.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @program: spring_tx
 * @description:
 * @author: Pengxh
 * @Email: 290677893@qq.com
 * @create: 2020-10-31 23:32
 **/

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void daoSave() {
        System.out.println("UserDaoImpl");
    }
}
