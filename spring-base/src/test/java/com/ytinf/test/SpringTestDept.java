package com.ytinf.test;

        import com.ytinf.vo.Dept;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.test.context.ContextConfiguration;
        import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestDept {
    @Autowired                                  // 自动注入
    private Dept dept ;    // 注入对象类型
    @Test
    public void testEcho() {
        System.out.println(this.dept);
        System.out.println(this.dept.getProjects());
        System.out.println(this.dept.getProjects().getProperty("Hello"));
        System.out.println(this.dept.getProjects().getProperty("Hello","Not Found Project"));
    }
}
