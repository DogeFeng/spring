package com.ytinf.service.factory;

public class Factory {
    private Factory() {} // 构造方法私有化，避免外部产生无意义的对象
    public static <T> T getMessageInstance(String className) {
        try {
            return (T) Class.forName(className).getDeclaredConstructor().newInstance() ;
        } catch (Exception e) {
            return null ;
        }
    }
}
