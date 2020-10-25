package com.pengxh.dao.impl;

import com.pengxh.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * 第一步：先将配置文件的Dao层注解，采用Repository注解，参数为bean id
 * Repository是Component的细化，用于Dao层实例化
 * 源配置如下：
 * <bean id="userDao" class="com.pengxh.dao.impl.UserDaoImpl"/>
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void daoSave() {
        System.out.println("UserDaoImpl: daoSave");
    }
}
