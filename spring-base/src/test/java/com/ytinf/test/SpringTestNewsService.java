package com.ytinf.test;

import com.ytinf.service.INewsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestNewsService {
    @Autowired
    private INewsService newsService ;
    @Test
    public void testRemove() {
        System.out.println(this.newsService.remove(7));
    }
}
