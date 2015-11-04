package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbWaybillShengxianGetResponse;

/**
 * TOP API: taobao.wlb.waybill.shengxian.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:14
 */
public class WlbWaybillShengxianGetRequest implements TaobaoRequest<WlbWaybillShengxianGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 物流服务方代码，生鲜配送：YXSR<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String bizCode;

    /**
     * 物流服务类型。冷链：602，常温：502<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String deliveryType;

    /**
     * 预留扩展字段<br />
     * 支持最大长度为：512<br />
     * 支持的最大列表长度为：512
     */
    private String feature;

    /**
     * 订单渠道： 淘宝平台订单："TB"; 天猫平台订单："TM"; 京东："JD"; 拍拍："PP"; 易迅平台订单："YX";
     * 一号店平台订单："YHD"; 当当网平台订单："DD"; EBAY："EBAY"; QQ网购："QQ"; 苏宁："SN";
     * 国美："GM"; 唯品会："WPH"; 聚美："Jm"; 乐峰："LF"; 蘑菇街："MGJ"; 聚尚："JS"; 银泰："YT";
     * VANCL："VANCL"; 邮乐："YL"; 优购："YG"; 拍鞋："PX"; 1688平台："1688";<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String orderChannelsType;

    /**
     * 商家淘宝地址信息ID<br />
     * 支持最大长度为：64<br />
     * 支持的最大列表长度为：64
     */
    private String senderAddressId;

    /**
     * 仓库的服务代码标示，代码一个仓库的实体。(可以通过taobao.wlb.stores.baseinfo.get接口查询)<br />
     * 支持最大长度为：128<br />
     * 支持的最大列表长度为：128
     */
    private String serviceCode;

    /**
     * 交易号，传入交易号不能存在拆单场景。<br />
     * 支持最大长度为：128<br />
     * 支持的最大列表长度为：128
     */
    private String tradeId;

    public void setBizCode(String bizCode) {
        this.bizCode = bizCode;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDeliveryType() {
        return this.deliveryType;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getFeature() {
        return this.feature;
    }

    public void setOrderChannelsType(String orderChannelsType) {
        this.orderChannelsType = orderChannelsType;
    }

    public String getOrderChannelsType() {
        return this.orderChannelsType;
    }

    public void setSenderAddressId(String senderAddressId) {
        this.senderAddressId = senderAddressId;
    }

    public String getSenderAddressId() {
        return this.senderAddressId;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceCode() {
        return this.serviceCode;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.waybill.shengxian.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("biz_code", this.bizCode);
        txtParams.put("delivery_type", this.deliveryType);
        txtParams.put("feature", this.feature);
        txtParams.put("order_channels_type", this.orderChannelsType);
        txtParams.put("sender_address_id", this.senderAddressId);
        txtParams.put("service_code", this.serviceCode);
        txtParams.put("trade_id", this.tradeId);
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

    public Class<WlbWaybillShengxianGetResponse> getResponseClass() {
        return WlbWaybillShengxianGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(bizCode, "bizCode");
        RequestCheckUtils.checkMaxLength(bizCode, 64, "bizCode");
        RequestCheckUtils.checkNotEmpty(deliveryType, "deliveryType");
        RequestCheckUtils.checkMaxLength(deliveryType, 64, "deliveryType");
        RequestCheckUtils.checkMaxLength(feature, 512, "feature");
        RequestCheckUtils.checkNotEmpty(orderChannelsType, "orderChannelsType");
        RequestCheckUtils.checkMaxLength(orderChannelsType, 64, "orderChannelsType");
        RequestCheckUtils.checkMaxLength(senderAddressId, 64, "senderAddressId");
        RequestCheckUtils.checkMaxLength(serviceCode, 128, "serviceCode");
        RequestCheckUtils.checkNotEmpty(tradeId, "tradeId");
        RequestCheckUtils.checkMaxLength(tradeId, 128, "tradeId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
