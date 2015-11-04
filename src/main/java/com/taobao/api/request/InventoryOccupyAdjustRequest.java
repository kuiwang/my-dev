package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryOccupyAdjustResponse;

/**
 * TOP API: taobao.inventory.occupy.adjust request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class InventoryOccupyAdjustRequest implements TaobaoRequest<InventoryOccupyAdjustResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商家外部订单号
     */
    private String bizUniqueCode;

    /**
     * 商品初始库存信息： [{ "TBOrderCode":"淘宝交易号","TBSubOrderCode ":"淘宝子交易单号",
     * "originalStoreCode"
     * :"交易下单的仓库编码","storeCode":"要切换占用到的商家仓库编码"," scItemId "
     * :"商品后端ID","scItemCode":"商品商家编码","inventoryType":"仓储类型","quantity":
     * "新仓库的占用数量，如果不传，则取用原先的占用数"}]
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

    public void setBizUniqueCode(String bizUniqueCode) {
        this.bizUniqueCode = bizUniqueCode;
    }

    public String getBizUniqueCode() {
        return this.bizUniqueCode;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public String getItems() {
        return this.items;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public void setTbOrderType(String tbOrderType) {
        this.tbOrderType = tbOrderType;
    }

    public String getTbOrderType() {
        return this.tbOrderType;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.inventory.occupy.adjust";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<InventoryOccupyAdjustResponse> getResponseClass() {
        return InventoryOccupyAdjustResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizUniqueCode, "bizUniqueCode");
        RequestCheckUtils.checkNotEmpty(items, "items");
        RequestCheckUtils.checkNotEmpty(operateTime, "operateTime");
        RequestCheckUtils.checkNotEmpty(tbOrderType, "tbOrderType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
