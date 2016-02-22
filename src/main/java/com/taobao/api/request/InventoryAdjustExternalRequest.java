package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryAdjustExternalResponse;

/**
 * TOP API: taobao.inventory.adjust.external request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class InventoryAdjustExternalRequest
        implements TaobaoRequest<InventoryAdjustExternalResponse> {

    /**
     * 外部订单类型：ALLOCATE:调拨、
     * RETURN:退货、PURCHACE：采购、BALANCE:盘点、NON_TAOBAO_TRADE：非淘宝交易、OTHERS：其他
     */
    private String bizType;

    /**
     * 商家外部定单号
     */
    private String bizUniqueCode;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品初始库存信息：
     * [{"scItemId":"商品后端ID，如果有传scItemCode,参数可以为0","scItemCode":"商品商家编码"
     * ,"inventoryType" :"库存类型  1：正常,”direction”: 1: 盘盈 -1: 盘亏,参数可选,"
     * quantity":"数量(正数)"}]
     */
    private String items;

    /**
     * 库存占用返回的操作码.operate_type
     * 为OUTBOUND时，如果是确认事先进行过的库存占用，需要传入当时返回的操作码，并且明细必须与申请时保持一致
     */
    private String occupyOperateCode;

    /**
     * 业务操作时间
     */
    private Date operateTime;

    /**
     * 库存操作类别：INBOUND：入库 OUTBOUND: 出库BALANCE: 盘点
     */
    private String operateType;

    /**
     * 出库时库存扣减类型，operate_type为OUTBOUND时有效。
     * AUTO_CALCULATE:自动计算可供扣减，如果库存不够返回失败 ClIENT_FORCE：强制要求最大化扣减，有多少扣多少
     */
    private String reduceType;

    /**
     * 商家仓库编码
     */
    private String storeCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizType, "bizType");
        RequestCheckUtils.checkNotEmpty(bizUniqueCode, "bizUniqueCode");
        RequestCheckUtils.checkNotEmpty(items, "items");
        RequestCheckUtils.checkNotEmpty(operateTime, "operateTime");
        RequestCheckUtils.checkNotEmpty(operateType, "operateType");
        RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.inventory.adjust.external";
    }

    public String getBizType() {
        return this.bizType;
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

    public String getOccupyOperateCode() {
        return this.occupyOperateCode;
    }

    public Date getOperateTime() {
        return this.operateTime;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public String getReduceType() {
        return this.reduceType;
    }

    @Override
    public Class<InventoryAdjustExternalResponse> getResponseClass() {
        return InventoryAdjustExternalResponse.class;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_type", this.bizType);
        txtParams.put("biz_unique_code", this.bizUniqueCode);
        txtParams.put("items", this.items);
        txtParams.put("occupy_operate_code", this.occupyOperateCode);
        txtParams.put("operate_time", this.operateTime);
        txtParams.put("operate_type", this.operateType);
        txtParams.put("reduce_type", this.reduceType);
        txtParams.put("store_code", this.storeCode);
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

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public void setBizUniqueCode(String bizUniqueCode) {
        this.bizUniqueCode = bizUniqueCode;
    }

    public void setItems(String items) {
        this.items = items;
    }

    public void setOccupyOperateCode(String occupyOperateCode) {
        this.occupyOperateCode = occupyOperateCode;
    }

    public void setOperateTime(Date operateTime) {
        this.operateTime = operateTime;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public void setReduceType(String reduceType) {
        this.reduceType = reduceType;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
