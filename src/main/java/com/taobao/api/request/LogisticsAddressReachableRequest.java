package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsAddressReachableResponse;

/**
 * TOP API: taobao.logistics.address.reachable request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class LogisticsAddressReachableRequest
        implements TaobaoRequest<LogisticsAddressReachableResponse> {

    /**
     * 详细地址
     */
    private String address;

    /**
     * 标准区域编码(三级行政区编码或是四级行政区)，可以通过taobao.areas.get获取，如北京市朝阳区为110105
     */
    private String areaCode;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 物流公司编码ID，可以从这个接口获取所有物流公司的标准编码taobao.logistics.companies.get，可以传入多个值，
     * 以英文逗号分隔，如“1000000952,1000000953”
     */
    private String partnerIds;

    /**
     * 服务对应的数字编码，如揽派范围对应88
     */
    private Long serviceType;

    /**
     * 发货地，标准区域编码(四级行政)，可以通过taobao.areas.get获取，如浙江省杭州市余杭区闲林街道为 330110011
     */
    private String sourceAreaCode;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(partnerIds, "partnerIds");
        RequestCheckUtils.checkNotEmpty(serviceType, "serviceType");
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.logistics.address.reachable";
    }

    public String getAreaCode() {
        return this.areaCode;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPartnerIds() {
        return this.partnerIds;
    }

    @Override
    public Class<LogisticsAddressReachableResponse> getResponseClass() {
        return LogisticsAddressReachableResponse.class;
    }

    public Long getServiceType() {
        return this.serviceType;
    }

    public String getSourceAreaCode() {
        return this.sourceAreaCode;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("area_code", this.areaCode);
        txtParams.put("partner_ids", this.partnerIds);
        txtParams.put("service_type", this.serviceType);
        txtParams.put("source_area_code", this.sourceAreaCode);
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public void setPartnerIds(String partnerIds) {
        this.partnerIds = partnerIds;
    }

    public void setServiceType(Long serviceType) {
        this.serviceType = serviceType;
    }

    public void setSourceAreaCode(String sourceAreaCode) {
        this.sourceAreaCode = sourceAreaCode;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
