package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayTopatsUserAccountreportGetResponse;

/**
 * TOP API: alipay.topats.user.accountreport.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class AlipayTopatsUserAccountreportGetRequest implements
        TaobaoRequest<AlipayTopatsUserAccountreportGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 返回下载结果文件的数据格式，只支持utf-8和gbk编码，默认是utf-8
     */
    private String charset;

    /**
     * 对账单结束时间。end_time - start_time <= 1个自然月
     */
    private Date endTime;

    /**
     * 需要返回的字段列表。create_time:创建时间,type：账务类型,business_type:子业务类型,balance:
     * 当时支付宝账户余额,in_amount:收入金额,out_amount:支出金额,alipay_order_no:支付宝订单号,
     * merchant_order_no
     * :商户订单号,self_user_id:自己的支付宝ID,opt_user_id:对方的支付宝ID,memo:账号备注
     */
    private String fields;

    /**
     * 对账单开始时间。最近一个月内的日期。
     */
    private Date startTime;

    /**
     * 账务类型。多个类型是，用逗号分隔，不传则查询所有类型的。PAYMENT:在线支付，TRANSFER:转账，DEPOSIT:充值，
     * WITHDRAW:提现，CHARGE:收费，PREAUTH:预授权，OTHER：其它。
     */
    private String type;

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public String getCharset() {
        return this.charset;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "alipay.topats.user.accountreport.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("charset", this.charset);
        txtParams.put("end_time", this.endTime);
        txtParams.put("fields", this.fields);
        txtParams.put("start_time", this.startTime);
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

    public Class<AlipayTopatsUserAccountreportGetResponse> getResponseClass() {
        return AlipayTopatsUserAccountreportGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endTime, "endTime");
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkNotEmpty(startTime, "startTime");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
