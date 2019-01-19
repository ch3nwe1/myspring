package com.akon.jms.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
@EnableJms
public class ActiveMQConfig {

    @Bean
    public Queue queue(){
        return new ActiveMQQueue("ch.queue");
    }

}
