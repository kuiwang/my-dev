package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookmediaChapterUpdateResponse;

/**
 * TOP API: taobao.ebookmedia.chapter.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class EbookmediaChapterUpdateRequest
        implements TaobaoRequest<EbookmediaChapterUpdateResponse> {

    /**
     * 电子书商品ID
     */
    private Long auctionId;

    /**
     * 章节内容，最大长度不超过50000个字符
     */
    private String content;

    /**
     * 章节内容地址,只有通过授权的用户才可以传入此参数,不能超过500个字符
     */
    private String contentUrl;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否免费.值只能是0或者1 0：收费，1：免费
     */
    private Long isFree;

    /**
     * 章节的收费字数
     */
    private Long priceCount;

    /**
     * 需要修改的章节的淘宝地址id。不能为空
     */
    private Long tbid;

    private Long timestamp;

    /**
     * 章节标题。不能为空，不超过30个字符
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 章节的总字数。总字数必须大于或等于收费字数
     */
    private Long wordCount;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
        RequestCheckUtils.checkNotEmpty(tbid, "tbid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ebookmedia.chapter.update";
    }

    public Long getAuctionId() {
        return this.auctionId;
    }

    public String getContent() {
        return this.content;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getIsFree() {
        return this.isFree;
    }

    public Long getPriceCount() {
        return this.priceCount;
    }

    @Override
    public Class<EbookmediaChapterUpdateResponse> getResponseClass() {
        return EbookmediaChapterUpdateResponse.class;
    }

    public Long getTbid() {
        return this.tbid;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_id", this.auctionId);
        txtParams.put("content", this.content);
        txtParams.put("content_url", this.contentUrl);
        txtParams.put("is_free", this.isFree);
        txtParams.put("price_count", this.priceCount);
        txtParams.put("tbid", this.tbid);
        txtParams.put("title", this.title);
        txtParams.put("word_count", this.wordCount);
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

    public Long getWordCount() {
        return this.wordCount;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public void setIsFree(Long isFree) {
        this.isFree = isFree;
    }

    public void setPriceCount(Long priceCount) {
        this.priceCount = priceCount;
    }

    public void setTbid(Long tbid) {
        this.tbid = tbid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }
}
