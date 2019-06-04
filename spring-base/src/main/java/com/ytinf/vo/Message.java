package com.ytinf.vo;

public class Message {
    public void buildChannel() {
        System.out.println("【通道建立】创建消息发送通道。。。");
    }
    public void closeChannel() {
        System.out.println("【通道关闭】关闭消息发送通道。。。");
    }
    public void send(String msg) {
        System.out.println("【消息发送】msg = " + msg);
    }
}
