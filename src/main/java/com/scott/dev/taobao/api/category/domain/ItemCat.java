package com.scott.dev.taobao.api.category.domain;

/*
 * 商品类目结构
 */
public class ItemCat {

    /*
     * 商品所属类目ID
     */
    private Number cid;

    /*
     * Feature对象列表 目前已有的属性： 若Attr_key为 udsaleprop，attr_value为1 则允许卖家在改类目新增自定义销售属性,不然为不允许
     */
    private Feature[] features;

    /*
     * 该类目是否为父类目(即：该类目是否还有子类目)
     */
    private Boolean isParent;

    /*
     * 类目名称
     */
    private String name;

    /*
     * 父类目ID=0时，代表的是一级的类目
     */
    private Number parentCid;

    /*
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    private Number sortOrder;

    /*
     * 状态。可选值:normal(正常),deleted(删除)
     */
    private String status;

    public Number getCid() {
        return cid;
    }

    public Feature[] getFeatures() {
        return features;
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

    public Number getSortOrder() {
        return sortOrder;
    }

    public String getStatus() {
        return status;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
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

    public void setSortOrder(Number sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
