package com.ytinf.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private boolean exists;  // 是否存在
    private Set<Emp> emps ; // 保存部门对应的多个员工信息
    private Set<String> business ; // 部门的业务

    public Set<Emp> getEmps() {
        return emps;
    }

    public void setEmps(Set<Emp> emps) {
        this.emps = emps;
    }

    public Set<String> getBusiness() {
        return business;
    }

    public void setBusiness(Set<String> business) {
        this.business = business;
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
