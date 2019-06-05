package com.ytinf.vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;
@Component
public class Dept implements Serializable {
    @Value("#{item.createtion?.time}")
    private Long deptno;    // 将创建日期的时间数字作为部门编号
    @Value("#{item.title + '多可爱的部门'}")
    private String dname;
    @Value("#{item.contents[1]}")
    private String bussiness ;

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", bussiness='" + bussiness + '\'' +
                '}';
    }
}
