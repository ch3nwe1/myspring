package com.akon.ioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenericApplicationContextTest {

    @Test
    public void refreshTest(){
        GenericApplicationContext genericApplicationContext = new GenericApplicationContext();
        new XmlBeanDefinitionReader(genericApplicationContext).loadBeanDefinitions("service.xml", "daos.xml");
        genericApplicationContext.refresh();
    }

}
