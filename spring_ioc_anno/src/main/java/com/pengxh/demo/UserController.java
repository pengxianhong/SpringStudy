package com.pengxh.demo;

import com.pengxh.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: SpringStudy
 * @description: TODO
 * @author: Pengxh
 * @create: 2020-10-25 16:46
 **/
public class UserController {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        userService.serviceSave();
    }
}
