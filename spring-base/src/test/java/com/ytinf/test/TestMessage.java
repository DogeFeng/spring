package com.ytinf.test;

import com.ytinf.service.IMessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
    public static void main(String[] args) {
        // 进行配置文件的加载，利用此配置文件启动Spring容器，容器启动的时候自动进行Bean对象实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-base.xml");
        IMessageService service = context.getBean("messageService",IMessageService.class) ;
        System.out.println(service.echo("可爱的小李老师"));
    }
}
