package com.ytinf.resource;

import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class TestByteArrayResource {
    public static void main(String[] args) throws Exception {
        // 1、此时通过内存流获取了Resource接口实例
        Resource resource = new ByteArrayResource("Hello World !".getBytes()) ;
        // 2、为了方便内存流的读取，设置一个ByteArrayOutputStream
        ByteArrayOutputStream bos = new ByteArrayOutputStream() ;
        // 3、获取资源输入流实例
        InputStream input = resource.getInputStream() ;
        // 4、定义一个读取的单元，保存每次读取的字节内容
        int data = 0 ;
        while ((data = input.read()) != -1) {
            bos.write(Character.toUpperCase(data)); // 向输出流存储
        }
        // 5、将内存输出流的数据全部取出
        System.out.println(new String(bos.toByteArray()));
        // 6、资源一定要关闭
        input.close();
        bos.close();
    }
}
