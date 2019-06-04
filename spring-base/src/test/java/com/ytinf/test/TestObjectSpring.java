package com.ytinf.test;

import com.ytinf.vo.Dept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestObjectSpring {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-base.xml");
        for (int x = 0; x < 20; x++) {
            new Thread(() -> {
                System.out.println("｛" + Thread.currentThread().getName() + "｝" + context.getBean("dept", Dept.class));
            }).start();
        }
    }
}
