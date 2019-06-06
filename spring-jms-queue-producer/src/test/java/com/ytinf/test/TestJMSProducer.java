package com.ytinf.test;

import com.ytinf.service.IMessageService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestJMSProducer {
    @Autowired
    private IMessageService messageService;    // 注入MessageService对象

    @Test
    public void testSend() throws Exception {
        for (int x = 0; x < 100; x++) {
            this.messageService.send("【" + Thread.currentThread().getName() + "】晚上一起吃粽子，好嗨皮哦，消息编号：" + x);
        }
    }
}
