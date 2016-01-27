package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsPartnersGetResponse;

/**
 * TOP API: taobao.logistics.partners.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class LogisticsPartnersGetRequest implements TaobaoRequest<LogisticsPartnersGetResponse> {

    /**
     * 货物价格.只有当选择货到付款此参数才会有效
     */
    private String goodsValue;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否需要揽收资费信息，默认false。在此值为false时，返回内容中将无carriage。
     * 在未设置source_id或target_id的情况下，无法查询揽收资费信息。自己联系无揽收资费记录。
     */
    private Boolean isNeedCarriage;

    /**
     * 服务类型，根据此参数可查出提供相应服务类型的物流公司信息(物流公司状态正常)，可选值：cod(货到付款)、online(在线下单)、
     * offline (自己联系)、limit(限时物流)。然后再根据source_id,target_id,
     * goods_value这三个条件来过滤物流公司. 目前输入自己联系服务类型将会返回空，因为自己联系并没有具体的服务信息，所以不会有记录。
     */
    private String serviceType;

    /**
     * 物流公司揽货地地区码（必须是区、县一级的）.参考:<a href=
     * "http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201401/t20140116_501070.html"
     * >http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201401/t20140116_501070.
     * html</a>或者调用 taobao.areas.get 获取
     */
    private String sourceId;

    /**
     * 物流公司派送地地区码（必须是区、县一级的）.参考:<a href=
     * "http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201401/t20140116_501070.html"
     * >http://www.stats.gov.cn/tjsj/tjbz/xzqhdm/201401/t20140116_501070.
     * html</a>或者调用 taobao.areas.get 获取
     */
    private String targetId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(serviceType, "serviceType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.partners.get";
    }

    public String getGoodsValue() {
        return this.goodsValue;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Boolean getIsNeedCarriage() {
        return this.isNeedCarriage;
    }

    @Override
    public Class<LogisticsPartnersGetResponse> getResponseClass() {
        return LogisticsPartnersGetResponse.class;
    }

    public String getServiceType() {
        return this.serviceType;
    }

    public String getSourceId() {
        return this.sourceId;
    }

    public String getTargetId() {
        return this.targetId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("goods_value", this.goodsValue);
        txtParams.put("is_need_carriage", this.isNeedCarriage);
        txtParams.put("service_type", this.serviceType);
        txtParams.put("source_id", this.sourceId);
        txtParams.put("target_id", this.targetId);
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

    public void setGoodsValue(String goodsValue) {
        this.goodsValue = goodsValue;
    }

    public void setIsNeedCarriage(Boolean isNeedCarriage) {
        this.isNeedCarriage = isNeedCarriage;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
