package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentListGetResponse;

/**
 * TOP API: taobao.sp.content.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentListGetRequest implements TaobaoRequest<SpContentListGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * JOSN格式的分页参数： page： 查询起始页 >=1 rows： 分页大小 <= 50 sort :
     * 排序字段(如果没有指定排序方式，默认按修改时间倒序)，支持的排序类型包括：gmtModified – 最后修改时间；likeNum –
     * 喜欢数；viewNum – 浏览数； order：排序方式：asc – 顺序；desc – 倒序
     */
    private String pagerequest;

    /**
     * JSON格式的查询条件： type(Integer，选填) ：内容类型，包括四种： 1 -- 宝贝，2 -- 图片，3 -- 自定义，4
     * -- 图文；
     * className(String，选填)：内容的自定义分类名称；tags(String，选填)：内容的自定义标签名称，多个标签以逗号
     * “,”分割。如果设置了多个标签，则他们是或的关系；title(String，选填): 内容标题，此条件为模糊搜索，慎用，可能比较慢；
     */
    private String query;

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    public void setPagerequest(String pagerequest) {
        this.pagerequest = pagerequest;
    }

    public String getPagerequest() {
        return this.pagerequest;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getQuery() {
        return this.query;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.sp.content.list.get";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<SpContentListGetResponse> getResponseClass() {
        return SpContentListGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(pagerequest, "pagerequest");
        RequestCheckUtils.checkNotEmpty(query, "query");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
