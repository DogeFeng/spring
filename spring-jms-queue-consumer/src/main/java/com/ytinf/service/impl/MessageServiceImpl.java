package com.ytinf.service.impl;

import com.ytinf.service.IMessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements IMessageService {
    @Override
    public void handle(String msg) {
        System.out.println("【消息处理业务】" + msg);
    }
}
