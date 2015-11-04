package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemMapGetByExtentityResponse;

/**
 * TOP API: taobao.wlb.item.map.get.by.extentity request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemMapGetByExtentityRequest implements
        TaobaoRequest<WlbItemMapGetByExtentityResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 外部实体类型对应的商品id
     */
    private Long extEntityId;

    /**
     * 外部实体类型： IC_ITEM--ic商品 IC_SKU--ic销售单元
     */
    private String extEntityType;

    public void setExtEntityId(Long extEntityId) {
        this.extEntityId = extEntityId;
    }

    public Long getExtEntityId() {
        return this.extEntityId;
    }

    public void setExtEntityType(String extEntityType) {
        this.extEntityType = extEntityType;
    }

    public String getExtEntityType() {
        return this.extEntityType;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.item.map.get.by.extentity";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ext_entity_id", this.extEntityId);
        txtParams.put("ext_entity_type", this.extEntityType);
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

    public Class<WlbItemMapGetByExtentityResponse> getResponseClass() {
        return WlbItemMapGetByExtentityResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(extEntityId, "extEntityId");
        RequestCheckUtils.checkNotEmpty(extEntityType, "extEntityType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
