package com.sk.yiqingmvc.model;

import java.util.List;

@SuppressWarnings("unused")
public class ShengYiQing {

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

    /**
     * 市数据
     */
    List<ShiYiQing> children;

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

    public List<ShiYiQing> getChildren() {
        return children;
    }

    public void setChildren(List<ShiYiQing> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "ShengYiQing{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dayAdd=" + dayAdd +
                ", diagnosis=" + diagnosis +
                ", cure=" + cure +
                ", die=" + die +
                ", children=" + children +
                '}';
    }
}
