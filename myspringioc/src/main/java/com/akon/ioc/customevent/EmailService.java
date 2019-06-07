package com.akon.ioc.customevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmailService implements ApplicationEventPublisherAware {

    private List<String> blackList;
    private ApplicationEventPublisher publisher;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

        this.publisher = applicationEventPublisher;
    }

    public void sendEmail(String address, String content){
        this.setBlackList(Arrays.asList("192.168.64.51"));
        if(blackList.contains(address)){
            publisher.publishEvent(new BlackListEvent(this, address, content));
            return;
        }
        logger.info("send email action..." + "address:" + address + ",content:" + content);
    }
}
