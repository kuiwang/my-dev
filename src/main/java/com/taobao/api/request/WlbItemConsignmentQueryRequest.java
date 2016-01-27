package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemConsignmentQueryResponse;

/**
 * TOP API: taobao.wlb.item.consignment.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemConsignmentQueryRequest implements
        TaobaoRequest<WlbItemConsignmentQueryResponse> {

    /**
     * 授权结束时间
     */
    private Date authorizeEndTime;

    /**
     * 授权开始时间
     */
    private Date authorizeStartTime;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 货主的用户昵称，未设置则查询全部
     */
    private String ownerUserNick;

    /**
     * 当前页
     */
    private Long pageNo;

    /**
     * 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
     */
    private Long pageSize;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pageNo, "pageNo");
        RequestCheckUtils.checkNotEmpty(pageSize, "pageSize");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.consignment.query";
    }

    public Date getAuthorizeEndTime() {
        return this.authorizeEndTime;
    }

    public Date getAuthorizeStartTime() {
        return this.authorizeStartTime;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOwnerUserNick() {
        return this.ownerUserNick;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WlbItemConsignmentQueryResponse> getResponseClass() {
        return WlbItemConsignmentQueryResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("authorize_end_time", this.authorizeEndTime);
        txtParams.put("authorize_start_time", this.authorizeStartTime);
        txtParams.put("owner_user_nick", this.ownerUserNick);
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

    public void setAuthorizeEndTime(Date authorizeEndTime) {
        this.authorizeEndTime = authorizeEndTime;
    }

    public void setAuthorizeStartTime(Date authorizeStartTime) {
        this.authorizeStartTime = authorizeStartTime;
    }

    public void setOwnerUserNick(String ownerUserNick) {
        this.ownerUserNick = ownerUserNick;
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
