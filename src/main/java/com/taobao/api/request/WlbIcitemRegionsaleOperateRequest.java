package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbIcitemRegionsaleOperateResponse;

/**
 * TOP API: taobao.wlb.icitem.regionsale.operate request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WlbIcitemRegionsaleOperateRequest implements
        TaobaoRequest<WlbIcitemRegionsaleOperateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 前台宝贝id
     */
    private Long itemId;

    /**
     * 1:表示添加区域化销售服务 -1:表示去除区域化销售服务
     */
    private Long opType;

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setOpType(Long opType) {
        this.opType = opType;
    }

    public Long getOpType() {
        return this.opType;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.icitem.regionsale.operate";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("op_type", this.opType);
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

    public Class<WlbIcitemRegionsaleOperateResponse> getResponseClass() {
        return WlbIcitemRegionsaleOperateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(opType, "opType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
