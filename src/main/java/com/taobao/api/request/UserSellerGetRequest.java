package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UserSellerGetResponse;

/**
 * TOP API: taobao.user.seller.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:10
 */
public class UserSellerGetRequest implements TaobaoRequest<UserSellerGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 只返回user_id,nick,sex,seller_credit,type,has_more_pic,item_img_num,
     * item_img_size
     * ,prop_img_num,prop_img_size,auto_repost,promoted_type,status
     * ,alipay_bind
     * ,consumer_protection,avatar,liangpin,sign_food_seller_promise
     * ,has_shop
     * ,is_lightning_consignment,has_sub_stock,is_golden_seller,vip_info
     * ,magazine_subscribe,vertical_market,online_gaming参数
     */
    private String fields;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.user.seller.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
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

    public Class<UserSellerGetResponse> getResponseClass() {
        return UserSellerGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
