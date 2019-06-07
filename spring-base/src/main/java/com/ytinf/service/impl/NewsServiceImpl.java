package com.ytinf.service.impl;

import com.ytinf.dao.INewsDAO;
import com.ytinf.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private INewsDAO newsDAO ;
    @Override
    public boolean remove(long id) {
        return this.newsDAO.doRemove(id);
    }
}
