package com.ytinf.test;

import com.ytinf.service.IMessageService;
import com.ytinf.service.factory.Factory;

public class TestMessage {
    public static void main(String[] args) {
        IMessageService service = Factory.getMessageInstance("com.ytinf.service.impl.MessageServiceImpl") ;
        System.out.println(service.echo("可爱的小李老师"));
    }
}
