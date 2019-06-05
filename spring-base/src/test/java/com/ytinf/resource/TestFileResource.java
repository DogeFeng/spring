package com.ytinf.resource;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

public class TestFileResource {
    public static void main(String[] args) throws Exception {
        // 1、此时是通过文件流进行数据读取
        Resource resource = new FileSystemResource(new File("D:" + File.separator + "hello.txt")) ;
        // 2、将输入流的对象交由Scanner负责读取配置
        Scanner scan = new Scanner(resource.getInputStream()) ;
        while (scan.hasNext()) {
            System.out.println(scan.next());
        }
        scan.close();
    }
}
