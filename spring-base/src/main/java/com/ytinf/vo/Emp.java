package com.ytinf.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Emp implements Serializable {
    private Long empno ;
    private String ename ;
    private Double salary ;
    private Date hiredate ;
    private Integer age ;
    private Dept dept ;

    public Dept getDept() {
        return dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return empno.equals(emp.empno) &&
                ename.equals(emp.ename) &&
                salary.equals(emp.salary) &&
                age.equals(emp.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empno, ename, salary, age);
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public Long getEmpno() {
        return empno;
    }

    public void setEmpno(Long empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", salary=" + salary +
                ", hiredate=" + hiredate +
                ", age=" + age +
                '}';
    }
}
