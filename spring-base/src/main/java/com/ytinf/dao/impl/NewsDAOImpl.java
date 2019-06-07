package com.ytinf.dao.impl;

import com.ytinf.dao.INewsDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NewsDAOImpl implements INewsDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Override
    public boolean doRemove(Long id) {
        String sql = "DELETE FROM news WHERE nid=?";
        return this.jdbcTemplate.update(sql, id) > 0 ;
    }
}
