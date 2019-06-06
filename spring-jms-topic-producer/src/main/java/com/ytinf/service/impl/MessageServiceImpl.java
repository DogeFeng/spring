package com.ytinf.service.impl;

import com.ytinf.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Service
public class MessageServiceImpl implements IMessageService {
    @Autowired
    private JmsTemplate jmsTemplate ; // 注入JmsTemplate，可以通过它方便发送消息
    @Autowired
    private Destination destination ;   // 设置发送的目的地
    @Override
    public void send(String msg) {
        this.jmsTemplate.send(this.destination, new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                return session.createTextMessage(msg);
            }
        });
    }
}
