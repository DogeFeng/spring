package com.ytinf.service.impl;

import com.ytinf.service.IMessageService;
public class EchoServiceImpl implements IMessageService {
    public String echo(String msg) {
        return "【ECHO】" + msg;
    }
}
