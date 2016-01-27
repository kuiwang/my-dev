package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookmediaChapterDeleteResponse;

/**
 * TOP API: taobao.ebookmedia.chapter.delete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class EbookmediaChapterDeleteRequest implements
        TaobaoRequest<EbookmediaChapterDeleteResponse> {

    /**
     * 电子书商品数字ID
     */
    private Long auctionId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 章节的淘宝地址id
     */
    private Long tbid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
        RequestCheckUtils.checkNotEmpty(tbid, "tbid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ebookmedia.chapter.delete";
    }

    public Long getAuctionId() {
        return this.auctionId;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<EbookmediaChapterDeleteResponse> getResponseClass() {
        return EbookmediaChapterDeleteResponse.class;
    }

    public Long getTbid() {
        return this.tbid;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_id", this.auctionId);
        txtParams.put("tbid", this.tbid);
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

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public void setTbid(Long tbid) {
        this.tbid = tbid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
