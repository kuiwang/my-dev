package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpRangeDeleteResponse;

/**
 * TOP API: taobao.ump.range.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UmpRangeDeleteRequest implements TaobaoRequest<UmpRangeDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 活动id
     */
    private Long actId;

    /**
     * id列表，当范围类型为商品时，该id为商品id；当范围类型为类目时，该id为类目id
     */
    private String ids;

    /**
     * 范围的类型，比如是全店，商品，类目见：MarketingConstants.PARTICIPATE_TYPE_*
     */
    private Long type;

    public void setActId(Long actId) {
        this.actId = actId;
    }

    public Long getActId() {
        return this.actId;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public String getIds() {
        return this.ids;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ump.range.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("act_id", this.actId);
        txtParams.put("ids", this.ids);
        txtParams.put("type", this.type);
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

    public Class<UmpRangeDeleteResponse> getResponseClass() {
        return UmpRangeDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(actId, "actId");
        RequestCheckUtils.checkNotEmpty(ids, "ids");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
