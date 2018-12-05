package com.spring;

import com.spring.webservice.service.impl.UserServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.interceptor.*;
import org.apache.cxf.interceptor.transform.TransformInInterceptor;
import org.apache.cxf.interceptor.transform.TransformOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.jaxws.handler.logical.LogicalHandlerFaultInInterceptor;
import org.apache.cxf.jaxws.interceptors.MessageModeInInterceptor;
import org.apache.cxf.message.Message;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;
import java.util.List;

@Configuration
public class WebServiceConfig {

    @Autowired
    private UserServiceImpl userServiceImpl;

    @Bean
    public ServletRegistrationBean dispatcher() {
        return new ServletRegistrationBean(new CXFServlet(), "/services/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus bus(){
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus(), userServiceImpl);
        List<Interceptor<? extends Message>> inInterceptors = endpoint.getInInterceptors();
//        inInterceptors.add(new LoggingInInterceptor());
//        inInterceptors.add( new TransformInInterceptor());
        inInterceptors.add(new MessageSenderInterceptor());
        List<Interceptor<? extends Message>> outInterceptors = endpoint.getOutInterceptors();
//        outInterceptors.add(new LoggingOutInterceptor());
//        outInterceptors.add(new TransformOutInterceptor());
        outInterceptors.add(new MessageSenderInterceptor());
        endpoint.publish("/user");
        return endpoint;
    }

}
