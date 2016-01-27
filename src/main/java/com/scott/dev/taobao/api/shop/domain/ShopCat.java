package com.scott.dev.taobao.api.shop.domain;

/*
 * 店铺类目
 */
public class ShopCat {

    /*
     * 类目编号
     */
    private Number cid;

    /*
     * 该类目是否为父类目。即：该类目是否还有子类目
     */
    private Boolean isParent;

    /*
     * 类目名称
     */
    private String name;

    /*
     * 父类目编号，注：此类目指前台类目，值等于0：表示此类目为一级类目，值不等于0：表示此类目有父类目
     */
    private Number parentCid;

    public Number getCid() {
        return cid;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public String getName() {
        return name;
    }

    public Number getParentCid() {
        return parentCid;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setIsParent(Boolean isParent) {
        this.isParent = isParent;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentCid(Number parentCid) {
        this.parentCid = parentCid;
    }

}
