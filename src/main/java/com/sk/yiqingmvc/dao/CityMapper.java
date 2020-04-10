package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.City;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CityMapper {
    /**
     * 查询所有城市
     *
     * @return  List<City>
     */
    List<City> findAll();
}
