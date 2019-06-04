package com.ytinf.service.impl;

import com.ytinf.dao.IDeptDAO;
import com.ytinf.service.IDeptService;
import com.ytinf.vo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements IDeptService {
    @Autowired
    private IDeptDAO deptDAO ;  // 根据名称注入，如果名称不匹配根据类型注入
    @Override
    public Dept get(long deptno) {
        return this.deptDAO.findById(deptno);
    }
}
