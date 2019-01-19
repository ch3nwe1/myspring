package com.akon.jms.producer;

import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.Queue;

@Service
public class MessageProcucerService {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Resource
    private Queue queue;

    public void sendMessage(String msg){
        jmsMessagingTemplate.convertAndSend(queue, msg);
    }

}
