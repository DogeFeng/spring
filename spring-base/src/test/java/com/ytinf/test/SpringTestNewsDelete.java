package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestNewsDelete {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testDataSource() throws Exception {
        String sql = "DELETE FROM news WHERE nid=?";
        long nid = 3;
        int len = this.jdbcTemplate.update(sql, nid);
        System.out.println("更新行数：" + len);
    }
}

