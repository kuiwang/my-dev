package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UppSellerPointrecordGetResponse;

/**
 * TOP API: taobao.upp.seller.pointrecord.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:24
 */
public class UppSellerPointrecordGetRequest
        implements TaobaoRequest<UppSellerPointrecordGetResponse> {

    /**
     * 查询的页数
     */
    private Long currentPage;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 每页记录数，最大30条，默认20<br />
     * 支持最大值为：30<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 记录状态 1成功 0冻结 -1失败
     */
    private Long status;

    private Long timestamp;

    /**
     * upp内部业务ID，由预扣或预发积分接口返回，ISV可以直接使用，或映射自己的业务ID。<br />
     * 支持的最大列表长度为：32
     */
    private Long transactionId;

    /**
     * 业务发生的开始时间
     */
    private Date transactionTimeBegin;

    /**
     * 业务发生的结束时间
     */
    private Date transactionTimeEnd;

    /**
     * 卖家积分活动的类型 3：发送积分 4：扣减积分<br />
     * 支持的最大列表长度为：1
     */
    private Long type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageSize, 30L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.upp.seller.pointrecord.get";
    }

    public Long getCurrentPage() {
        return this.currentPage;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<UppSellerPointrecordGetResponse> getResponseClass() {
        return UppSellerPointrecordGetResponse.class;
    }

    public Long getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("current_page", this.currentPage);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("status", this.status);
        txtParams.put("transaction_id", this.transactionId);
        txtParams.put("transaction_time_begin", this.transactionTimeBegin);
        txtParams.put("transaction_time_end", this.transactionTimeEnd);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getTransactionId() {
        return this.transactionId;
    }

    public Date getTransactionTimeBegin() {
        return this.transactionTimeBegin;
    }

    public Date getTransactionTimeEnd() {
        return this.transactionTimeEnd;
    }

    public Long getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public void setTransactionTimeBegin(Date transactionTimeBegin) {
        this.transactionTimeBegin = transactionTimeBegin;
    }

    public void setTransactionTimeEnd(Date transactionTimeEnd) {
        this.transactionTimeEnd = transactionTimeEnd;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
