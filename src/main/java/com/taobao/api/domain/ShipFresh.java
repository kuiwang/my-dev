package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 发货后返回给仓库的名称中转仓信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ShipFresh extends TaobaoObject {

    private static final long serialVersionUID = 2157967857485395613L;

    /**
     * 物流公司名称
     */
    @ApiField("delivery_name")
    private String deliveryName;

    /**
     * 返回的地址信息
     */
    @ApiField("send_addr")
    private String sendAddr;

    /**
     * 物流公司服务电话
     */
    @ApiField("tel")
    private String tel;

    /**
     * 旺旺ID
     */
    @ApiField("wangwang_id")
    private String wangwangId;

    public String getDeliveryName() {
        return this.deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    public String getSendAddr() {
        return this.sendAddr;
    }

    public void setSendAddr(String sendAddr) {
        this.sendAddr = sendAddr;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getWangwangId() {
        return this.wangwangId;
    }

    public void setWangwangId(String wangwangId) {
        this.wangwangId = wangwangId;
    }

}
