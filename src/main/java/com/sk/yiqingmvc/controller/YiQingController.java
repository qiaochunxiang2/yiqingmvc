package com.sk.yiqingmvc.controller;

import com.sk.yiqingmvc.model.ChinaYiQing;
import com.sk.yiqingmvc.model.ShengYiQing;
import com.sk.yiqingmvc.model.YiQing;
import com.sk.yiqingmvc.service.ShengShiService;
import com.sk.yiqingmvc.service.YiQingService;
import com.sk.yiqingmvc.util.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("yiqing")
@Api("疫情信息操作")
public class YiQingController {

    private static final Logger LOGGER = LoggerFactory.getLogger(YiQingController.class);

    @Autowired
    private YiQingService yiQingService;

    @Autowired
    private ShengShiService shengShiService;

    @PostMapping("addData")
    @ApiOperation(value = "每日疫情上报", notes = "每日疫情上报")
    public CommonResult addData(@RequestBody YiQing yiQing) {
        CommonResult result = new CommonResult();
        try {
            boolean addResult = yiQingService.addData(yiQing);
            if (addResult) {
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

    @GetMapping("findAll")
    @ApiOperation(value = "查询所有疫情", notes = "查询所有疫情")
    public CommonResult findAll() {
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

    @GetMapping("chinayiqing")
    @ApiOperation(value = "查询中国疫情", notes = "查询中国疫情")
    public CommonResult chinaYiQing() {
        CommonResult result = new CommonResult();
        try {
            Map<String, ChinaYiQing> chinaYiQingMap = yiQingService.chinaYiQing();
            result.setData(chinaYiQingMap);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }

    @GetMapping("chinaEcharts")
    @ApiOperation(value = "中国疫情折线图", notes = "中国疫情折线图")
    public CommonResult chinaEcharts() {
        CommonResult result = new CommonResult();
        try {
            List<ChinaYiQing> chinaYiQings = yiQingService.chinaEcharts();
            result.setData(chinaYiQings);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }

    @GetMapping("yiQingForm")
    @ApiOperation(value = "省市疫情表格", notes = "省市疫情表格")
    public CommonResult yiQingForm() {
        CommonResult result = new CommonResult();
        try {
            List<ShengYiQing> shengShiYiQing = shengShiService.yiQingForm();
            result.setData(shengShiYiQing);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }

    @PostMapping("yiqingquery")
    @ApiOperation(value = "过滤查询", notes = "过滤查询")
    public CommonResult query(@RequestBody Map<String, Object> jsonData) {
        CommonResult result = new CommonResult();
        try {
            List<YiQing> yiQings = yiQingService.queryFilter(jsonData);
            result.setData(yiQings);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData("服务器错误");
        }
        return result;
    }


}
