package com.scott.dev.taobao.api.tae.domain;

/**
 * 商品选品数据结构
 */
public class ItemSelect {

    /**
     * 商品类目名称
     */
    private String categoryName;

    /**
     * 后台类目id
     */
    private Long cid;

    /**
     * 商品的最近修改时间。格式为yyyymmddhhmmss
     */
    private String lastModified;

    /**
     * 商品id。字段已经废弃，请使用open_iid
     */
    private Long numIid;

    /**
     * 混淆的商品id
     */
    private String openIid;

    /**
     * 商家ERP商品ID
     */
    private String outerId;

    /**
     * 商品主图
     */
    private String pictUrl;

    /**
     * 商品价格(元)
     */
    private String price;

    /**
     * 标题
     */
    private String title;

    /**
     * 0为C店；1为B店
     */
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
