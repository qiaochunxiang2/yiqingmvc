package com.sk.yiqingmvc.dao;

import com.sk.yiqingmvc.model.ChinaYiQing;
import com.sk.yiqingmvc.model.YiQing;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface YiQingMapper {
    /**
     * 每天新增疫情
     *
     * @param yiQing 疫情汇报信息
     * @return 是否正确添加
     */
    boolean addData(YiQing yiQing);

    /**
     * 查询所有疫情
     *
     * @return List<YiQing>
     */
    List<YiQing> findAll();

    /**
     * 疫情累计信息，包括累计确诊，累计治愈，累计死亡，及疑似数据
     *
     * @return ChinaYiQing
     */
    ChinaYiQing total();

    /**
     * 昨日新增疫情信息
     *
     * @return ChinaYiQing
     */
    ChinaYiQing dayAdd();

    /**
     * 按时间进行分类，疫情折线图
     *
     * @return List<ChinaYiQing>
     */
    List<ChinaYiQing> chinaEcharts();

    /**
     * 过滤查询，根据日期和城市进行过滤
     * @param jsonData 条件
     * @return List<YiQing>
     */
    List<YiQing> queryFilter(Map<String, Object> jsonData);
}
