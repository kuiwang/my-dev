package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentGraphicUpdateResponse;

/**
 * TOP API: taobao.sp.content.graphic.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:49
 */
public class SpContentGraphicUpdateRequest implements TaobaoRequest<SpContentGraphicUpdateResponse> {

    /**
     * 内容的自定义分类，数值为文本内容，主要用于区分内容的分类（譬如连衣裙、T恤、阿迪达斯等），分类名称的长度限制为(0,5]
     * (单位是字符，不区分中英文)，分类名称中不能包含非法内容，且一个站点下所拥有的总自定义分类数量不能超过16个<br />
     * 支持最大长度为：5<br />
     * 支持的最大列表长度为：5
     */
    private String classname;

    /**
     * 图文内容，Json格式的数据。 必须是数组类型元素列表。展示时每一个元素会单独一行显示。 type:
     * 表示图文元素的类型，目前支持3种类型的元素 1:text;文本元素； 2:image;图片元素； 3:item;宝贝元素；
     * 
     * value:表示图文类型的元素值。 当类型为text时，value值就是文本类型字符串；
     * 当类型为image时，value值就是图片地址; 当类型为item时，value值就是宝贝ID;
     */
    private String contents;

    /**
     * 封面图片地址 图文的封面尺寸不能低于680*680，否则该条图文将无法同步至微淘
     * 图片地址必须匹配正则表达式:http://(img01|
     * img02|img03|img04|img1|img2|img3|img4)\.(
     * taobaocdn|tbcdn)\.(com|net|cn).*
     */
    private String coverpicurl;

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
     * 是否要发送到微淘广播流
     */
    private Boolean intimeline;

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
        RequestCheckUtils.checkNotEmpty(contents, "contents");
        RequestCheckUtils.checkNotEmpty(detailurl, "detailurl");
        RequestCheckUtils.checkNotEmpty(id, "id");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 32, "title");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.content.graphic.update";
    }

    public String getClassname() {
        return this.classname;
    }

    public String getContents() {
        return this.contents;
    }

    public String getCoverpicurl() {
        return this.coverpicurl;
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

    public Boolean getIntimeline() {
        return this.intimeline;
    }

    @Override
    public Class<SpContentGraphicUpdateResponse> getResponseClass() {
        return SpContentGraphicUpdateResponse.class;
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
        txtParams.put("contents", this.contents);
        txtParams.put("coverpicurl", this.coverpicurl);
        txtParams.put("detailurl", this.detailurl);
        txtParams.put("id", this.id);
        txtParams.put("intimeline", this.intimeline);
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

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setCoverpicurl(String coverpicurl) {
        this.coverpicurl = coverpicurl;
    }

    public void setDetailurl(String detailurl) {
        this.detailurl = detailurl;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIntimeline(Boolean intimeline) {
        this.intimeline = intimeline;
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
