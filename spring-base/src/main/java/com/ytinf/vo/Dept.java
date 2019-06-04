package com.ytinf.vo;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Dept implements Serializable {
    private Long deptno;
    private String dname;
    private boolean exists;  // 是否存在
    private Properties projects ;

    public Properties getProjects() {
        return projects;
    }

    public void setProjects(Properties projects) {
        this.projects = projects;
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
