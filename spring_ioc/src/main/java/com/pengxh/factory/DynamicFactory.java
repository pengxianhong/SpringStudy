package com.pengxh.factory;

import com.pengxh.dao.UserDao;
import com.pengxh.dao.impl.UserDaoImpl;

/**
 * @program: SpringStudy
 * @description: 动态工厂方式实例化Bean
 * @author: Pengxh
 * @create: 2020-10-25 13:47
 **/
public class DynamicFactory {

    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
