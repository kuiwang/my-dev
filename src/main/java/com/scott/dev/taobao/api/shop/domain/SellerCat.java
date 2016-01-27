package com.scott.dev.taobao.api.shop.domain;

import java.util.Date;

/*
 * 店铺内卖家自定义类目
 */
public class SellerCat {

    /*
     * 卖家自定义类目编号
     */
    private Number cid;

    /*
     * 创建时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 修改时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private Date modified;

    /*
     * 卖家自定义类目名称
     */
    private String name;

    /*
     * 父类目编号，值等于0：表示此类目为店铺下的一级类目，值不等于0：表示此类目有父类目
     */
    private Number parentCid;

    /*
     * 链接图片地址
     */
    private String picUrl;

    /*
     * 该类目在页面上的排序位置
     */
    private Number sortOrder;

    /*
     * 店铺类目类型：可选值：manual_type：手动分类，new_type：新品上价， tree_type：二三级类目树 ，
     * property_type：属性叶子类目树， brand_type：品牌推广
     */
    private String type;

    public Number getCid() {
        return cid;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public Number getParentCid() {
        return parentCid;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public Number getSortOrder() {
        return sortOrder;
    }

    public String getType() {
        return type;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCid(Number parentCid) {
        this.parentCid = parentCid;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setSortOrder(Number sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setType(String type) {
        this.type = type;
    }

}
