package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.MarketingPromotionsGetResponse;

/**
 * TOP API: taobao.marketing.promotions.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class MarketingPromotionsGetRequest implements TaobaoRequest<MarketingPromotionsGetResponse> {

    /**
     * 需返回的优惠策略结构字段列表。可选值为Promotion中所有字段，如：promotion_id, promotion_title,
     * item_id, status, tag_id等等
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否新标签标识
     */
    private Boolean isNewTag;

    /**
     * 商品数字ID。根据该ID查询商品下通过第三方工具设置的所有优惠策略
     */
    private String numIid;

    /**
     * 优惠策略状态。可选值：ACTIVE(有效)，UNACTIVE(无效)，若不传或者传入其他值，则默认查询全部
     */
    private String status;

    /**
     * 标签ID
     */
    private Long tagId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(numIid, "numIid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.marketing.promotions.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsNewTag() {
        return this.isNewTag;
    }

    public String getNumIid() {
        return this.numIid;
    }

    @Override
    public Class<MarketingPromotionsGetResponse> getResponseClass() {
        return MarketingPromotionsGetResponse.class;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getTagId() {
        return this.tagId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("is_new_tag", this.isNewTag);
        txtParams.put("num_iid", this.numIid);
        txtParams.put("status", this.status);
        txtParams.put("tag_id", this.tagId);
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setIsNewTag(Boolean isNewTag) {
        this.isNewTag = isNewTag;
    }

    public void setNumIid(String numIid) {
        this.numIid = numIid;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
