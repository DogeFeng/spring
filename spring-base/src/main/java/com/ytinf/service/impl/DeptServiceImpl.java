package com.ytinf.service.impl;

import com.ytinf.service.IDeptService;
import com.ytinf.vo.Dept;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements IDeptService {
    @Override
    public boolean add() {
        System.out.println("【DeptService】执行部门的处理业务。");
        return false;
    }

    @Override
    public boolean edit(Dept vo) {
        if (vo == null) {
            throw new RuntimeException("操作的对象数据为NULL。") ;
        }
        System.out.println("【DeptService】修改部门信息，dept = " + vo);
        return false;
    }
}
