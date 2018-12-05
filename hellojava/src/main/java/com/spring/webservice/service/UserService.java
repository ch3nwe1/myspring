package com.spring.webservice.service;

import com.spring.webservice.model.User;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(serviceName = "UserService",targetNamespace = "http://service.webservice.spring.com",endpointInterface = "com.spring.webservice.service.UserService")
public interface UserService {

    @WebMethod
    String getName(String userId);

    @WebMethod
    User getUser(String userId);

}
