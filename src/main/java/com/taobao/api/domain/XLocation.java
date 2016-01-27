package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 位置信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class XLocation extends TaobaoObject {

    private static final long serialVersionUID = 6193359927185388981L;

    /**
     * 商品所在市
     */
    @ApiField("city")
    private String city;

    /**
     * 商品所在省
     */
    @ApiField("state")
    private String state;

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

}
