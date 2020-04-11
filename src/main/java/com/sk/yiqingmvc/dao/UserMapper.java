package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author qiaochunxiang
 * @date 2020/4/11 12:29
 */
@Repository
public interface UserMapper {
    /**
     * 查询用户
     *
     * @param user  用户信息
     * @return  user
     */
    User findUser(User user);
}
