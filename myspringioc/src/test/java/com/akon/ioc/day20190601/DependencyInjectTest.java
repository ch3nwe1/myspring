package com.akon.ioc.day20190601;

import com.akon.ioc.day20190601.impl.AppConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Properties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DependencyInjectTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void mergeTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day20190601/example02.xml");
        ComplexObject contextBean = (ComplexObject)context.getBean("child");
        Properties adminEmails = contextBean.getAdminEmails();
        logger.info(adminEmails.stringPropertyNames().toString());
    }

    @Test
    public void javaBasedTest(){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = context.getBean(MyService.class);
        Assert.assertNotNull(myService);
    }

}
