package com.scott.dev.taobao.api.item.domain;

/*
 * 获取商品资质信息的返回数据结构
 */
public class Qualifications {

    /*
     * 是否成功
     */
    private Boolean result;

    /*
     * 返回的错误信息
     */
    private String message;

    /*
     * 返回的商品资质信息
     */
    private String model;

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
