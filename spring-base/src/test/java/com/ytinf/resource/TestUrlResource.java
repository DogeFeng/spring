package com.ytinf.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.util.Scanner;

public class TestUrlResource {
    public static void main(String[] args) throws Exception {
        String basePath = "https://docs.spring.io/spring/docs/5.1.7.RELEASE/" ;
        basePath = basePath + "javadoc-api/org/springframework/core/io/ClassPathResource.html" ;
        // 1、此时是通过网络流进行数据读取
        Resource resource = new UrlResource(basePath) ;
        // 2、将输入流的对象交由Scanner负责读取配置
        Scanner scan = new Scanner(resource.getInputStream()) ;
        scan.useDelimiter("\n") ;
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
