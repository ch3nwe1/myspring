package com.akon.jms.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    private Logger logger = LoggerFactory.getLogger(MessageConsumerService.class);

    @JmsListener(destination = "ch.queue")
    public void receiveMessage(String text) throws Exception{
        logger.info("JMS接受消息：" + text);
    }

}
