package com.scott.dev.taobao.api.category.domain;

import java.util.Date;

/*
 * 属性值
 */
public class PropValue {

    /*
     * 类目ID
     */
    private Number cid;

    /*
     * 属性值feature
     */
    private Feature[] features;

    /*
     * 是否为父类目属性
     */
    private Boolean isParent;

    /*
     * 修改时间（类目增量专用）
     */
    private Date modifiedTime;

    /*
     * 三种枚举类型：modify，add，delete (增量类目专用)
     */
    private String modifiedType;

    /*
     * 属性值
     */
    private String name;

    /*
     * 属性值别名
     */
    private String nameAlias;

    /*
     * 属性 ID
     */
    private Number pid;

    /*
     * 属性名
     */
    private String propName;

    /*
     * 排列序号。取值范围:大于零的整数
     */
    private Number sortOrder;

    /*
     * 状态。可选值:normal(正常),deleted(删除)
     */
    private String status;

    /*
     * 属性值ID
     */
    private Number vid;

    public Number getCid() {
        return cid;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public Boolean getIsParent() {
        return isParent;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public String getModifiedType() {
        return modifiedType;
    }

    public String getName() {
        return name;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public Number getPid() {
        return pid;
    }

    public String getPropName() {
        return propName;
    }

    public Number getSortOrder() {
        return sortOrder;
    }

    public String getStatus() {
        return status;
    }

    public Number getVid() {
        return vid;
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

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setModifiedType(String modifiedType) {
        this.modifiedType = modifiedType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public void setPid(Number pid) {
        this.pid = pid;
    }

    public void setPropName(String propName) {
        this.propName = propName;
    }

    public void setSortOrder(Number sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVid(Number vid) {
        this.vid = vid;
    }
}
