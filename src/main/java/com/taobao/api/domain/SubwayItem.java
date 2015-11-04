package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 主站商品对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class SubwayItem extends TaobaoObject {

    private static final long serialVersionUID = 4897748257541163288L;

    /**
     * 扩展属性对象
     */
    @ApiField("extra_attributes")
    private ExtraAttributes extraAttributes;

    /**
     * 商品信息在外部系统(淘宝主站)的数字id
     */
    @ApiField("num_id")
    private Long numId;

    /**
     * 商品信息在外部系统（淘宝主站）的价格
     */
    @ApiField("price")
    private String price;

    /**
     * 商品信息在外部系统（淘宝主站）的标题
     */
    @ApiField("title")
    private String title;

    public ExtraAttributes getExtraAttributes() {
        return this.extraAttributes;
    }

    public void setExtraAttributes(ExtraAttributes extraAttributes) {
        this.extraAttributes = extraAttributes;
    }

    public Long getNumId() {
        return this.numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
