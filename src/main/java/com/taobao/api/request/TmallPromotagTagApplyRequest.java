package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallPromotagTagApplyResponse;

/**
 * TOP API: tmall.promotag.tag.apply request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class TmallPromotagTagApplyRequest implements TaobaoRequest<TmallPromotagTagApplyResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 标签结束时间
     */
    private Date endTime;

    /**
     * 标签开始时间
     */
    private Date startTime;

    /**
     * 标签用途描述
     */
    private String tagDesc;

    /**
     * 标签名称。 注意在UMP中使用新人群标签top变成大写的“NEW_” 如：老标签是top1234，新标签是NEW_1234 。
     */
    private String tagName;

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setTagDesc(String tagDesc) {
        this.tagDesc = tagDesc;
    }

    public String getTagDesc() {
        return this.tagDesc;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return this.tagName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.promotag.tag.apply";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("start_time", this.startTime);
        txtParams.put("tag_desc", this.tagDesc);
        txtParams.put("tag_name", this.tagName);
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

    public Class<TmallPromotagTagApplyResponse> getResponseClass() {
        return TmallPromotagTagApplyResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
        RequestCheckUtils.checkNotEmpty(tagDesc, "tagDesc");
        RequestCheckUtils.checkNotEmpty(tagName, "tagName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
