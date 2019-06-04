package com.ytinf.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private boolean exists;  // 是否存在
    private Map<String,Emp> emps ; // 保存部门对应的多个员工信息

    public Map<String, Emp> getEmps() {
        return emps;
    }

    public void setEmps(Map<String, Emp> emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", exists=" + exists +
                '}';
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

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
