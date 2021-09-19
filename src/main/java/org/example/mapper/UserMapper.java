package org.example.mapper;

import org.example.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper //注释为Mapper
public interface UserMapper {

    User getUser(int id);

    void addUser(User user);

    void delUser(int id);
}