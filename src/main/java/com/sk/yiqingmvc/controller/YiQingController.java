package com.sk.yiqingmvc.controller;

import com.sk.yiqingmvc.model.User;
import com.sk.yiqingmvc.model.YiQing;
import com.sk.yiqingmvc.service.YiQingService;
import com.sk.yiqingmvc.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;
import java.util.Map;

/**
 * @author qiaochunxiang
 * @date 2020/4/11 13:29
 */
@RestController
@RequestMapping("yiqing")
@Api("疫情信息操作")
public class YiQingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(YiQingController.class);

    @Autowired
    private YiQingService yiQingService;

    @PostMapping("addData")
    @ApiOperation(value = "每日疫情上报", notes = "每日疫情上报")
    public CommonResult addData(@RequestBody YiQing yiQing) {
        CommonResult result = new CommonResult();
        try {
            boolean addResult = yiQingService.addData(yiQing);
            if (addResult){
                result.setData(true);
            } else{
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

    @GetMapping("findAll")
    @ApiOperation(value = "查询所有疫情", notes = "查询所有疫情")
    public CommonResult findAll(){
        CommonResult result = new CommonResult();
        try {
            List<YiQing> all = yiQingService.findAll();
            result.setData(all);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }


}
