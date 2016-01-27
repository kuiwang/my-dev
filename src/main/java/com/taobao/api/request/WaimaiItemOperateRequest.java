package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiItemOperateResponse;

/**
 * TOP API: taobao.waimai.item.operate request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiItemOperateRequest implements TaobaoRequest<WaimaiItemOperateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 待操作宝贝id，多个以英文逗号分隔
     */
    private String ids;

    /**
     * 操作类型(1上架2下架3删除)
     */
    private Long o;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(ids, "ids");
        RequestCheckUtils.checkNotEmpty(o, "o");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.item.operate";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getIds() {
        return this.ids;
    }

    public Long getO() {
        return this.o;
    }

    @Override
    public Class<WaimaiItemOperateResponse> getResponseClass() {
        return WaimaiItemOperateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("ids", this.ids);
        txtParams.put("o", this.o);
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

    public void setIds(String ids) {
        this.ids = ids;
    }

    public void setO(Long o) {
        this.o = o;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
