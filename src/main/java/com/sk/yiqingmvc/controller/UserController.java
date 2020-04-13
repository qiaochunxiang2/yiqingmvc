package com.sk.yiqingmvc.controller;

import com.sk.yiqingmvc.model.User;
import com.sk.yiqingmvc.service.UserService;
import com.sk.yiqingmvc.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("user")
@Api("user")
public class UserController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @PostMapping("login")
    @ApiOperation(value = "登录", notes = "登录")
    public CommonResult findUser(@RequestBody Map<String, Object> jsonData) {
        CommonResult result = new CommonResult();
        try {
            User user = userService.findUser(jsonData);
            if (user != null) {
                result.setData(true);
            } else {
                result.setData(false);
            }
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }
}
