package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RdsDbGetResponse;

/**
 * TOP API: taobao.rds.db.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class RdsDbGetRequest implements TaobaoRequest<RdsDbGetResponse> {

    /**
     * 数据库状态，默认值1<br />
     * 支持最大值为：3<br />
     * 支持最小值为：0<br />
     * 支持的最大列表长度为：1
     */
    private Long dbStatus;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * rds的实例名<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String instanceName;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(dbStatus, 3L, "dbStatus");
        RequestCheckUtils.checkMinValue(dbStatus, 0L, "dbStatus");
        RequestCheckUtils.checkNotEmpty(instanceName, "instanceName");
        RequestCheckUtils.checkMaxLength(instanceName, 30, "instanceName");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.rds.db.get";
    }

    public Long getDbStatus() {
        return this.dbStatus;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    @Override
    public Class<RdsDbGetResponse> getResponseClass() {
        return RdsDbGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("db_status", this.dbStatus);
        txtParams.put("instance_name", this.instanceName);
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

    public void setDbStatus(Long dbStatus) {
        this.dbStatus = dbStatus;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
