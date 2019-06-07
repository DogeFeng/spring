package com.ytinf.test;

import com.ytinf.vo.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestGetNews {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Test
    public void testSelect() throws Exception {
        String sql = "SELECT nid,title,note,pubdate,price,readcount FROM news WHERE nid=?" ;
        List<News> list = this.jdbcTemplate.query(sql, new Object[]{5}, new RowMapper<News>() {
            @Override
            public News mapRow(ResultSet rs, int i) throws SQLException {
                News vo = new News();
                vo.setNid(rs.getLong(1));
                vo.setTitle(rs.getString(2));
                vo.setNote(rs.getString(3));
                vo.setPubdate(rs.getDate(4));
                vo.setPrice(rs.getDouble(5));
                vo.setReadcount(rs.getInt(6));
                return vo;
            }
        });
        System.out.println(list.get(0));
    }
}
