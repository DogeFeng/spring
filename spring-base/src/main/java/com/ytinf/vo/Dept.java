package com.ytinf.vo;

import java.beans.ConstructorProperties;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Dept implements Serializable {
    private Long deptno;
    private String dname;

    @ConstructorProperties(value = {"param_deptno", "param_dname"})
    public Dept(Long deptno, String dname) {
        this.deptno = deptno;
        this.dname = dname;
    }
    // 只提供有相应的getter方法 ...
    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }

    public Long getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }
}
