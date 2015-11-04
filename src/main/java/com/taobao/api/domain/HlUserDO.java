package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 订单全链路用户信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class HlUserDO extends TaobaoObject {

    private static final long serialVersionUID = 8235181241225983436L;

    /**
     * 回流信息是否开通买家端展示
     */
    @ApiField("open_for_buyer")
    private String openForBuyer;

    public String getOpenForBuyer() {
        return this.openForBuyer;
    }

    public void setOpenForBuyer(String openForBuyer) {
        this.openForBuyer = openForBuyer;
    }

}
