package com.ytinf.aop;

public class ServiceAdvice {    // 该类没有任何强制性的继承要求
    public void beforeHandle(Object param) {    // 在业务操作之前进行调用
        System.err.println("【ServiceAdvice - beforeHandle()】业务调用之前、param = " + param);
    }
    public void afterHandle() {
        System.err.println("【ServiceAdvice - afterHandle()】业务调用之后。");
    }
    public void throwHandle(Exception exp) {  // 异常产生的后置通知
        System.err.println("【ServiceAdvice - throwHandle()】代码出现异常：" + exp);
    }
    public void returnHandle(Object result) {   // 调用完毕返回结果
        System.err.println("【ServiceAdvice - returnHandle()】执行结果：" + result);
    }
}
