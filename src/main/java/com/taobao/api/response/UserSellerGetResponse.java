package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.User;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.user.seller.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UserSellerGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4364962348234484317L;

    /**
     * 只返回user_id,nick,sex,seller_credit,type,has_more_pic,item_img_num,
     * item_img_size
     * ,prop_img_num,prop_img_size,auto_repost,promoted_type,status
     * ,alipay_bind
     * ,consumer_protection,avatar,liangpin,sign_food_seller_promise
     * ,has_shop
     * ,is_lightning_consignment,has_sub_stock,is_golden_seller,vip_info
     * ,magazine_subscribe,vertical_market,online_gaming
     */
    @ApiField("user")
    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return this.user;
    }

}
