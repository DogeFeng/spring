package com.ytinf.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
@Aspect // 表示当前是一个AOP的控制程序类
public class ServiceAdvice {    // 该类没有任何强制性的继承要求
    @Before(value="execution(public * com.ytinf.service..*.*(..)) and args(vo)",argNames = "vo")
    public void beforeHandle(Object param) {    // 在业务操作之前进行调用
        System.err.println("【ServiceAdvice - beforeHandle()】业务调用之前、param = " + param);
    }
    @After("execution(public * com.ytinf.service..*.*(..))")
    public void afterHandle() {
        System.err.println("【ServiceAdvice - afterHandle()】业务调用之后。");
    }
    @AfterThrowing(value = "execution(public * com.ytinf.service..*.*(..))",throwing = "e",argNames = "e")
    public void throwHandle(Exception exp) {  // 异常产生的后置通知
        System.err.println("【ServiceAdvice - throwHandle()】代码出现异常：" + exp);
    }
    @AfterReturning(value="execution(public * com.ytinf.service..*.*(..))",returning = "res",argNames = "res")
    public void returnHandle(Object result) {   // 调用完毕返回结果
        System.err.println("【ServiceAdvice - returnHandle()】执行结果：" + result);
    }
    @Around("execution(public * com.ytinf.service..*.*(..))")
    public Object aroundHandle(ProceedingJoinPoint point) { // 获取所有的请求内容
        System.err.println("【☆☆☆ ServiceAdvice - aroundHandle() - BEFORE】方法执行之前：" + Arrays.toString(point.getArgs()));
        Object result = null ; // 保存最终结果
        try {
            result = point.proceed(point.getArgs()) ; // 调用真实的业务主题
            System.err.println("【☆☆☆ ServiceAdvice - aroundHandle() - RETURNING】返回执行完毕有返回值：" + result);
        } catch (Throwable e) {
            System.err.println("【☆☆☆ ServiceAdvice - aroundHandle() - THROWING】方法产生了异常：" + e);
        }
        System.err.println("【☆☆☆ ServiceAdvice - aroundHandle() - AFTER】方法全部执行完毕。");
        return true ;
    }
}
