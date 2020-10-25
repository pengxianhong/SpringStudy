package com.pengxh.demo;

import com.pengxh.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringStudy
 * @description: 测试
 * @author: Pengxh
 * @create: 2020-10-25 12:55
 **/
public class UserDaoDemo {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");//applicationContext里面对应Impl的id
        userDao.save();
    }
}
