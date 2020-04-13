package com.sk.yiqingmvc.model;


import java.util.List;

@SuppressWarnings("unused")
public class City {
    /**
     * 城市id
     */
    private String id;

    /**
     * 城市name
     */
    private String name;

    /**
     * 城市上级id
     */
    private List<City> shi;

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

    public List<City> getShi() {
        return shi;
    }

    public void setShi(List<City> shi) {
        this.shi = shi;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shi=" + shi +
                '}';
    }
}
