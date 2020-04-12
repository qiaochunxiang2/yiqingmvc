package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.ChinaYiQing;
import org.springframework.stereotype.Repository;

/**
 * @author qiaochunxiang
 * @date 2020/4/12 10:53
 */
@Repository
public interface ChinaYiQingMapper {
    /**
     * 疫情累计信息
     *
     * @return  ChinaYiQing
     */
    ChinaYiQing total();

    /**
     * 昨日新增疫情信息
     *
     * @return  ChinaYiQing
     */
    ChinaYiQing dayAdd();
}
