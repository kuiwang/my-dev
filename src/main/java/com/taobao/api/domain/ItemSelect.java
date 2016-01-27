package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品选品数据结构
 *
 * @author auto create
 * @since 1.0, null
 */
public class ItemSelect extends TaobaoObject {

    private static final long serialVersionUID = 6897341741734599348L;

    /**
     * 商品类目名称
     */
    @ApiField("category_name")
    private String categoryName;

    /**
     * 后台类目id
     */
    @ApiField("cid")
    private Long cid;

    /**
     * 商品的最近修改时间。格式为yyyymmddhhmmss
     */
    @ApiField("last_modified")
    private String lastModified;

    /**
     * 商品id。字段已经废弃，请使用open_iid
     */
    @ApiField("num_iid")
    private Long numIid;

    /**
     * 混淆的商品id
     */
    @ApiField("open_iid")
    private String openIid;

    /**
     * 商家ERP商品ID
     */
    @ApiField("outer_id")
    private String outerId;

    /**
     * 商品主图
     */
    @ApiField("pict_url")
    private String pictUrl;

    /**
     * 商品价格(元)
     */
    @ApiField("price")
    private String price;

    /**
     * 标题
     */
    @ApiField("title")
    private String title;

    /**
     * 0为C店；1为B店
     */
    @ApiField("user_type")
    private Long userType;

    public String getCategoryName() {
        return this.categoryName;
    }

    public Long getCid() {
        return this.cid;
    }

    public String getLastModified() {
        return this.lastModified;
    }

    public Long getNumIid() {
        return this.numIid;
    }

    public String getOpenIid() {
        return this.openIid;
    }

    public String getOuterId() {
        return this.outerId;
    }

    public String getPictUrl() {
        return this.pictUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getUserType() {
        return this.userType;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public void setNumIid(Long numIid) {
        this.numIid = numIid;
    }

    public void setOpenIid(String openIid) {
        this.openIid = openIid;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }

}
