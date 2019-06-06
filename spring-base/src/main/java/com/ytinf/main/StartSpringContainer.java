package com.ytinf.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartSpringContainer {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("classpath:spring/spring-base.xml") ;
    }
}
