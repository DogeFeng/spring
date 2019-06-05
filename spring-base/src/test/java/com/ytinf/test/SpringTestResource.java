package com.ytinf.test;

import com.ytinf.util.ResourceUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.InputStream;
import java.util.Scanner;

@ContextConfiguration(locations = {"classpath:spring/spring-base.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestResource {
    @Autowired
    private ResourceUtil resourceUtil;

    @Test
    public void testFileResource() throws Exception {
        for (Resource resource : this.resourceUtil.getResources()) {
            this.input(resource.getInputStream());
            System.err.println("========================== 避免混淆的换行线 ==========================");
        }
    }

    public void input(InputStream input) {
        Scanner scan = new Scanner(input);
        scan.useDelimiter("\n");
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
