package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupOnlineitemsvonGetResponse;

/**
 * TOP API: taobao.simba.adgroup.onlineitemsvon.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupOnlineitemsvonGetRequest
        implements TaobaoRequest<SimbaAdgroupOnlineitemsvonGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 排序，true:降序， false:升序
     */
    private Boolean orderBy;

    /**
     * 排序字段，starts：按开始时间排序bidCount:按销量排序
     */
    private String orderField;

    /**
     * 页码，从1开始,最大50。最大只能获取1W个宝贝<br />
     * 支持最大值为：50
     */
    private Long pageNo;

    /**
     * 页尺寸，最大200<br />
     * 支持最大值为：200
     */
    private Long pageSize;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(pageNo, 50L, "pageNo");
        RequestCheckUtils.checkMaxValue(pageSize, 200L, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroup.onlineitemsvon.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNick() {
        return this.nick;
    }

    public Boolean getOrderBy() {
        return this.orderBy;
    }

    public String getOrderField() {
        return this.orderField;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<SimbaAdgroupOnlineitemsvonGetResponse> getResponseClass() {
        return SimbaAdgroupOnlineitemsvonGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("nick", this.nick);
        txtParams.put("order_by", this.orderBy);
        txtParams.put("order_field", this.orderField);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
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

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setOrderBy(Boolean orderBy) {
        this.orderBy = orderBy;
    }

    public void setOrderField(String orderField) {
        this.orderField = orderField;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
