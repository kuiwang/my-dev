package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookmediaChapterAddResponse;

/**
 * TOP API: taobao.ebookmedia.chapter.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class EbookmediaChapterAddRequest implements TaobaoRequest<EbookmediaChapterAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 电子书商品ID
     */
    private Long auctionId;

    /**
     * 电子书完本价格。当状态为完本（即status=3）时，必填；只支持两位小数点的正数，例如：12.50
     */
    private String bookPrice;

    /**
     * 章节内容，最大长度不超过50000个字符
     */
    private String content;

    /**
     * 章节内容地址,只有通过授权的用户才可以传入此参数,不能超过500个字符
     */
    private String contentUrl;

    /**
     * 第三方的章节ID。不能为空，必须是大于0的数字，同一个商品下不能重复
     */
    private Long cpCid;

    /**
     * 是否免费.值只能是0或者1 0：收费，1：免费
     */
    private Long isFree;

    /**
     * 上一章节的淘宝地址id。不能为空，若添加的章节是第一章，则填0
     */
    private Long preTbid;

    /**
     * 章节的收费字数
     */
    private Long priceCount;

    /**
     * 电子书状态。目前仅支持以下三种 1：更新中，3：完本，2：暂停
     */
    private Long status;

    /**
     * 章节标题。不能为空，不超过30个字符
     */
    private String title;

    /**
     * 电子书章节所属的卷ID
     */
    private Long volumeId;

    /**
     * 章节的总字数。总字数必须大于或等于收费字数
     */
    private Long wordCount;

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Long getAuctionId() {
        return this.auctionId;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookPrice() {
        return this.bookPrice;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public String getContentUrl() {
        return this.contentUrl;
    }

    public void setCpCid(Long cpCid) {
        this.cpCid = cpCid;
    }

    public Long getCpCid() {
        return this.cpCid;
    }

    public void setIsFree(Long isFree) {
        this.isFree = isFree;
    }

    public Long getIsFree() {
        return this.isFree;
    }

    public void setPreTbid(Long preTbid) {
        this.preTbid = preTbid;
    }

    public Long getPreTbid() {
        return this.preTbid;
    }

    public void setPriceCount(Long priceCount) {
        this.priceCount = priceCount;
    }

    public Long getPriceCount() {
        return this.priceCount;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return this.status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setVolumeId(Long volumeId) {
        this.volumeId = volumeId;
    }

    public Long getVolumeId() {
        return this.volumeId;
    }

    public void setWordCount(Long wordCount) {
        this.wordCount = wordCount;
    }

    public Long getWordCount() {
        return this.wordCount;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ebookmedia.chapter.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_id", this.auctionId);
        txtParams.put("book_price", this.bookPrice);
        txtParams.put("content", this.content);
        txtParams.put("content_url", this.contentUrl);
        txtParams.put("cp_cid", this.cpCid);
        txtParams.put("is_free", this.isFree);
        txtParams.put("pre_tbid", this.preTbid);
        txtParams.put("price_count", this.priceCount);
        txtParams.put("status", this.status);
        txtParams.put("title", this.title);
        txtParams.put("volume_id", this.volumeId);
        txtParams.put("word_count", this.wordCount);
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

    public Class<EbookmediaChapterAddResponse> getResponseClass() {
        return EbookmediaChapterAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
        RequestCheckUtils.checkNotEmpty(cpCid, "cpCid");
        RequestCheckUtils.checkNotEmpty(isFree, "isFree");
        RequestCheckUtils.checkNotEmpty(preTbid, "preTbid");
        RequestCheckUtils.checkNotEmpty(priceCount, "priceCount");
        RequestCheckUtils.checkNotEmpty(status, "status");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkNotEmpty(volumeId, "volumeId");
        RequestCheckUtils.checkNotEmpty(wordCount, "wordCount");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
