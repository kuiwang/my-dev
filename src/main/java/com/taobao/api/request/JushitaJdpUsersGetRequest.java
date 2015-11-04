package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.JushitaJdpUsersGetResponse;

/**
 * TOP API: taobao.jushita.jdp.users.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class JushitaJdpUsersGetRequest implements TaobaoRequest<JushitaJdpUsersGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 此参数一般不用传，用于查询最后更改时间在某个时间段内的用户
     */
    private Date endModified;

    /**
     * 当前页数
     */
    private Long pageNo;

    /**
     * 每页记录数，默认200
     */
    private Long pageSize;

    /**
     * 此参数一般不用传，用于查询最后更改时间在某个时间段内的用户
     */
    private Date startModified;

    /**
     * 如果传了user_id表示单条查询
     */
    private Long userId;

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
    }

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

    public void setStartModified(Date startModified) {
        this.startModified = startModified;
    }

    public Date getStartModified() {
        return this.startModified;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.jushita.jdp.users.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_modified", this.endModified);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("start_modified", this.startModified);
        txtParams.put("user_id", this.userId);
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

    public Class<JushitaJdpUsersGetResponse> getResponseClass() {
        return JushitaJdpUsersGetResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
