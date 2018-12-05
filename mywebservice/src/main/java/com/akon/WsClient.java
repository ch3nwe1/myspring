package com.akon;


import com.spring.webservice.service.User;
import com.spring.webservice.service.UserService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.apache.cxf.message.Message;

import java.util.List;

public class WsClient {

    public static void main(String[] args) throws Exception{
//        JaxWsDynamicClientFactory jaxWsDynamicClientFactory = JaxWsDynamicClientFactory.newInstance();
//        Client client = jaxWsDynamicClientFactory.createClient("http://localhost:8080/services/user?wsdl");
//        Object[] object = client.invoke("getUser", "a");
//        System.out.println(object[0]);
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        jaxWsProxyFactoryBean.setAddress("http://localhost:8080/services/user?wsdl");
        jaxWsProxyFactoryBean.setServiceClass(UserService.class);
        List<Interceptor<? extends Message>> inInterceptors = jaxWsProxyFactoryBean.getInInterceptors();
        inInterceptors.add(new LoggingInInterceptor());
        List<Interceptor<? extends Message>> outInterceptors = jaxWsProxyFactoryBean.getOutInterceptors();
        outInterceptors.add(new LoggingOutInterceptor());
        UserService us = (UserService) jaxWsProxyFactoryBean.create();
        String name = us.getName("1");
        System.out.println(name + "<<<<<");
        User user = us.getUser("1");
        System.out.println(user);

    }
}
