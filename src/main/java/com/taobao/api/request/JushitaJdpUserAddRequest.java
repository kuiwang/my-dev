package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JushitaJdpUserAddResponse;

/**
 * TOP API: taobao.jushita.jdp.user.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class JushitaJdpUserAddRequest implements TaobaoRequest<JushitaJdpUserAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * RDS实例名称，如果有多个RDS必须设置。
     */
    private String rdsName;

    public void setRdsName(String rdsName) {
        this.rdsName = rdsName;
    }

    public String getRdsName() {
        return this.rdsName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jushita.jdp.user.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("rds_name", this.rdsName);
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

    public Class<JushitaJdpUserAddResponse> getResponseClass() {
        return JushitaJdpUserAddResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}