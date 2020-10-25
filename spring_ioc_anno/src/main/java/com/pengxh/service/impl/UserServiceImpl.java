package com.pengxh.service.impl;

import com.pengxh.dao.UserDao;
import com.pengxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @program: SpringStudy
 * @description: TODO
 * @author: Pengxh
 * @create: 2020-10-25 16:42
 **/

/**
 * 第二步：再将配置文件的Service层最外层注解，采用Component注解，参数为bean id
 * 源配置如下：
 * <bean id="userService" class="com.pengxh.service.impl.UserServiceImpl">
 * <p>
 * <p>
 * 第三步：然后将Service层里面的property注解，采用Autowired和Qualifier注解，参数为bean id
 * 源配置如下：
 * <property name="userDao" ref="userDao"/>
 */
@Component("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("userDao")
    private UserDao userDao;

    @Override
    public void serviceSave() {
        userDao.daoSave();
    }
}
