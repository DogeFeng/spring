package com.ytinf.service.impl;

import com.ytinf.service.IMessageService;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // 表示此类将自动进行Bean配置
// 等价于：<bean id="messageServiceImpl" class="com.ytinf.service.impl.MessageServiceImpl"/>
public class MessageServiceImpl implements IMessageService {
    public String echo(String msg) {
        return "【ECHO】" + msg;
    }
}
