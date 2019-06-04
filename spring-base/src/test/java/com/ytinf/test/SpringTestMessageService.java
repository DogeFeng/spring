package com.ytinf.test;

import com.ytinf.service.IMessageService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

// 如果要进行Spring测试，必须进行Spring容器的启动，那么此时可以直接利用此直接定义配置文件路径
@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
// 设置本次要执行的测试类型
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestMessageService {
    @Autowired                                  // 自动注入
    private IMessageService messageService ;    // 保留接口对象
    @Test
    public void testEcho() {
        String echoMessage = this.messageService.echo("小李老师") ;
        TestCase.assertEquals(echoMessage,"【ECHO】小李老师");
    }
}
