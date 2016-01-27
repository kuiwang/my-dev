package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentGetpageResponse;

/**
 * TOP API: taobao.sp.content.getpage request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentGetpageRequest implements TaobaoRequest<SpContentGetpageResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * JOSN格式的分页参数： page： 查询起始页 >=1 rows： 分页大小 <= 50 sort :
     * 排序字段，支持的排序类型包括：gmtModified – 最后修改时间；likeNum – 喜欢数；viewNum – 浏览数；
     * order：排序方式：asc – 顺序；desc – 倒序
     */
    private String pagerequest;

    /**
     * JSON格式的查询条件： type(Integer，选填) ：内容类型，包括三种： 1 -- 宝贝，2 -- 图片，3 -- 自定义，4
     * -- 图文； className(String，选填)：内容的自定义分类名称；
     * tags(String，选填)：内容的自定义标签名称，多个标签以逗号“,”分割。如果设置了多个标签，则他们是或的关系；
     * title(String，选填): 内容标题，此条件为模糊搜索， 慎用，可能比较慢；
     */
    private String query;

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pagerequest, "pagerequest");
        RequestCheckUtils.checkNotEmpty(query, "query");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.content.getpage";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getPagerequest() {
        return this.pagerequest;
    }

    public String getQuery() {
        return this.query;
    }

    @Override
    public Class<SpContentGetpageResponse> getResponseClass() {
        return SpContentGetpageResponse.class;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("pagerequest", this.pagerequest);
        txtParams.put("query", this.query);
        txtParams.put("site_key", this.siteKey);
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

    public void setPagerequest(String pagerequest) {
        this.pagerequest = pagerequest;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
