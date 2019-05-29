package com.akon.ioc.day20190529;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBeanFactoryTest {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day20190529/example01.xml");
        ClientService clientService = context.getBean(ClientService.class);
        logger.info(clientService.getClass().getCanonicalName());
    }

}
