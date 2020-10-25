package com.pengxh.service.impl;

import com.pengxh.dao.UserDao;
import com.pengxh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 第二步：再将配置文件的Service层最外层注解，采用Component注解，参数为bean id
 * Service是Component的细化，用于Service层实例化
 * 源配置如下：
 * <bean id="userService" class="com.pengxh.service.impl.UserServiceImpl">
 * <p>
 * <p>
 * 第三步：然后将Service层里面的property注解，采用Autowired和Qualifier注解，参数为bean id
 * 源配置如下：
 * <property name="userDao" ref="userDao"/>
 * 注：
 * Autowired：按照数据类型从Spring容器中匹配
 * Qualifier：按照Bean id进行匹配，必须要和Autowired一起使用，只有唯一的Bean时，可以直接省略@Qualifier注解，如果有多个Bean时，不能省略
 * Resource：相当于@Autowired和@Qualifier
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void serviceSave() {
        userDao.daoSave();
    }
}
