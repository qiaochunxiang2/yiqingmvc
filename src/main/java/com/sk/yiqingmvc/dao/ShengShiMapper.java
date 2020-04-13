package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.ShengYiQing;
import com.sk.yiqingmvc.model.ShiYiQing;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShengShiMapper {

    /**
     * 获取省市数据统计
     *
     * @return List<ShengShiYiQing>
     */
    List<ShengYiQing> yiQingForm();

    /**
     * 获取每天省市新增确诊的人数
     *
     * @param id 省市id
     * @return Integer
     */
    Integer dayAddFind(Integer id);

    /**
     * 市疫情统计
     *
     * @param id 市id
     * @return List<ShiYiQing>
     */
    List<ShiYiQing> shiFind(Integer id);

    /**
     * 市每天新增的确诊人数
     *
     * @param id 市id
     * @return Integer
     */
    Integer shiAdd(Integer id);
}
