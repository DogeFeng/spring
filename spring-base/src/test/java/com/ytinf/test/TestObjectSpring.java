package com.ytinf.test;

import com.ytinf.vo.Message;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObjectSpring {
    public static void main(String[] args) {
        // 如果要想实现销毁的操作处理，那么必须依靠子类的方法才可以完成
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-base.xml");
        Message message = context.getBean("message", Message.class); // 获取Bean对象
        message.send("Hello World!");
        context.registerShutdownHook();
    }
}
