package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 更新面单数据
 *
 * @author auto create
 * @since 1.0, null
 */
public class WaybillApplyUpdateInfo extends TaobaoObject {

    private static final long serialVersionUID = 2149862988684483121L;

    /**
     * 收货网点信息
     */
    @ApiField("consignee_branch_code")
    private String consigneeBranchCode;

    /**
     * 收货网点编码
     */
    @ApiField("consignee_branch_name")
    private String consigneeBranchName;

    /**
     * --
     */
    @ApiField("desc")
    private String desc;

    /**
     * --
     */
    @ApiField("result")
    private Long result;

    /**
     * 挑拣规则（大头笔信息）
     */
    @ApiField("short_address")
    private String shortAddress;

    /**
     * --
     */
    @ApiField("trade_order_info")
    private TradeOrderInfo tradeOrderInfo;

    /**
     * --
     */
    @ApiField("waybill_code")
    private String waybillCode;

    public String getConsigneeBranchCode() {
        return this.consigneeBranchCode;
    }

    public String getConsigneeBranchName() {
        return this.consigneeBranchName;
    }

    public String getDesc() {
        return this.desc;
    }

    public Long getResult() {
        return this.result;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public TradeOrderInfo getTradeOrderInfo() {
        return this.tradeOrderInfo;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setConsigneeBranchCode(String consigneeBranchCode) {
        this.consigneeBranchCode = consigneeBranchCode;
    }

    public void setConsigneeBranchName(String consigneeBranchName) {
        this.consigneeBranchName = consigneeBranchName;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public void setTradeOrderInfo(TradeOrderInfo tradeOrderInfo) {
        this.tradeOrderInfo = tradeOrderInfo;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

}
