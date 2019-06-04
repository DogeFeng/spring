package com.ytinf.vo;

import java.io.Serializable;

public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    public Dept() {
        System.err.println("*************** 实例化Dept类对象 ***************");
    }

    @Override
    public String toString() {
        return "【对象地址编码：" + super.toString() + "】deptno = " + this.deptno + "、dname = " + this.dname;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
