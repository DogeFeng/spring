package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestNewsInsert {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Test
    public void testDataSource() {
        // 所有使用的ORMapping组件都使用占位符形式的SQL语句
        String sql = "INSERT INTO news(title,note,pubdate,price,readcount) VALUES (?,?,?,?,?)" ;
        String title = "周末要好好休息" ;
        String note = "慵懒的周末，适合于睡觉，适合于游玩！" ;
        Date date = new Date() ;
        double price = 10000.99 ;
        int readcount = 500 ;
        // 直接使用JdbcTemplate执行更新的处理操作，更新的时候只需要传入SQL和相应的参数内容即可
        int len = this.jdbcTemplate.update(sql,title,note,date,price,readcount) ;
        System.out.println("更新行数：" + len);
    }
}
