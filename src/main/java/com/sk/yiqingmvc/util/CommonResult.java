package com.sk.yiqingmvc.util;


public class CommonResult {
    private Integer state;
    private String msg;
    private Object data;

    public CommonResult() {
        this.setData(200);
        this.state = 200;
        this.msg = "成功";
    }

    public CommonResult(Integer state, String msg) {
        this.state = state;
        this.msg = msg;
    }

    public CommonResult(Integer state, String msg, Object data) {
        this.state = state;
        this.msg = msg;
        this.data = data;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
