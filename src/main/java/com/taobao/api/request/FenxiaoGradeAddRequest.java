package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoGradeAddResponse;

/**
 * TOP API: taobao.fenxiao.grade.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class FenxiaoGradeAddRequest implements TaobaoRequest<FenxiaoGradeAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 等级名称，等级名称不可重复<br />
     * 支持最大长度为：20<br />
     * 支持的最大列表长度为：20
     */
    private String name;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 20, "name");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.fenxiao.grade.add";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Class<FenxiaoGradeAddResponse> getResponseClass() {
        return FenxiaoGradeAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("name", this.name);
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

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
