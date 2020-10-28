package com.pengxh.test;

import com.pengxh.bean.User;
import com.pengxh.config.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @program: spring_ioc_anno
 * @description: 测试
 * @author: Pengxh
 * @Email: 290677893@qq.com
 * @create: 2020-10-28 21:15
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringConfiguration.class})
public class JdbcTemplateTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testJdbcTemplate() {
        //增加数据
        jdbcTemplate.update("insert into student values (3,'王五',25,'男','15301077519','常德市武陵区柳叶湖新区')");

        //删除数据
        jdbcTemplate.update("delete from student where phone = ?"
                , "13391634020");

        //修改数据
        jdbcTemplate.update("update student set address = ? where name = ?"
                , "北京市海淀区苏家坨镇西小营村苏家坨小学对面超市209", "张三");

        //数据库查询
        Long size = jdbcTemplate.queryForObject("select count(*) from student", Long.class);
        List<User> users = jdbcTemplate.query("select * from student", new BeanPropertyRowMapper<>(User.class));
        System.out.println(size);
        System.out.println(users);
    }
}
