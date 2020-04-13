package com.sk.yiqingmvc.controller;

import com.sk.yiqingmvc.model.News;
import com.sk.yiqingmvc.service.NewsService;
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
@Api("news")
@RequestMapping("news")
public class NewsController {

    private static final Logger LOGGER = LoggerFactory.getLogger(NewsController.class);

    @Autowired
    private NewsService newsService;

    @GetMapping("findAll")
    @ApiOperation(value = "查询所有新闻", notes = "查询所有新闻")
    public CommonResult findAll() {
        CommonResult result = new CommonResult();
        try {
            List<News> news = newsService.findAll();
            result.setData(news);
        } catch (Exception e) {
            LOGGER.error(e.toString(), e);
            e.printStackTrace();
            result.setState(500);
            result.setData(false);
        }
        return result;
    }
}
