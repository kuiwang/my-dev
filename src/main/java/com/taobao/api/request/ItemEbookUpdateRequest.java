package com.taobao.api.request;

import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemEbookUpdateResponse;

/**
 * TOP API: taobao.item.ebook.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class ItemEbookUpdateRequest implements TaobaoUploadRequest<ItemEbookUpdateResponse> {

    /**
     * 商品主图片。类型:JPG,PNG;最大:2M，可以选择不填，不填，则获得默认封面图片<br />
     * 支持的文件类型为：gif,jpg,jpeg,png<br />
     * 支持的最大列表长度为：2097152
     */
    private FileItem cover;

    /**
     * 宝贝描述。字数要大于5个字符，小于25000个字符，受违禁词控制<br />
     * 支持最大长度为：200000<br />
     * 支持的最大列表长度为：200000
     */
    private String desc;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 电子书商品数字id
     */
    private Long itemId;

    /**
     * 商品外部编码，该字段的最大长度是512个字节
     */
    private String outerId;

    /**
     * 电子书的售卖价格 取值范围:0.00-9999.99;精确到2位小数;单位:元。如:5.07，表示:5元7分.
     */
    private String price;

    /**
     * 试读章节数，至少大于或等于1，不超过100
     */
    private Long probation;

    private Long timestamp;

    /**
     * 宝贝标题。不能超过60字符，受违禁词控制<br />
     * 支持最大长度为：120<br />
     * 支持的最大列表长度为：120
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {

        RequestCheckUtils.checkMaxLength(cover, 2097152, "cover");
        RequestCheckUtils.checkMaxLength(desc, 200000, "desc");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkMaxLength(title, 120, "title");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.item.ebook.update";
    }

    public FileItem getCover() {
        return this.cover;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("cover", this.cover);
        return params;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public String getPrice() {
        return this.price;
    }

    public Long getProbation() {
        return this.probation;
    }

    @Override
    public Class<ItemEbookUpdateResponse> getResponseClass() {
        return ItemEbookUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("desc", this.desc);
        txtParams.put("item_id", this.itemId);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("price", this.price);
        txtParams.put("probation", this.probation);
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

    public void setCover(FileItem cover) {
        this.cover = cover;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProbation(Long probation) {
        this.probation = probation;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
