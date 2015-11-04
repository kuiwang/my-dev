package com.taobao.api.request;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.FileItem;
import com.taobao.api.TaobaoUploadRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemEbookAddResponse;

/**
 * TOP API: taobao.item.ebook.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class ItemEbookAddRequest implements TaobaoUploadRequest<ItemEbookAddResponse> {

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 版权到期时间，如2013-08-06
     */
    private Date copyrightEnd;

    /**
     * 版权文件。类型:jpg,png；大小不能超过2M<br />
     * 支持的文件类型为：jpg,png<br />
     * 支持的最大列表长度为：2097152
     */
    private FileItem copyrightFiles;

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

    /**
     * 电子书ISBN号
     */
    private String isbn;

    /**
     * 书名。长度不能超过60个字符<br />
     * 支持最大长度为：60<br />
     * 支持的最大列表长度为：60
     */
    private String name;

    /**
     * 商品外部编码，该字段的最大长度是512个字节
     */
    private String outerId;

    /**
     * 电子书的售卖价格 取值范围:0.00-9999.99;精确到2位小数;单位:元。如:5.07，表示:5元7分.
     */
    private String price;

    /**
     * 试读章节数，至少大于或等于1，最大值不能超过100
     */
    private Long probation;

    /**
     * 宝贝标题。不能超过60字符，受违禁词控制<br />
     * 支持最大长度为：120<br />
     * 支持的最大列表长度为：120
     */
    private String title;

    public void setCopyrightEnd(Date copyrightEnd) {
        this.copyrightEnd = copyrightEnd;
    }

    public Date getCopyrightEnd() {
        return this.copyrightEnd;
    }

    public void setCopyrightFiles(FileItem copyrightFiles) {
        this.copyrightFiles = copyrightFiles;
    }

    public FileItem getCopyrightFiles() {
        return this.copyrightFiles;
    }

    public void setCover(FileItem cover) {
        this.cover = cover;
    }

    public FileItem getCover() {
        return this.cover;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setProbation(Long probation) {
        this.probation = probation;
    }

    public Long getProbation() {
        return this.probation;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    private Map<String, String> headerMap = new TaobaoHashMap();

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.item.ebook.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("copyright_end", this.copyrightEnd);
        txtParams.put("desc", this.desc);
        txtParams.put("isbn", this.isbn);
        txtParams.put("name", this.name);
        txtParams.put("outer_id", this.outerId);
        txtParams.put("price", this.price);
        txtParams.put("probation", this.probation);
        txtParams.put("title", this.title);
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

    public Map<String, FileItem> getFileParams() {
        Map<String, FileItem> params = new HashMap<String, FileItem>();
        params.put("copyright_files", this.copyrightFiles);
        params.put("cover", this.cover);
        return params;
    }

    public Class<ItemEbookAddResponse> getResponseClass() {
        return ItemEbookAddResponse.class;
    }

    public void check() throws ApiRuleException {

        RequestCheckUtils.checkNotEmpty(copyrightEnd, "copyrightEnd");
        RequestCheckUtils.checkNotEmpty(copyrightFiles, "copyrightFiles");
        RequestCheckUtils.checkMaxLength(copyrightFiles, 2097152, "copyrightFiles");
        RequestCheckUtils.checkMaxLength(cover, 2097152, "cover");
        RequestCheckUtils.checkNotEmpty(desc, "desc");
        RequestCheckUtils.checkMaxLength(desc, 200000, "desc");
        RequestCheckUtils.checkNotEmpty(isbn, "isbn");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 60, "name");
        RequestCheckUtils.checkNotEmpty(price, "price");
        RequestCheckUtils.checkNotEmpty(probation, "probation");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 120, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
