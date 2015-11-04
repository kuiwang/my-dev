package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 商品信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemInfo extends TaobaoObject {

    private static final long serialVersionUID = 4568716297275365339L;

    /**
     * true:商品可以卖，false:商品不可卖
     */
    @ApiField("in_sale")
    private String inSale;

    /**
     * 商品属性
     */
    @ApiListField("item_props")
    @ApiField("item_property")
    private List<ItemProperty> itemProps;

    /**
     * 商品图片，第一张主图
     */
    @ApiListField("pics")
    @ApiField("string")
    private List<String> pics;

    /**
     * true:sku商品买家购买需要选择sku,false:买家购买不需要选择sku
     */
    @ApiField("sku_item")
    private String skuItem;

    /**
     * 商品售卖时间，单位毫秒
     */
    @ApiField("start")
    private String start;

    /**
     * 商品子标题
     */
    @ApiField("sub_title")
    private String subTitle;

    /**
     * 商品标题
     */
    @ApiField("title")
    private String title;

    public String getInSale() {
        return this.inSale;
    }

    public void setInSale(String inSale) {
        this.inSale = inSale;
    }

    public List<ItemProperty> getItemProps() {
        return this.itemProps;
    }

    public void setItemProps(List<ItemProperty> itemProps) {
        this.itemProps = itemProps;
    }

    public List<String> getPics() {
        return this.pics;
    }

    public void setPics(List<String> pics) {
        this.pics = pics;
    }

    public String getSkuItem() {
        return this.skuItem;
    }

    public void setSkuItem(String skuItem) {
        this.skuItem = skuItem;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
