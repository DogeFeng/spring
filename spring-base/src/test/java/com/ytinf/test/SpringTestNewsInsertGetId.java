package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestNewsInsertGetId {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Test
    public void testDataSource() {
        KeyHolder keyHolder = new GeneratedKeyHolder() ; // 获取主键的类
        String sql = "INSERT INTO news(title,note,pubdate,price,readcount) VALUES (?,?,?,?,?)" ;
        String title = "周末要好好休息" ;
        String note = "慵懒的周末，适合于睡觉，适合于游玩！" ;
        Date date = new Date() ;
        double price = 10000.99 ;
        int readcount = 500 ;
        int len = this.jdbcTemplate.update(new PreparedStatementCreator() {
            @Override
            public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
                PreparedStatement pstmt = connection.prepareStatement(sql) ;    // 手工创建对象
                pstmt.setString(1,title);
                pstmt.setString(2,note);
                pstmt.setDate(3,new java.sql.Date(date.getTime()));
                pstmt.setDouble(4,price);
                pstmt.setInt(5,readcount);
                return pstmt;
            }
        },keyHolder) ;
        System.out.println("更新行数：" + len + "、当前主键：" + keyHolder.getKey());
    }
}
