package org.example.service.impl;

import org.example.mapper.UserMapper;
import org.example.entity.User;
import org.example.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// TODO 可以只使用 @Service ，一个实现的时候可以使用类型反射
@Service("impl1")    //注释为服务，指定bean名称为impl1
// TODO 拼写错误 HelloServiceImpl
public class HelloServicelmpl implements HelloService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUser(int id) {
        return userMapper.getUser(id);
    }

    // TODO 缺少 @Override
    @Override
    public void addUser(User user) {
        userMapper.addUser(user);
    }

    // TODO 缺少 @Override
    @Override
    public void delUser(int id) {
        userMapper.delUser(id);
    }
}

