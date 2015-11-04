package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuGroupidsGetResponse;

/**
 * TOP API: taobao.ju.groupids.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class JuGroupidsGetRequest implements TaobaoRequest<JuGroupidsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 分页获取团信息页序号，代表第几页<br />
     * 支持最小值为：0
     */
    private Long pageNo;

    /**
     * 每次获取团id列表的数量<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * IPHONE,WAP,ANDROID,SINA,163 各种终端类型
     */
    private String terminalType;

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ju.groupids.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("terminal_type", this.terminalType);
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

    public Class<JuGroupidsGetResponse> getResponseClass() {
        return JuGroupidsGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 0L, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
        RequestCheckUtils.checkNotEmpty(terminalType, "terminalType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
