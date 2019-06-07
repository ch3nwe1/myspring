package com.akon.ioc.customevent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

public class BlackListNotifier implements ApplicationListener<BlackListEvent> {

    private String notificationAddress;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void setNotificationAddress(String notificationAddress) {
        this.notificationAddress = notificationAddress;
    }

    @Override
    public void onApplicationEvent(BlackListEvent event) {
        logger.info("notify appropriate parties via notificationAddress...");
    }
}
