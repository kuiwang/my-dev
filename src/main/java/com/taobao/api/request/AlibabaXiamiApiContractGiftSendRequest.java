package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlibabaXiamiApiContractGiftSendResponse;

/**
 * TOP API: alibaba.xiami.api.contract.gift.send request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class AlibabaXiamiApiContractGiftSendRequest
        implements TaobaoRequest<AlibabaXiamiApiContractGiftSendResponse> {

    /**
     * 买家昵称
     */
    private String buyerNick;

    /**
     * 来源，可以传isv的应用名称，用来区分不同的isv
     */
    private String comefrom;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 关联订单ID，必须保证唯一，可以传时间戳或者isv赠送详情表的主键ID
     */
    private Long orderId;

    /**
     * 关联信息ID，用来关联该礼包是isv的哪次赠送，建议传isv赠送详情表的主键ID
     */
    private String relationId;

    /**
     * 店铺ID
     */
    private Long shopId;

    private Long timestamp;

    /**
     * 礼包类型
     */
    private Long type;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(buyerNick, "buyerNick");
        RequestCheckUtils.checkNotEmpty(comefrom, "comefrom");
        RequestCheckUtils.checkNotEmpty(orderId, "orderId");
        RequestCheckUtils.checkNotEmpty(relationId, "relationId");
        RequestCheckUtils.checkNotEmpty(shopId, "shopId");
        RequestCheckUtils.checkNotEmpty(type, "type");
    }

    @Override
    public String getApiMethodName() {
        return "alibaba.xiami.api.contract.gift.send";
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public String getComefrom() {
        return this.comefrom;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOrderId() {
        return this.orderId;
    }

    public String getRelationId() {
        return this.relationId;
    }

    @Override
    public Class<AlibabaXiamiApiContractGiftSendResponse> getResponseClass() {
        return AlibabaXiamiApiContractGiftSendResponse.class;
    }

    public Long getShopId() {
        return this.shopId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("comefrom", this.comefrom);
        txtParams.put("order_id", this.orderId);
        txtParams.put("relation_id", this.relationId);
        txtParams.put("shop_id", this.shopId);
        txtParams.put("type", this.type);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getType() {
        return this.type;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setComefrom(String comefrom) {
        this.comefrom = comefrom;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
