package com.ytinf.aop;

public class ServiceAdvice {    // 该类没有任何强制性的继承要求
    public void beforeHandle() {    // 在业务操作之前进行调用
        System.err.println("【ServiceAdvice - beforeHandle()】业务调用之前。");
    }
    public void afterHandle() {
        System.err.println("【ServiceAdvice - afterHandle()】业务调用之后。");
    }
}
