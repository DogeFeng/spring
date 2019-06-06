package com.ytinf.main;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

public class StartConsumer {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring/spring-base.xml") ;
    }
}
