package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 物流服务能力集合
 *
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsService extends TaobaoObject {

    private static final long serialVersionUID = 6825145617291992437L;

    /**
     * 服务编码
     */
    @ApiField("service_code")
    private String serviceCode;

    /**
     * 服务名称
     */
    @ApiField("service_name")
    private String serviceName;

    /**
     * 服务类型值，json格式表示
     */
    @ApiField("service_value4_json")
    private String serviceValue4Json;

    public String getServiceCode() {
        return this.serviceCode;
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceValue4Json() {
        return this.serviceValue4Json;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setServiceValue4Json(String serviceValue4Json) {
        this.serviceValue4Json = serviceValue4Json;
    }

}
