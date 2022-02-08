package com.colinapp.winter.service;

import com.colinapp.winter.entity.User;
import com.colinapp.winter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.getUser(id);
    }

    public int saveUser(User user){
        return userMapper.saveUser(user);
    }

    public int updateUser(User user){
        return userMapper.updateUser(user);
    }

    public int deleteUserById(int id){
        return userMapper.deleteUserById(id);
    }

    public List<User> getAllUser(){
        return  userMapper.getAllUser();
    }
}
