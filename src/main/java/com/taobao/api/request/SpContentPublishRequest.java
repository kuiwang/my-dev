package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpContentPublishResponse;

/**
 * TOP API: taobao.sp.content.publish request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class SpContentPublishRequest implements TaobaoRequest<SpContentPublishResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 表示为内容类型，包括2种选项： 1(宝贝);3(自定义)
     */
    private String schemaName;

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

    /**
     * 内容具体的信息，用json格式描述，kv对的方式:
     * className(String，必填)：内容的自定义分类，数值为文本内容，主要用于区分内容的分类
     * （譬如连衣裙、T恤、阿迪达斯等），分类名称
     * 
     * 的长度限制为(0,5] (单位是字符，不区分中英文)，分类名称中不能包含非法内容，且一个站点下所拥有的总自定义分类数量不能超过16个；
     * detailUrl(String，必填)：内容的detail页面
     * 
     * 地址，数值为html链接，主要用于展现内容的detail信息的，此数值必须存在，
     * 它是U站首页或淘宝官网搜索到内容之后用户点击进入的跳转页面。（如果站点没有单个内容的detail页面，也可以直接填写站点首页）；
     * items(String，宝贝必填)： 内容关联的商品，数值为商品的detail链接地址。此参数只有在type = 1
     * （即内容类型为宝贝）的时候才有效，宝贝只能并且必须
     * 
     * 关联一个商品；title(String，宝贝和自定义必填): 内容标题，数值为文本内容，此参数只有在type =
     * 1或3（即内容类型为宝贝或自定义
     * ）的时候才有效，且标题的长度限制为(0,32](单位是字符，不区分中英文)，标题中不能含有非法内容，不能含有恶意脚本。 comments
     * (String，宝贝必填)： 内容的推荐理由，数值为文本内容，此参数只有在type =1
     * （即内容类型为宝贝）的时候才有效，且推荐理由的长度限制为
     * [0,140](单位是字符，不区分中英文)，推荐理由中不能含有非法内容，不能含有恶意脚本。
     * content(String，自定义必填)：数值为文本内容（html形式），此参数只有在type =
     * 3（即内容类型为自定义）的时候才有效，且自定义长度限制为[100,20000] (单位是字符，不区分中英文),
     * 自定义中不能有外链，不能有恶意脚本；自定义中包含的商品链接系统自自动提取并保存起来;多个商品链接以空格隔开(如
     * href=http://detail.tmall.com/item.htm?id=35743839682
     * href=http://item.taobao.com/item.htm?id=36366644805 )；
     * coverPicUrl(String，宝贝选填)：封面图片地址。此参数只有在type =
     * 1（即内容类型为宝贝）的时候才有效。图片地址必须
     * 
     * 匹配正则表达式:http://(img01|img02|img03|img04|img1|img2|img3|img4)\.(
     * taobaocdn|tbcdn)\.(com|net|cn).*；
     */
    private String value;

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public String getSchemaName() {
        return this.schemaName;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getTags() {
        return this.tags;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.sp.content.publish";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("schema_name", this.schemaName);
        txtParams.put("site_key", this.siteKey);
        txtParams.put("tags", this.tags);
        txtParams.put("value", this.value);
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

    public Class<SpContentPublishResponse> getResponseClass() {
        return SpContentPublishResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(schemaName, "schemaName");
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
        RequestCheckUtils.checkNotEmpty(value, "value");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
