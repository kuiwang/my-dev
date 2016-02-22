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
public class WlbIcitemRegionsaleOperateRequest
        implements TaobaoRequest<WlbIcitemRegionsaleOperateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 前台宝贝id
     */
    private Long itemId;

    /**
     * 1:表示添加区域化销售服务 -1:表示去除区域化销售服务
     */
    private Long opType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(opType, "opType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.icitem.regionsale.operate";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public Long getOpType() {
        return this.opType;
    }

    @Override
    public Class<WlbIcitemRegionsaleOperateResponse> getResponseClass() {
        return WlbIcitemRegionsaleOperateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("op_type", this.opType);
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

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setOpType(Long opType) {
        this.opType = opType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
