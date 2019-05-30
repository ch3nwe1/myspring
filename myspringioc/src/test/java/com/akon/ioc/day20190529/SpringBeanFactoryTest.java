package com.akon.ioc.day20190529;

import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Assert;
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

    @Test
    public void test02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day20190529/example02.xml");
        ExampleBean exampleBean = context.getBean(ExampleBean.class);
        Assert.assertNotNull(exampleBean);
        logger.info(exampleBean.toString());
    }

    @Test
    public void testBeanByIndex(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day20190529/example03.xml");
        ExampleBean exampleBean = context.getBean(ExampleBean.class);
        Assert.assertNotNull(exampleBean);
        logger.info(exampleBean.toString());
    }

    @Test
    public void testDataSource(){
        ApplicationContext context = new ClassPathXmlApplicationContext("day20190529/example04.xml");
        BasicDataSource dataSource = context.getBean(BasicDataSource.class);
        Assert.assertNotNull(dataSource);
        logger.info(dataSource.getUrl());
    }
}
