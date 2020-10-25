package com.pengxh.test;

import com.pengxh.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringStudy
 * @description: 测试
 * @author: Pengxh
 * @create: 2020-10-25 13:06
 **/
public class SpringTest {
    @Test
    public void test1() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl userService = (UserServiceImpl) app.getBean("userService");
        userService.save();
    }
}
