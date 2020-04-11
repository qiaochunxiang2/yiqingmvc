package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.YiQing;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author qiaochunxiang
 * @date 2020/4/11 13:26
 */
@Repository
public interface YiQingMapper {
    /**
     * 每天新增疫情
     *
     * @param yiQing  疫情汇报信息
     * @return 是否正确添加
     */
    boolean addData(YiQing yiQing);

    /**
     * 查询所有疫情
     *
     * @return List<YiQing>
     */
    List<YiQing> findAll();
}
