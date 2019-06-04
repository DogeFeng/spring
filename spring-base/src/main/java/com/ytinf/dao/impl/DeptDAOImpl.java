package com.ytinf.dao.impl;

import com.ytinf.dao.IDeptDAO;
import com.ytinf.vo.Dept;
import org.springframework.stereotype.Repository;

@Repository
public class DeptDAOImpl implements IDeptDAO {
    @Override
    public Dept findById(Long deptno) {
        Dept dept = new Dept();
        dept.setDeptno(deptno);
        dept.setDname("财务部");
        return dept;
    }
}
