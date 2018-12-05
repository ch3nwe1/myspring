package com.spring.webservice.service;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "UserService", targetNamespace = "http://service.webservice.spring.com")

public interface UserService {

    /**
     *
     * @param arg0
     * @return
     *     returns com.spring.webservice.service.User
     */
    @WebMethod
//    @WebResult(targetNamespace = "")
//    @RequestWrapper(localName = "getUser", targetNamespace = "http://service.webservice.spring.com", className = "com.spring.webservice.service.GetUser")
//    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://service.webservice.spring.com", className = "com.spring.webservice.service.GetUserResponse")
    public User getUser(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);

    /**
     *
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
//    @WebResult(targetNamespace = "")
//    @RequestWrapper(localName = "getName", targetNamespace = "http://service.webservice.spring.com", className = "com.spring.webservice.service.GetName")
//    @ResponseWrapper(localName = "getNameResponse", targetNamespace = "http://service.webservice.spring.com", className = "com.spring.webservice.service.GetNameResponse")
    public String getName(
            @WebParam(name = "arg0", targetNamespace = "")
                    String arg0);



}
