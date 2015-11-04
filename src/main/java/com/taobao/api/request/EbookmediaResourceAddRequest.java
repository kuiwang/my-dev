package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookmediaResourceAddResponse;

/**
 * TOP API: taobao.ebookmedia.resource.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class EbookmediaResourceAddRequest implements TaobaoRequest<EbookmediaResourceAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 电子书商品数字ID
     */
    private Long auctionId;

    /**
     * 电子书文件云盘ID
     */
    private Long fileId;

    /**
     * 文件ID
     */
    private String strFileId;

    /**
     * 资源文件后缀名
     */
    private String suffix;

    /**
     * 资源类型，（1：正文，0：试读)
     */
    private Long type;

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public Long getAuctionId() {
        return this.auctionId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public Long getFileId() {
        return this.fileId;
    }

    public void setStrFileId(String strFileId) {
        this.strFileId = strFileId;
    }

    public String getStrFileId() {
        return this.strFileId;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getType() {
        return this.type;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.ebookmedia.resource.add";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_id", this.auctionId);
        txtParams.put("file_id", this.fileId);
        txtParams.put("str_file_id", this.strFileId);
        txtParams.put("suffix", this.suffix);
        txtParams.put("type", this.type);
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

    public Class<EbookmediaResourceAddResponse> getResponseClass() {
        return EbookmediaResourceAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
        RequestCheckUtils.checkNotEmpty(suffix, "suffix");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
