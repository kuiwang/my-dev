package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbItemAuthorizationQueryResponse;

/**
 * TOP API: taobao.wlb.item.authorization.query request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:13
 */
public class WlbItemAuthorizationQueryRequest implements
        TaobaoRequest<WlbItemAuthorizationQueryResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 授权商品ID
     */
    private Long itemId;

    /**
     * 授权名称<br />
     * 支持最大长度为：255<br />
     * 支持的最大列表长度为：255
     */
    private String name;

    /**
     * 当前页
     */
    private Long pageNo;

    /**
     * 分页记录个数，如果用户输入的记录数大于50，则一页显示50条记录
     */
    private Long pageSize;

    /**
     * 授权编码
     */
    private String ruleCode;

    /**
     * 状态： 只能输入如下值,范围外的默认按VALID处理;不选则查询所有; VALID -- 1 有效； INVALIDATION -- 2
     * 失效
     */
    private String status;

    private Long timestamp;

    /**
     * 类型：可由不同角色来查询，默认值OWNER, OWNER -- 授权人, ON_COMMISSION -- 被授权人
     */
    private String type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxLength(name, 255, "name");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.wlb.item.authorization.query";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getName() {
        return this.name;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<WlbItemAuthorizationQueryResponse> getResponseClass() {
        return WlbItemAuthorizationQueryResponse.class;
    }

    public String getRuleCode() {
        return this.ruleCode;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("item_id", this.itemId);
        txtParams.put("name", this.name);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("rule_code", this.ruleCode);
        txtParams.put("status", this.status);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(String type) {
        this.type = type;
    }
}
