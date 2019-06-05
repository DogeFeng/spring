package com.ytinf.resource;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.ResourceLoader;

public class TestResourceLoaderClassLoader {
    public static void main(String[] args) throws Exception {
        ResourceLoader loader = new DefaultResourceLoader() ;   // 获取接口实例
        System.out.println(loader.getClassLoader());
        System.out.println(loader.getClassLoader().getParent());
        System.out.println(loader.getClassLoader().getParent().getParent());
    }
}
