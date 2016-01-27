package com.scott.dev.taobao.api.category.domain;

import java.util.Date;

/*
 * 商品属性
 */
public class ItemProp {

    /*
     * 子属性的模板（卖家自行输入属性时需要用到）
     */
    private String childTemplate;

    /*
     * 类目ID
     */
    private Number cid;

    /*
     * 属性的feature列表
     */
    private Feature[] features;

    /*
     * 是否允许别名。可选值：true（是），false（否）
     */
    private Boolean isAllowAlias;

    /*
     * 是否颜色属性。可选值:true(是),false(否)
     */
    private Boolean isColorProp;

    /*
     * 是否是可枚举属性。可选值:true(是),false(否)
     */
    private Boolean isEnumProp;

    /*
     * 在is_enum_prop是true的前提下，
     * 是否是卖家可以自行输入的属性（注：如果is_enum_prop返回false，该参数统一返回false）。
     * 可选值:true(是),false(否)。
     * 对于品牌和型号属性（包括子属性）：如果用户是C卖家，则可自定义属性；
     * 如果是B卖家，则不可自定义属性，而必须要授权的属性
     */
    private Boolean isInputProp;

    /*
     * 是否商品属性。可选值:true(是),false(否)
     */
    private Boolean isItemProp;

    /*
     * 是否关键属性。可选值:true(是),false(否)
     */
    private Boolean isKeyProp;

    /*
     * 是否销售属性。可选值:true(是),false(否)
     */
    private Boolean isSaleProp;

    /*
     * 属性修改时间（增量类目专用）
     */
    private Date modifiedTime;

    /*
     * 三种枚举类型：modify，add，delete（增量类目专用）
     */
    private String modifiedType;

    /*
     * 发布产品或商品时是否可以多选。可选值:true(是),false(否)
     */
    private Boolean multi;

    /*
     * 发布产品或商品时是否为必选属性。可选值:true(是),false(否)
     */
    private Boolean must;

    /*
     * 属性名
     */
    private String name;

    /*
     * 上级属性ID
     */
    private Number parentPid;

    /*
     * 上级属性值ID
     */
    private Number parentVid;

    /*
     * 属性 ID 例：品牌的PID=20000
     */
    private Number pid;

    private PropValue[] propValues;

    /*
     * 发布产品或商品时是否为必选属性(与must相同)。可选值:true(是),false(否)
     */
    private Boolean required;

    /*
     * 排列序号。取值范围:大于零的整数
     */
    private Number sortOrder;

    /*
     * 状态。可选值:normal(正常),deleted(删除)
     */
    private String status;

    /*
     * 属性值类型。可选值：
     *  multiCheck(枚举多选) optional(枚举单选) multiCheckText(枚举可输入多选) optionalText(枚举可输入单选) text(非枚举可输入)
     */
    private String type;

    public String getChildTemplate() {
        return childTemplate;
    }

    public Number getCid() {
        return cid;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public Boolean getIsAllowAlias() {
        return isAllowAlias;
    }

    public Boolean getIsColorProp() {
        return isColorProp;
    }

    public Boolean getIsEnumProp() {
        return isEnumProp;
    }

    public Boolean getIsInputProp() {
        return isInputProp;
    }

    public Boolean getIsItemProp() {
        return isItemProp;
    }

    public Boolean getIsKeyProp() {
        return isKeyProp;
    }

    public Boolean getIsSaleProp() {
        return isSaleProp;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public String getModifiedType() {
        return modifiedType;
    }

    public Boolean getMulti() {
        return multi;
    }

    public Boolean getMust() {
        return must;
    }

    public String getName() {
        return name;
    }

    public Number getParentPid() {
        return parentPid;
    }

    public Number getParentVid() {
        return parentVid;
    }

    public Number getPid() {
        return pid;
    }

    public PropValue[] getPropValues() {
        return propValues;
    }

    public Boolean getRequired() {
        return required;
    }

    public Number getSortOrder() {
        return sortOrder;
    }

    public String getStatus() {
        return status;
    }

    public String getType() {
        return type;
    }

    public void setChildTemplate(String childTemplate) {
        this.childTemplate = childTemplate;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    public void setIsAllowAlias(Boolean isAllowAlias) {
        this.isAllowAlias = isAllowAlias;
    }

    public void setIsColorProp(Boolean isColorProp) {
        this.isColorProp = isColorProp;
    }

    public void setIsEnumProp(Boolean isEnumProp) {
        this.isEnumProp = isEnumProp;
    }

    public void setIsInputProp(Boolean isInputProp) {
        this.isInputProp = isInputProp;
    }

    public void setIsItemProp(Boolean isItemProp) {
        this.isItemProp = isItemProp;
    }

    public void setIsKeyProp(Boolean isKeyProp) {
        this.isKeyProp = isKeyProp;
    }

    public void setIsSaleProp(Boolean isSaleProp) {
        this.isSaleProp = isSaleProp;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setModifiedType(String modifiedType) {
        this.modifiedType = modifiedType;
    }

    public void setMulti(Boolean multi) {
        this.multi = multi;
    }

    public void setMust(Boolean must) {
        this.must = must;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setParentPid(Number parentPid) {
        this.parentPid = parentPid;
    }

    public void setParentVid(Number parentVid) {
        this.parentVid = parentVid;
    }

    public void setPid(Number pid) {
        this.pid = pid;
    }

    public void setPropValues(PropValue[] propValues) {
        this.propValues = propValues;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public void setSortOrder(Number sortOrder) {
        this.sortOrder = sortOrder;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setType(String type) {
        this.type = type;
    }

}
