package com.ytinf.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;
import java.util.Scanner;

public class TestResourceLoaderUrl {
    public static void main(String[] args) throws Exception {
        String path = "https://docs.spring.io/spring/docs/5.1.7.RELEASE/" +
                "javadoc-api/org/springframework/core/io/Resource.html" ;
        ResourceLoader loader = new DefaultResourceLoader() ;   // 获取接口实例
        input(loader.getResource(path).getInputStream());
    }
    public static void input(InputStream input) {
        Scanner scan = new Scanner(input) ;
        scan.useDelimiter("\n") ;
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
