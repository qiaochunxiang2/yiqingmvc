package com.sk.yiqingmvc.model;

import java.util.Date;

@SuppressWarnings("unused")
public class ChinaYiQing {

    /**
     * 确诊人数
     */
    private Integer diagnosis;

    /**
     * 治愈人数
     */
    private Integer cure;

    /**
     * 死亡人数
     */
    private Integer die;

    /**
     * 增加的重症人数
     */
    private Integer addICU;

    /**
     * 减少的重症人数
     */
    private Integer reduceICU;

    /**
     * 增加的疑似人数
     */
    private Integer addSuspected;

    /**
     * 减少的疑似人数
     */
    private Integer reduceSuspected;

    /**
     * 现有确诊
     */
    public Integer nowDiagnosis;

    /**
     * 现有疑似
     */
    public Integer nowSuspected;

    /**
     * 现有重症
     */
    public Integer nowICU;

    /**
     * 时间
     */
    public Date entryDate;

    public Integer getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(Integer diagnosis) {
        this.diagnosis = diagnosis;
    }

    public Integer getCure() {
        return cure;
    }

    public void setCure(Integer cure) {
        this.cure = cure;
    }

    public Integer getDie() {
        return die;
    }

    public void setDie(Integer die) {
        this.die = die;
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

    public Integer getNowDiagnosis() {
        return nowDiagnosis;
    }

    public void setNowDiagnosis(Integer nowDiagnosis) {
        this.nowDiagnosis = nowDiagnosis;
    }

    public Integer getNowSuspected() {
        return nowSuspected;
    }

    public void setNowSuspected(Integer nowSuspected) {
        this.nowSuspected = nowSuspected;
    }

    public Integer getNowICU() {
        return nowICU;
    }

    public void setNowICU(Integer nowICU) {
        this.nowICU = nowICU;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    @Override
    public String toString() {
        return "ChinaYiQing{" +
                "diagnosis=" + diagnosis +
                ", cure=" + cure +
                ", die=" + die +
                ", addICU=" + addICU +
                ", reduceICU=" + reduceICU +
                ", addSuspected=" + addSuspected +
                ", reduceSuspected=" + reduceSuspected +
                ", nowDiagnosis=" + nowDiagnosis +
                ", nowSuspected=" + nowSuspected +
                ", nowICU=" + nowICU +
                ", entryDate=" + entryDate +
                '}';
    }
}
