package com.pengxh.demo;

import com.pengxh.config.SpringConfiguration;
import com.pengxh.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserController {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        UserService userService = (UserService) context.getBean("userService");
        userService.serviceSave();
    }
}
