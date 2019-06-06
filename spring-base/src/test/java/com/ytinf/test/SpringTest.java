package com.ytinf.test;

import com.ytinf.service.IDeptService;
import com.ytinf.vo.Dept;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTest {
    @Autowired
    private IDeptService deptService ;
    @Test
    public void testEdit() {
        Dept dept = new Dept() ;
        dept.setDeptno(10L);
        dept.setDname("财务部");
        System.out.println(this.deptService.edit(dept));
    }
}
