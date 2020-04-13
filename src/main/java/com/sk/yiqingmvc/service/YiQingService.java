package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.YiQingMapper;
import com.sk.yiqingmvc.model.ChinaYiQing;
import com.sk.yiqingmvc.model.YiQing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class YiQingService {

    @Autowired
    private YiQingMapper yiQingMapper;

    /**
     * 疫情信息添加
     *
     * @param yiQing 每日疫情信息
     * @return 是否正确添加
     */
    public boolean addData(YiQing yiQing) {
        // id采取32位uuid生成
        String uuid = UUID.randomUUID().toString();
        String id = uuid.replace("-", "");
        yiQing.setId(id);
        // 时间采取当天
        Date date = new Date();
        yiQing.setEntryDate(date);
        return yiQingMapper.addData(yiQing);
    }

    /**
     * 查询所有疫情
     *
     * @return List<YiQing>
     */
    public List<YiQing> findAll() {
        List<YiQing> all = yiQingMapper.findAll();
        return all;
    }

    public Map<String, ChinaYiQing> chinaYiQing() {
        // 求出来国内疫情所有的数据
        ChinaYiQing total = yiQingMapper.total();
        //  根据查出来的数据，求出来现在确诊的，现在重症和现在疑似的人数
        int nowDiagnosis = total.getDiagnosis() - total.getCure() - total.getDie();
        total.setNowDiagnosis(nowDiagnosis);
        int nowICU = total.getAddICU() - total.getReduceICU();
        total.setNowICU(nowICU);
        int nowSuspected = total.getAddSuspected() - total.getReduceSuspected();
        total.setNowSuspected(nowSuspected);
        // 每天国内的疫情变化
        ChinaYiQing dayAdd = yiQingMapper.dayAdd();
        // 根据数据算出来每天新增了多少确诊人数
        int dayAddDiagnosis = dayAdd.getDiagnosis() - dayAdd.getCure() - dayAdd.getDie();
        dayAdd.setNowDiagnosis(dayAddDiagnosis);
        int dayAddICU = dayAdd.getAddICU() - dayAdd.getReduceICU();
        dayAdd.setNowICU(dayAddICU);
        int dayAddSuspected = dayAdd.getAddSuspected() - dayAdd.getReduceSuspected();
        dayAdd.setNowSuspected(dayAddSuspected);
        // 封装到map中，返回到前端
        Map<String, ChinaYiQing> chinaYiQing = new HashMap<>();
        chinaYiQing.put("total", total);
        chinaYiQing.put("dayAdd", dayAdd);
        return chinaYiQing;
    }

    /**
     * 中国疫情折线图
     *
     * @return List<ChinaYiQing>
     */
    public List<ChinaYiQing> chinaEcharts() {
        List<ChinaYiQing> chinaYiQings = yiQingMapper.chinaEcharts();
        return chinaYiQings;
    }


    /**
     * 过滤查询
     * @param jsonData  过滤条件
     * @return  List<YiQing>
     */
    public List<YiQing> queryFilter(Map<String, Object> jsonData){
        Object date =  jsonData.get("entryDate");
        if (date instanceof Long){
            Date eDate = new Date((Long) date);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String entryDate = format.format(eDate);
            jsonData.put("entryDate", entryDate);
        }
        List<YiQing> yiQings = yiQingMapper.queryFilter(jsonData);
        return yiQings;
    }
}
