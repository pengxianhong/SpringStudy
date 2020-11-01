package com.pengxh.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: spring_tx
 * @description: 上下文监听器（可以用Spring封装好的监听器代替）
 * @author: Pengxh
 * @Email: 290677893@qq.com
 * @create: 2020-11-01 22:29
 **/
public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();
        String configLocation = servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(configLocation);

        //将applicationContext存储到最大的域中ServletContext
        servletContext.setAttribute("app", applicationContext);
        System.out.println("Create ApplicationContext");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
