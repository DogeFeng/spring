package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestGetCount {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    private String column = "title" ;
    private String keyword = "" ;
    @Test
    public void testSelect() throws Exception {
        String sql = "SELECT COUNT(*) FROM news WHERE " + column + " LIKE ?" ;
        Long result = this.jdbcTemplate.queryForObject(sql, new Object[]{"%" + keyword + "%"},Long.class) ;
        System.out.println("数据行数：" + result);
    }
}
