package com.akon.ioc.customevent;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailServiceTest {


    @Test
    public void testEvent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("customEvent.xml");
        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail("192.168.64.51","content");
    }

}