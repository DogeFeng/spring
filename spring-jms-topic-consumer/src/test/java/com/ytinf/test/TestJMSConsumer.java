package com.ytinf.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJMSConsumer {
    @Test
    public void start() throws Exception {
        Thread.sleep(Long.MAX_VALUE);
    }
}
