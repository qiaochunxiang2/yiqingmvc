package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 查询用户
     *
     * @param user 用户信息
     * @return user
     */
    User findUser(User user);
}
