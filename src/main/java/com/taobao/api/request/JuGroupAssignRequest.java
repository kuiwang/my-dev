package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuGroupAssignResponse;

/**
 * TOP API: taobao.ju.group.assign request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class JuGroupAssignRequest implements TaobaoRequest<JuGroupAssignResponse> {

    /**
     * 代表需要返回的商品对象字段。可选值：ItemData商品结构体中所有字段均可返回；多个字段用“,”分隔。如果fields为空，
     * 或者不传该参数，就默认获得所有的字段
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * IPHONE,WAP,ANDROID,SINA,163 各种终端类型
     */
    private String terminalType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 终端的唯一标识，web可以用cookie，手机使用手机号码等，确保唯一性即可，用于分配商品组
     */
    private String uuid;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(terminalType, "terminalType");
        RequestCheckUtils.checkNotEmpty(uuid, "uuid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ju.group.assign";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<JuGroupAssignResponse> getResponseClass() {
        return JuGroupAssignResponse.class;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("terminal_type", this.terminalType);
        txtParams.put("uuid", this.uuid);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getUuid() {
        return this.uuid;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
