package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 提示信息对象
 */
public class TipInfo {

    /*
     * 提示信息
     */
    private String info;

    /*
     * 后端商品ID或者商家编码
     */
    private String scItemId;

    public String getInfo() {
        return info;
    }

    public String getScItemId() {
        return scItemId;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void setScItemId(String scItemId) {
        this.scItemId = scItemId;
    }
}
