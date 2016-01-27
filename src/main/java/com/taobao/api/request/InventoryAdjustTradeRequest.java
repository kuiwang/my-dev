package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryAdjustTradeResponse;

/**
 * TOP API: taobao.inventory.adjust.trade request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class InventoryAdjustTradeRequest implements TaobaoRequest<InventoryAdjustTradeResponse> {

    /**
     * 商家外部定单号
     */
    private String bizUniqueCode;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品初始库存信息： [{ "TBOrderCode”:”淘宝交易号”,"TBSubOrderCode
     * ":"淘宝子交易单号,赠品可以不填","
     * ”isGift”:”TRUE或者FALSE,是否赠品”,storeCode":"商家仓库编码"," scItemId
     * ":"商品后端ID","scItemCode":"商品商家编码"," originScItemId
     * ":"原商品ID","inventoryType
     * ":"","quantity":"111","isComplete":"TRUE或者FALSE，是否全部确认出库"}]
     */
    private String items;

    /**
     * 业务操作时间
     */
    private Date operateTime;

    /**
     * 订单类型：B2C、B2B
     */
    private String tbOrderType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizUniqueCode, "bizUniqueCode");
        RequestCheckUtils.checkNotEmpty(items, "items");
        RequestCheckUtils.checkNotEmpty(operateTime, "operateTime");
        RequestCheckUtils.checkNotEmpty(tbOrderType, "tbOrderType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.inventory.adjust.trade";
    }

    public String getBizUniqueCode() {
        return this.bizUniqueCode;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getItems() {
        return this.items;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    @Override
    public Class<InventoryAdjustTradeResponse> getResponseClass() {
        return InventoryAdjustTradeResponse.class;
    }

    public String getTbOrderType() {
        return this.tbOrderType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_unique_code", this.bizUniqueCode);
        txtParams.put("items", this.items);
        txtParams.put("operate_time", this.operateTime);
        txtParams.put("tb_order_type", this.tbOrderType);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBizUniqueCode(String bizUniqueCode) {
        this.bizUniqueCode = bizUniqueCode;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public void setTbOrderType(String tbOrderType) {
        this.tbOrderType = tbOrderType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
