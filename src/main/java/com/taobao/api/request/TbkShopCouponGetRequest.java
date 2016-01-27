package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TbkShopCouponGetResponse;

/**
 * TOP API: taobao.tbk.shop.coupon.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class TbkShopCouponGetRequest implements TaobaoRequest<TbkShopCouponGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 店铺Id
     */
    private Long shopId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tbk.shop.coupon.get";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    @Override
    public Class<TbkShopCouponGetResponse> getResponseClass() {
        return TbkShopCouponGetResponse.class;
    }

    public Long getShopId() {
        return this.shopId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("shop_id", this.shopId);
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

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
