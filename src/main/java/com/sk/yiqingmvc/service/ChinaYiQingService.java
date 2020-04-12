package com.sk.yiqingmvc.service;

import com.sk.yiqingmvc.dao.ChinaYiQingMapper;
import com.sk.yiqingmvc.model.ChinaYiQing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qiaochunxiang
 * @date 2020/4/12 11:13
 */
@Service
public class ChinaYiQingService {

    @Autowired
    private ChinaYiQingMapper chinaYiQingMapper;

    public Map<String, ChinaYiQing> chinaYiQing() {
        // 求出来国内疫情所有的数据
        ChinaYiQing total = chinaYiQingMapper.total();
        //  根据查出来的数据，求出来现在确诊的，现在重症和现在疑似的人数
        int nowDiagnosis = total.getDiagnosis() - total.getCure() - total.getDie();
        total.setNowDiagnosis(nowDiagnosis);
        int nowICU = total.getAddICU() - total.getReduceICU();
        total.setNowICU(nowICU);
        int nowSuspected = total.getAddSuspected() - total.getReduceSuspected();
        total.setNowSuspected(nowSuspected);
        // 每天国内的疫情变化
        ChinaYiQing dayAdd = chinaYiQingMapper.dayAdd();
        // 根据数据算出来每天减少了多少人
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
}
