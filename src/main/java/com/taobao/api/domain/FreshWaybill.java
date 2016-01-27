package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 生鲜电子面单返回信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class FreshWaybill extends TaobaoObject {

    private static final long serialVersionUID = 8447727363586212761L;

    /**
     * 简称
     */
    @ApiField("alias")
    private String alias;

    /**
     * 预留扩展字段
     */
    @ApiField("feature")
    private String feature;

    /**
     * 大头笔
     */
    @ApiField("short_address")
    private String shortAddress;

    /**
     * 预计到达时间
     */
    @ApiField("time")
    private String time;

    /**
     * 交易号
     */
    @ApiField("trade_id")
    private String tradeId;

    /**
     * 获取的所有电子面单号，以“;”分隔
     */
    @ApiField("waybill_code")
    private String waybillCode;

    public String getAlias() {
        return this.alias;
    }

    public String getFeature() {
        return this.feature;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public String getTime() {
        return this.time;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

}
