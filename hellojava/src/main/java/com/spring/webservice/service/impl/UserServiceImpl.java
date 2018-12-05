package com.spring.webservice.service.impl;

import com.spring.webservice.model.User;
import com.spring.webservice.service.UserService;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.logging.Logger;

@Component
@WebService(targetNamespace = "http://service.webservice.spring.com")
public class UserServiceImpl implements UserService {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class.getName());

    public String getName(String userId) {
        logger.info("发布webservice服务.....");
        return "hello webservice";
    }

    public User getUser(String userId) {
        logger.info("发布webservice服务.....");
        User user = new User();
        user.setUserId("0001");
        user.setUserName("webservice");
        user.setAge(18);

        return user;
    }

    public UserServiceImpl() {
        super();
        logger.info("userserviceimpl constructor......");
    }
}
