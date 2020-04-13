package com.sk.yiqingmvc.model;

@SuppressWarnings("unused")
public class ShiYiQing {
    /**
     * 城市id
     */
    private String id;

    /**
     * 城市name
     */
    private String name;

    /**
     * 新增
     */
    private Integer dayAdd;

    /**
     * 累计确诊
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDayAdd() {
        return dayAdd;
    }

    public void setDayAdd(Integer dayAdd) {
        this.dayAdd = dayAdd;
    }


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

    @Override
    public String toString() {
        return "ShiYiQing{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayAdd=" + dayAdd +
                ", diagnosis=" + diagnosis +
                ", cure=" + cure +
                ", die=" + die +
                '}';
    }

}
