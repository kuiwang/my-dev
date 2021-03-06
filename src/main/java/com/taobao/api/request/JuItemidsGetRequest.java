package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JuItemidsGetResponse;

/**
 * TOP API: taobao.ju.itemids.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:26
 */
public class JuItemidsGetRequest implements TaobaoRequest<JuItemidsGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 分页获取商品信息页序号，代表第几页<br />
     * 支持最小值为：0
     */
    private Long pageNo;

    /**
     * 每次获取商品列表的数量<br />
     * 支持最大值为：100<br />
     * 支持最小值为：1
     */
    private Long pageSize;

    /**
     * 平台ID。搜狗:1008,聚划算:1001,商城:1002,无线WAP:1007,支付宝:1003,淘宝天下:1004,嗨淘:1006
     */
    private Long platformId;

    /**
     * IPHONE,WAP,ANDROID,SINA,163 各种终端类型
     */
    private String terminalType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkMinValue(pageNo, 0L, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
        RequestCheckUtils.checkMaxValue(pageSize, 100L, "pageSize");
        RequestCheckUtils.checkMinValue(pageSize, 1L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ju.itemids.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public Long getPlatformId() {
        return this.platformId;
    }

    @Override
    public Class<JuItemidsGetResponse> getResponseClass() {
        return JuItemidsGetResponse.class;
    }

    public String getTerminalType() {
        return this.terminalType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("platform_id", this.platformId);
        txtParams.put("terminal_type", this.terminalType);
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

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setPlatformId(Long platformId) {
        this.platformId = platformId;
    }

    public void setTerminalType(String terminalType) {
        this.terminalType = terminalType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
