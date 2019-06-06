package com.ytinf.listener;


import com.ytinf.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@Component
public class ConsumerMessageListener implements MessageListener {
    @Autowired
    private IMessageService messageService ;
    @Override
    public void onMessage(Message message) {    // 消息接收到
        if (message instanceof TextMessage) {   // 接收到的是否是一个文本消息
            TextMessage msg = (TextMessage) message ;
            try {
                this.messageService.handle(msg.getText());
            } catch (JMSException e) {
            }
        }
    }
}
