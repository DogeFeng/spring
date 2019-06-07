package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestNewsUpdate {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Test
    public void testDataSource() throws Exception {
        // 所有使用的ORMapping组件都使用占位符形式的SQL语句
        String sql = "UPDATE news SET title=?,note=?,pubdate=? WHERE nid=?" ;
        String title = "未来三天都不上课，时间随意安排" ;
        String note = "于是我要赶回和我女朋友团结，因为长期分居。" ;
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("1998-10-10");
        long nid = 5 ;
        int len = this.jdbcTemplate.update(sql,title,note,date,nid) ;
        System.out.println("更新行数：" + len);
    }
}
