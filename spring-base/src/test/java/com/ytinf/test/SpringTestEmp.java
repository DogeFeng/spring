package com.ytinf.test;

import com.ytinf.vo.Emp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestEmp {
    @Autowired                                  // 自动注入
    private Emp emp ;    // 注入对象类型
    @Test
    public void testEcho() {
        System.out.println(this.emp);
        System.out.println(this.emp.getDept());
    }
}
