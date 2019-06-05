package com.ytinf.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

import java.io.InputStream;
import java.util.Scanner;

public class TestResourceLoaderFile {
    public static void main(String[] args) throws Exception {
        ResourceLoader loader = new DefaultResourceLoader() ;   // 获取接口实例
        input(loader.getResource("file:D:\\hello.txt").getInputStream());
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