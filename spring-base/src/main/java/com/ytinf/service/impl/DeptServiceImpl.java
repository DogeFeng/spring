package com.ytinf.service.impl;

import com.ytinf.service.IDeptService;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements IDeptService {
    @Override
    public boolean add() {
        System.out.println("【DeptService】执行部门的处理业务。");
        return false;
    }
}
