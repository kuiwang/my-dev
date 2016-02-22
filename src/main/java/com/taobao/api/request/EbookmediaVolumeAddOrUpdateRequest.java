package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.EbookmediaVolumeAddOrUpdateResponse;

/**
 * TOP API: taobao.ebookmedia.volume.add.or.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class EbookmediaVolumeAddOrUpdateRequest
        implements TaobaoRequest<EbookmediaVolumeAddOrUpdateResponse> {

    /**
     * 商品数字ID
     */
    private Long auctionId;

    /**
     * 卷信息简介。不能超过2000个字符<br />
     * 支持最大长度为：2000<br />
     * 支持的最大列表长度为：2000
     */
    private String desc;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 卷序号ID。此序号ID必须按照数字顺序添加，不能跳过，若有重复则覆盖原来的卷信息,序号不能超过50
     */
    private Long orderId;

    private Long timestamp;

    /**
     * 电子书卷标题，不能超过30个字符<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctionId, "auctionId");
        RequestCheckUtils.checkMaxLength(desc, 2000, "desc");
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 30, "title");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.ebookmedia.volume.add.or.update";
    }

    public Long getAuctionId() {
        return this.auctionId;
    }

    public String getDesc() {
        return this.desc;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    @Override
    public Class<EbookmediaVolumeAddOrUpdateResponse> getResponseClass() {
        return EbookmediaVolumeAddOrUpdateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_id", this.auctionId);
        txtParams.put("desc", this.desc);
        txtParams.put("order_id", this.orderId);
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

    public void setAuctionId(Long auctionId) {
        this.auctionId = auctionId;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
