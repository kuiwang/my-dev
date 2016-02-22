package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WangwangEserviceGroupmemberGetResponse;

/**
 * TOP API: taobao.wangwang.eservice.groupmember.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WangwangEserviceGroupmemberGetRequest
        implements TaobaoRequest<WangwangEserviceGroupmemberGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主帐号ID：cntaobao+淘宝nick，例如cntaobaotest<br />
     * 支持最大长度为：128<br />
     * 支持的最大列表长度为：128
     */
    private String managerId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(managerId, "managerId");
        RequestCheckUtils.checkMaxLength(managerId, 128, "managerId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wangwang.eservice.groupmember.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getManagerId() {
        return this.managerId;
    }

    @Override
    public Class<WangwangEserviceGroupmemberGetResponse> getResponseClass() {
        return WangwangEserviceGroupmemberGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("manager_id", this.managerId);
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

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
