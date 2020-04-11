package com.sk.yiqingmvc.model;

import java.util.Date;

/**
 * @author qiaochunxiang
 * @date 2020/4/11 13:19
 */
@SuppressWarnings("unused")
public class YiQing {

    /**
     *
     */
    private String id;

    /**
     * 城市id
     */
    private String cId;

    /**
     * 城市名称
     */
    private String cName;

    /**
     * 当天新增的确诊
     */
    private Integer addDiagnosis;

    /**
     * 当天新增的死亡
     */
    private Integer die;

    /**
     * 当天新增的治愈
     */
    private Integer cure;

    /**
     * 当天新增的疑似
     */
    private Integer addSuspected;

    /**
     * 当天减少的疑似
     */
    private Integer reduceSuspected;

    /**
     * 新增重症
     */
    private Integer addICU;

    /**
     * 减少重症
     */
    private Integer reduceICU;


    /**
     * 录入时间
     */
    private Date entryDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public Integer getAddDiagnosis() {
        return addDiagnosis;
    }

    public void setAddDiagnosis(Integer addDiagnosis) {
        this.addDiagnosis = addDiagnosis;
    }

    public Integer getDie() {
        return die;
    }

    public void setDie(Integer die) {
        this.die = die;
    }

    public Integer getCure() {
        return cure;
    }

    public void setCure(Integer cure) {
        this.cure = cure;
    }

    public Integer getAddSuspected() {
        return addSuspected;
    }

    public void setAddSuspected(Integer addSuspected) {
        this.addSuspected = addSuspected;
    }

    public Integer getReduceSuspected() {
        return reduceSuspected;
    }

    public void setReduceSuspected(Integer reduceSuspected) {
        this.reduceSuspected = reduceSuspected;
    }

    public Integer getAddICU() {
        return addICU;
    }

    public void setAddICU(Integer addICU) {
        this.addICU = addICU;
    }

    public Integer getReduceICU() {
        return reduceICU;
    }

    public void setReduceICU(Integer reduceICU) {
        this.reduceICU = reduceICU;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "YiQing{" +
                "id='" + id + '\'' +
                ", cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", addDiagnosis=" + addDiagnosis +
                ", die=" + die +
                ", cure=" + cure +
                ", addSuspected=" + addSuspected +
                ", reduceSuspected=" + reduceSuspected +
                ", addICU=" + addICU +
                ", reduceICU=" + reduceICU +
                ", entryDate=" + entryDate +
                '}';
    }
}
