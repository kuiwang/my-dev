package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsOnlineConfirmResponse;

/**
 * TOP API: taobao.logistics.online.confirm request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsOnlineConfirmRequest implements TaobaoRequest<LogisticsOnlineConfirmResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 表明是否是拆单，默认值0，1表示拆单
     */
    private Long isSplit;

    /**
     * 运单号.具体一个物流公司的真实运单号码。淘宝官方物流会校验，请谨慎传入；若company_code中传入的代码非淘宝官方物流合作公司，
     * 此处运单号不校验。<br>
     */
    private String outSid;

    /**
     * 商家的IP地址
     */
    private String sellerIp;

    /**
     * 拆单子订单列表，对应的数据是：子订单号的列表。可以不传，但是如果传了则必须符合传递的规则。子订单必须是操作的物流订单的子订单的真子集！
     */
    private String subTid;

    /**
     * 淘宝交易ID<br />
     * 支持最小值为：1000
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(outSid, "outSid");
        RequestCheckUtils.checkMaxListSize(subTid, 50, "subTid");
        RequestCheckUtils.checkNotEmpty(tid, "tid");
        RequestCheckUtils.checkMinValue(tid, 1000L, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.online.confirm";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getIsSplit() {
        return this.isSplit;
    }

    public String getOutSid() {
        return this.outSid;
    }

    @Override
    public Class<LogisticsOnlineConfirmResponse> getResponseClass() {
        return LogisticsOnlineConfirmResponse.class;
    }

    public String getSellerIp() {
        return this.sellerIp;
    }

    public String getSubTid() {
        return this.subTid;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("is_split", this.isSplit);
        txtParams.put("out_sid", this.outSid);
        txtParams.put("seller_ip", this.sellerIp);
        txtParams.put("sub_tid", this.subTid);
        txtParams.put("tid", this.tid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public Long getTid() {
        return this.tid;
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

    public void setIsSplit(Long isSplit) {
        this.isSplit = isSplit;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public void setSellerIp(String sellerIp) {
        this.sellerIp = sellerIp;
    }

    public void setSubTid(String subTid) {
        this.subTid = subTid;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
