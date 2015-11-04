package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.RdsDbDeleteResponse;

/**
 * TOP API: taobao.rds.db.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class RdsDbDeleteRequest implements TaobaoRequest<RdsDbDeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 数据库的name，可以通过 taobao.rds.db.get 获取
     */
    private String dbName;

    /**
     * rds的实例名<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String instanceName;

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return this.dbName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public String getInstanceName() {
        return this.instanceName;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.rds.db.delete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("db_name", this.dbName);
        txtParams.put("instance_name", this.instanceName);
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

    public Class<RdsDbDeleteResponse> getResponseClass() {
        return RdsDbDeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(dbName, "dbName");
        RequestCheckUtils.checkNotEmpty(instanceName, "instanceName");
        RequestCheckUtils.checkMaxLength(instanceName, 30, "instanceName");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
