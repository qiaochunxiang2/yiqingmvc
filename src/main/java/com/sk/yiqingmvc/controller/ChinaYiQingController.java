package com.sk.yiqingmvc.controller;

import com.sk.yiqingmvc.model.ChinaYiQing;
import com.sk.yiqingmvc.model.YiQing;
import com.sk.yiqingmvc.service.ChinaYiQingService;
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
import java.util.Map;

/**
 * @author qiaochunxiang
 * @date 2020/4/12 11:33
 */
@RestController
@Api("chinaYiQing")
@RequestMapping("china")
public class ChinaYiQingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ChinaYiQingController.class);

    @Autowired
    private ChinaYiQingService chinaYiQingService;

    @GetMapping("chinayiqing")
    @ApiOperation(value = "查询中国疫情", notes = "查询中国疫情")
    public CommonResult chinaYiQing(){
        CommonResult result = new CommonResult();
        try {
            Map<String, ChinaYiQing> chinaYiQingMap = chinaYiQingService.chinaYiQing();
            result.setData(chinaYiQingMap);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }
}
