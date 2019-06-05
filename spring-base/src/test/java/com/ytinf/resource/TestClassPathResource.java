package com.ytinf.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Scanner;

public class TestClassPathResource {
    public static void main(String[] args) throws Exception {
        // 1、此时是通过文件流进行数据读取
        Resource resource = new ClassPathResource("spring/spring-base.xml") ;
        // 2、将输入流的对象交由Scanner负责读取配置
        Scanner scan = new Scanner(resource.getInputStream()) ;
        scan.useDelimiter("\n") ;
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
