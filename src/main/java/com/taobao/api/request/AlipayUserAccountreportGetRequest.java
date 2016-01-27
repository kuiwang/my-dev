package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayUserAccountreportGetResponse;

/**
 * TOP API: alipay.user.accountreport.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class AlipayUserAccountreportGetRequest implements
        TaobaoRequest<AlipayUserAccountreportGetResponse> {

    /**
     * 对账单结束时间，其中end_time - start_time <=
     * 1个自然月，对于对账记录比较多的情况，强烈建议按天查询，否则会出现超时的情况。
     */
    private Date endTime;

    /**
     * 需要返回的字段列表。create_time:创建时间,type：账务类型,business_type:子业务类型,balance:
     * 当时支付宝账户余额,in_amount:收入金额,out_amount:支出金额,alipay_order_no:支付宝订单号,
     * merchant_order_no
     * :商户订单号,self_user_id:自己的支付宝ID,opt_user_id:对方的支付宝ID,memo:账号备注
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 要获取的对账单页码<br />
     * 支持最小值为：1
     */
    private Long pageNo;

    /**
     * 每次查询获取对账记录数量<br />
     * 支持最大值为：200<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 对账单开始时间。最近一个月内的日期。
     */
    private Date startTime;

    private Long timestamp;

    /**
     * 账务类型。多个类型是，用逗号分隔，不传则查询所有类型的。PAYMENT:在线支付，TRANSFER:转账，DEPOSIT:充值，
     * WITHDRAW:提现，CHARGE:收费，PREAUTH:预授权，OTHER：其它。
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMinValue(pageNo, 1L, "pageNo");
        RequestCheckUtils.checkMaxValue(pageSize, 200L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    @Override
    public String getApiMethodName() {
        return "alipay.user.accountreport.get";
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<AlipayUserAccountreportGetResponse> getResponseClass() {
        return AlipayUserAccountreportGetResponse.class;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_time", this.endTime);
        txtParams.put("fields", this.fields);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_time", this.startTime);
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

    public String getType() {
        return this.type;
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

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
