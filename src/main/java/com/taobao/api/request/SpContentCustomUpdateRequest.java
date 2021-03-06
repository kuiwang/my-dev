package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentCustomUpdateResponse;

/**
 * TOP API: taobao.sp.content.custom.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentCustomUpdateRequest implements TaobaoRequest<SpContentCustomUpdateResponse> {

    /**
     * 内容的自定义分类，数值为文本内容，主要用于区分内容的分类（譬如连衣裙、T恤、阿迪达斯等），分类名称的长度限制为(0,5]
     * (单位是字符，不区分中英文)，分类名称中不能包含非法内容，且一个站点下所拥有的总自定义分类数量不能超过16个<br />
     * 支持最大长度为：5<br />
     * 支持的最大列表长度为：5
     */
    private String classname;

    /**
     * 自定义内容的正文，数值为文本内容（html形式），长度限制为[100,20000] (单位是字符，不区分中英文),
     * 内容中不能有外链，不能有恶意脚本；内容中包含的商品链接系统自自动提取并保存起来;多个商品链接以空格隔开(如
     * href=http://detail.tmall.com/item.htm?id=35743839682
     * href=http://item.taobao.com/item.htm?id=36366644805 )<br />
     * 支持最大长度为：20000<br />
     * 支持的最大列表长度为：20000
     */
    private String content;

    /**
     * 内容的detail页面地址，数值为html链接，主要用于展现内容的detail信息的
     */
    private String detailurl;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 内容ID
     */
    private Long id;

    /**
     * 站长Key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    /**
     * 内容的自定义标签，数值为文本内容，多个标签以逗号“,”分割。
     * 主要用于细化内容的分类（譬如小清新，棉质、雪纺等），标签名称的长度限制为[0,6]
     * (单位是字符，不区分中英文)，标签名称中不能包含非法内容，且一个内容关联的标签数目不能超过6个
     */
    private String tags;

    private Long timestamp;

    /**
     * 内容标题,标题的长度限制为(0,32](单位是字符，不区分中英文)<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(classname, "classname");
        RequestCheckUtils.checkMaxLength(classname, 5, "classname");
        RequestCheckUtils.checkNotEmpty(content, "content");
        RequestCheckUtils.checkMaxLength(content, 20000, "content");
        RequestCheckUtils.checkNotEmpty(detailurl, "detailurl");
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 32, "title");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.content.custom.update";
    }

    public String getClassname() {
        return this.classname;
    }

    public String getContent() {
        return this.content;
    }

    public String getDetailurl() {
        return this.detailurl;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    @Override
    public Class<SpContentCustomUpdateResponse> getResponseClass() {
        return SpContentCustomUpdateResponse.class;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public String getTags() {
        return this.tags;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("classname", this.classname);
        txtParams.put("content", this.content);
        txtParams.put("detailurl", this.detailurl);
        txtParams.put("id", this.id);
        txtParams.put("site_key", this.siteKey);
        txtParams.put("tags", this.tags);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDetailurl(String detailurl) {
        this.detailurl = detailurl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
