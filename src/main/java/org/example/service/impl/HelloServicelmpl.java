package org.example.service.impl;

import org.example.mapper.UserMapper;
import org.example.entity.User;
import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("impl1")    //注释为服务，指定bean名称为impl1
public class HelloServicelmpl implements HelloService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }
    public void addUser(User user){
        userMapper.addUser(user);
    }
    public void delUser(int id){
        userMapper.delUser(id);
    }
}

