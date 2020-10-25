package com.pengxh.dao.impl;

import com.pengxh.dao.UserDao;
import org.springframework.stereotype.Component;

/**
 * @program: SpringStudy
 * @description: TODO
 * @author: Pengxh
 * @create: 2020-10-25 16:40
 **/

/**
 * 第一步：先将配置文件的Dao层注解，采用Component注解，参数为bean id
 * 源配置如下：
 * <bean id="userDao" class="com.pengxh.dao.impl.UserDaoImpl"/>
 */
@Component("userDao")
public class UserDaoImpl implements UserDao {

    @Override
    public void daoSave() {
        System.out.println("UserDaoImpl: daoSave");
    }
}
