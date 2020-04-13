package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.ShengShiMapper;
import com.sk.yiqingmvc.model.ShengYiQing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ShengShiService {

    @Autowired
    private ShengShiMapper shengShiMapper;

    /**
     * 省市疫情详情
     *
     * @return List<ShengShiYiQing>
     */
    public List<ShengYiQing> yiQingForm() {
        List<ShengYiQing> shengShiYiQings = shengShiMapper.yiQingForm();
        return shengShiYiQings;
    }
}
