package org.example.service;
import org.example.entity.User;

public interface HelloService {
    User getUser(int id);
    void addUser(User user);
    void delUser(int id);
}
