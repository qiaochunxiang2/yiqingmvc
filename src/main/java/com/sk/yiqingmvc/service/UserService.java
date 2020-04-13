package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.UserMapper;
import com.sk.yiqingmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录功能
     *
     * @param jsonData 用户信息
     * @return User
     */
    public User findUser(Map<String, Object> jsonData) {
        String username = (String) jsonData.get("username");
        String password = (String) jsonData.get("password");
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.findUser(user);
    }
}
