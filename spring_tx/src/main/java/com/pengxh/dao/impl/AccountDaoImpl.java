package com.pengxh.dao.impl;

import com.pengxh.config.SpringConfiguration;
import com.pengxh.dao.AccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {SpringConfiguration.class})
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {

    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void daoTransfer(String outAccountName, String inAccountName, double money) {
        //入账
        template.update("update account set money = money - ? where name = ?", money, inAccountName);
        //出账
        template.update("update account set money = money + ? where name = ?", money, outAccountName);
    }
}
