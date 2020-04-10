package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.CityMapper;
import com.sk.yiqingmvc.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CityService {

    @Autowired
    private CityMapper cityMapper;

    public List<City> findAll(){
        return cityMapper.findAll();
    }
}
