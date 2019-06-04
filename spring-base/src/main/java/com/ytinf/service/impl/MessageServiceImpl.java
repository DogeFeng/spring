package com.ytinf.service.impl;

import com.ytinf.service.IMessageService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class MessageServiceImpl implements IMessageService {
    public String echo(String msg) {
        return "【ECHO】" + msg;
    }
}
