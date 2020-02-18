package com.example.demo.service;

import com.example.demo.repository.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service("userService")
public class UserService implements ServiceFacade {

    @Autowired
    private UserDAO userDAO;

    public Object doService(Object... args) throws Exception {
        Assert.notNull(args[0]);
        if(args[0].equals("insert")){
            userDAO.insertBatch();
            return true;
        }else{
            return userDAO.getUsers();
        }
    }
}
