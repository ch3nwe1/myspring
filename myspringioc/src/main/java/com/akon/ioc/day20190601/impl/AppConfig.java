package com.akon.ioc.day20190601.impl;

import com.akon.ioc.day20190601.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService(){
        return new MyServiceImpl();
    }

}
