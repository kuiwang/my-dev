package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsDummySendResponse;

/**
 * TOP API: taobao.logistics.dummy.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsDummySendRequest implements TaobaoRequest<LogisticsDummySendResponse> {

    /**
     * feature参数格式<br>
     * 范例:
     * identCode=tid1:识别码1,识别码2|tid2:识别码3;machineCode=tid3:3C机器号A,3C机器号B
     * <br>
     * identCode为识别码的KEY,machineCode为3C的KEY,多个key之间用”;”分隔<br>
     * “tid1:识别码1,识别码2|tid2:识别码3”为identCode对应的value。 "|"不同商品间的分隔符。<br>
     * 例1商品和2商品，之间就用"|"分开。<br>
     * TID就是商品代表的子订单号，对应taobao.trade.fullinfo.get
     * 接口获得的oid字段。(通过OID可以唯一定位到当前商品上)<br>
     * ":"TID和具体传入参数间的分隔符。冒号前表示TID,之后代表该商品的参数属性。<br>
     * "," 属性间分隔符。（对应商品数量，当存在一个商品的数量超过1个时，用逗号分开）。<br>
     * 具体:当订单中A商品的数量为2个，其中手机串号分别为"12345","67890"。<br>
     * 参数格式：identCode=TIDA:12345,67890。
     * TIDA对应了A宝贝，冒号后用逗号分隔的"12345","67890".
     * 说明本订单A宝贝的数量为2，值分别为"12345","67890"。<br>
     * 当存在"|"时，就说明订单中存在多个商品，商品间用"|"分隔了开来。|"之后的内容含义同上。
     */
    private String feature;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商家的IP地址
     */
    private String sellerIp;

    /**
     * 淘宝交易ID
     */
    private Long tid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(tid, "tid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.dummy.send";
    }

    public String getFeature() {
        return this.feature;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<LogisticsDummySendResponse> getResponseClass() {
        return LogisticsDummySendResponse.class;
    }

    public String getSellerIp() {
        return this.sellerIp;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("feature", this.feature);
        txtParams.put("seller_ip", this.sellerIp);
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

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public void setSellerIp(String sellerIp) {
        this.sellerIp = sellerIp;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
