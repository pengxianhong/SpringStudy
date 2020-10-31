package com.pengxh.dao.impl;

import com.pengxh.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //出账
    @Override
    public void transferOut(String outAccountName, double money) {
        jdbcTemplate.update("update account set money = money + ? where name = ?", money, outAccountName);
    }

    //入账
    @Override
    public void transferIn(String inAccountName, double money) {
        jdbcTemplate.update("update account set money = money - ? where name = ?", money, inAccountName);
    }
}
