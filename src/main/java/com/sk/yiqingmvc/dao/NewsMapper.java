package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.News;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {
    /**
     * 获取所有的新闻
     *
     * @return List<News>
     */
    List<News> findAll();
}
