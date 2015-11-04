package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 申请面单返回数据
 *
 * @author auto create
 * @since 1.0, null
 */
public class WaybillApplyNewInfo extends TaobaoObject {

    private static final long serialVersionUID = 7196189253243797197L;

    /**
     * 包裹对应的派件（收件）物流服务商网点（分支机构）代码
     */
    @ApiField("consignee_branch_code")
    private String consigneeBranchCode;

    /**
     * 包裹对应的派件（收件）物流服务商网点（分支机构）名称
     */
    @ApiField("consignee_branch_name")
    private String consigneeBranchName;

    /**
     * 预留字段
     */
    @ApiField("feature")
    private String feature;

    /**
     * --
     */
    @ApiField("result")
    private Long result;

    /**
     * 面单号对应的物流服务商网点（分支机构）代码
     */
    @ApiField("shipping_branch_code")
    private String shippingBranchCode;

    /**
     * 面单号对于的物流服务商网点（分支机构）名称
     */
    @ApiField("shipping_branch_name")
    private String shippingBranchName;

    /**
     * 根据收货地址返回大头笔信息
     */
    @ApiField("short_address")
    private String shortAddress;

    /**
     * 面单对应的订单列
     */
    @ApiField("trade_order_info")
    private TradeOrderInfo tradeOrderInfo;

    /**
     * 返回的面单号
     */
    @ApiField("waybill_code")
    private String waybillCode;

    public String getConsigneeBranchCode() {
        return this.consigneeBranchCode;
    }

    public void setConsigneeBranchCode(String consigneeBranchCode) {
        this.consigneeBranchCode = consigneeBranchCode;
    }

    public String getConsigneeBranchName() {
        return this.consigneeBranchName;
    }

    public void setConsigneeBranchName(String consigneeBranchName) {
        this.consigneeBranchName = consigneeBranchName;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public Long getResult() {
        return this.result;
    }

    public void setResult(Long result) {
        this.result = result;
    }

    public String getShippingBranchCode() {
        return this.shippingBranchCode;
    }

    public void setShippingBranchCode(String shippingBranchCode) {
        this.shippingBranchCode = shippingBranchCode;
    }

    public String getShippingBranchName() {
        return this.shippingBranchName;
    }

    public void setShippingBranchName(String shippingBranchName) {
        this.shippingBranchName = shippingBranchName;
    }

    public String getShortAddress() {
        return this.shortAddress;
    }

    public void setShortAddress(String shortAddress) {
        this.shortAddress = shortAddress;
    }

    public TradeOrderInfo getTradeOrderInfo() {
        return this.tradeOrderInfo;
    }

    public void setTradeOrderInfo(TradeOrderInfo tradeOrderInfo) {
        this.tradeOrderInfo = tradeOrderInfo;
    }

    public String getWaybillCode() {
        return this.waybillCode;
    }

    public void setWaybillCode(String waybillCode) {
        this.waybillCode = waybillCode;
    }

}
