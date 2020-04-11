package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.YiQingMapper;
import com.sk.yiqingmvc.model.YiQing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author qiaochunxiang
 * @date 2020/4/11 13:28
 */
@Service
public class YiQingService {

    @Autowired
    private YiQingMapper yiQingMapper;

    /**
     *  疫情信息添加
     *
     * @param yiQing  每日疫情信息
     * @return 是否正确添加
     */
    public boolean addData(YiQing yiQing){
        String uuid = UUID.randomUUID().toString();
        String id = uuid.replace("-", "");
        yiQing.setId(id);
        Date date = new Date();
        yiQing.setEntryDate(date);
        return yiQingMapper.addData(yiQing);
    }

    /**
     * 查询所有疫情
     *
     * @return List<YiQing>
     */
    public List<YiQing> findAll(){
        List<YiQing> all = yiQingMapper.findAll();
        return all;
    }
}
