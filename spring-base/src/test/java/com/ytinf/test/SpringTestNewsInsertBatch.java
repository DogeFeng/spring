package com.ytinf.test;

import com.ytinf.vo.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestNewsInsertBatch {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static List<News> all = new ArrayList<>();

    static {
        for (int x = 0; x < 10; x++) {
            News vo = new News();
            vo.setTitle("周末愉快 - " + x);
            vo.setNote("好好休息 - " + x);
            vo.setPubdate(new Date());
            vo.setPrice(1000.0);
            vo.setReadcount(x);
            all.add(vo);
        }
    }
    @Test
    public void testDataSource() {
        String sql = "INSERT INTO news(title,note,pubdate,price,readcount) VALUES (?,?,?,?,?)";
        int[][] result = this.jdbcTemplate.batchUpdate(sql, all, all.size(), new ParameterizedPreparedStatementSetter<News>() {
            @Override
            public void setValues(PreparedStatement pstmt, News news) throws SQLException {
                pstmt.setString(1, news.getTitle());
                pstmt.setString(2, news.getNote());
                pstmt.setDate(3, new java.sql.Date(news.getPubdate().getTime()));
                pstmt.setDouble(4, news.getPrice());
                pstmt.setInt(5, news.getReadcount());
            }
        });
        for (int x = 0 ; x < result.length ; x ++) {
            System.out.println("更新行数：" + Arrays.toString(result[x]));
        }
    }
}
