package com.scott.dev.taobao.api.delivery.domain;

/*
 * 发货后返回给仓库的名称中转仓信息
 */
public class ShipFresh {

    /*
     * 物流公司名称
     */
    private String deliveryName;

    /*
     * 返回的地址信息
     */
    private String sendAddr;

    /*
     * 物流公司服务电话
     */
    private String tel;

    /*
     * 旺旺ID
     */
    private String wangwangId;

    public String getDeliveryName() {
        return deliveryName;
    }

    public String getSendAddr() {
        return sendAddr;
    }

    public String getTel() {
        return tel;
    }

    public String getWangwangId() {
        return wangwangId;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setWangwangId(String wangwangId) {
        this.wangwangId = wangwangId;
    }
}
