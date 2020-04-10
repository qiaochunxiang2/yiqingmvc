package com.sk.yiqingmvc.controller;

import com.sk.yiqingmvc.model.City;
import com.sk.yiqingmvc.service.CityService;
import com.sk.yiqingmvc.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("city")
@RequestMapping("city")
public class CityController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CityController.class);

    @Autowired
    private CityService cityService;

    @GetMapping("findAll")
    @ApiOperation(value = "查询所有城市", notes = "查询所有城市")
    public CommonResult findAll() {
        CommonResult result = new CommonResult();
        try {
            List<City> cities = cityService.findAll();
            result.setData(cities);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }
}
