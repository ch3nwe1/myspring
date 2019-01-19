package com.akon.jms.producer;


import com.akon.jms.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MessageProcucerServiceTest {

    @Autowired
    private MessageProcucerService messageProcucerService;

    @Test
    public void sendMessage() {

        messageProcucerService.sendMessage("this is my first jms message");

    }
}