package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.NewsMapper;
import com.sk.yiqingmvc.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author qiaochunxiang
 * @date 2020/4/12 14:26
 */
@Service
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;

    /**
     * 获取所有的新闻
     *
     * @return  List<News>
     */
    public List<News> findAll(){
        List<News> all = newsMapper.findAll();
        return all;
    }
}

