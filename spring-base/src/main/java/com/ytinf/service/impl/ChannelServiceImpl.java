package com.ytinf.service.impl;

import com.ytinf.service.IMessageService;

public class ChannelServiceImpl implements IMessageService {
    public String echo(String msg) {
        return "【Channel】" + msg;
    }
}
