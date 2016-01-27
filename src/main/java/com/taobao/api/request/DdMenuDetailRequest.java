package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DdMenuDetailResponse;

/**
 * TOP API: taobao.dd.menu.detail request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class DdMenuDetailRequest implements TaobaoRequest<DdMenuDetailResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 菜单编号
     */
    private Long menuId;

    /**
     * 支付订单ID
     */
    private Long orderId;

    /**
     * 外部门店编码
     */
    private String outStoreId;

    /**
     * 淘宝商户id
     */
    private String storeId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.dd.menu.detail";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getMenuId() {
        return this.menuId;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public String getOutStoreId() {
        return this.outStoreId;
    }

    @Override
    public Class<DdMenuDetailResponse> getResponseClass() {
        return DdMenuDetailResponse.class;
    }

    public String getStoreId() {
        return this.storeId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("menu_id", this.menuId);
        txtParams.put("order_id", this.orderId);
        txtParams.put("out_store_id", this.outStoreId);
        txtParams.put("store_id", this.storeId);
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

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setOutStoreId(String outStoreId) {
        this.outStoreId = outStoreId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
