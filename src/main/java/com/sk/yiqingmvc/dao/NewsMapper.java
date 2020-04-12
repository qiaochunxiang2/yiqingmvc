package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.News;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qiaochunxiang
 * @date 2020/4/12 14:21
 */
@Repository
public interface NewsMapper {
    /**
     * 获取所有的新闻
     *
     * @return List<News>
     */
    List<News> findAll();
}
