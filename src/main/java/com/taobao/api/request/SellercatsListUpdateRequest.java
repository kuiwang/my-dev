package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SellercatsListUpdateResponse;

/**
 * TOP API: taobao.sellercats.list.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class SellercatsListUpdateRequest implements TaobaoRequest<SellercatsListUpdateResponse> {

    /**
     * 卖家自定义类目编号
     */
    private Long cid;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 卖家自定义类目名称。不超过20个字符
     */
    private String name;

    /**
     * 链接图片URL地址
     */
    private String pictUrl;

    /**
     * 该类目在页面上的排序位置,取值范围:大于零的整数
     */
    private Long sortOrder;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(cid, "cid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sellercats.list.update";
    }

    public Long getCid() {
        return this.cid;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    public String getPictUrl() {
        return this.pictUrl;
    }

    @Override
    public Class<SellercatsListUpdateResponse> getResponseClass() {
        return SellercatsListUpdateResponse.class;
    }

    public Long getSortOrder() {
        return this.sortOrder;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("name", this.name);
        txtParams.put("pict_url", this.pictUrl);
        txtParams.put("sort_order", this.sortOrder);
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

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl;
    }

    public void setSortOrder(Long sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
