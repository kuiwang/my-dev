package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.PromotionLimitdiscountGetResponse;

/**
 * TOP API: taobao.promotion.limitdiscount.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:23
 */
public class PromotionLimitdiscountGetRequest implements
        TaobaoRequest<PromotionLimitdiscountGetResponse> {

    /**
     * 限时打折结束时间。输入的时间会被截取，年月日有效，时分秒忽略。
     */
    private Date endTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 限时打折ID。这个针对查询唯一限时打折情况。若此字段不为空，则说明操作为单条限时打折记录查询，其他字段忽略。若想分页按条件查询，
     * 这个字段置为空。
     */
    private Long limitDiscountId;

    /**
     * 分页页号。默认1。当页数大于最大页数时，结果为最大页数的数据。
     */
    private Long pageNumber;

    /**
     * 限时打折开始时间。输入的时间会被截取，年月日有效，时分秒忽略。
     */
    private Date startTime;

    /**
     * 限时打折活动状态。ALL:全部状态;OVER:已结束;DOING:进行中;PROPARE:未开始(只支持大写)。
     * 当limit_discount_id为空时，为空时，默认为全部的状态。
     */
    private String status;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.promotion.limitdiscount.get";
    }

    public Date getEndTime() {
        return this.endTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getLimitDiscountId() {
        return this.limitDiscountId;
    }

    public Long getPageNumber() {
        return this.pageNumber;
    }

    @Override
    public Class<PromotionLimitdiscountGetResponse> getResponseClass() {
        return PromotionLimitdiscountGetResponse.class;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("limit_discount_id", this.limitDiscountId);
        txtParams.put("page_number", this.pageNumber);
        txtParams.put("start_time", this.startTime);
        txtParams.put("status", this.status);
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

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setLimitDiscountId(Long limitDiscountId) {
        this.limitDiscountId = limitDiscountId;
    }

    public void setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
