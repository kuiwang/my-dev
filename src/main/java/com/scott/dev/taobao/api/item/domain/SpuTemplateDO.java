package com.scott.dev.taobao.api.item.domain;

/*
 * SPU发布模板，定义了产品发布需要那些关键属性，绑定属性
 */
public class SpuTemplateDO {

    /*
     * 产品关键属性，内容为属性ID(PID)的列表，注意关键属性可以在类目上不存在。
     * 不存在的PID，默认为输入，没有子属性。属性名称在prop_name_str中取
     */
    private Number[] keyProperties;

    /*
     * 产品绑定属性，内容为属性ID(PID)的列表,绑定属性肯定在类目上有，
     * 对应属性的类目特征，子属性请根据PID到类目上去取
     */
    private Number[] affectProperties;

    /*
     * 过滤属性，内容有属性ID(PID)列表，很重要的属性，
     * filter_properties包含的属性，必须填写
     */
    private Number[] filterProperties;

    /*
     * 类目ID
     */
    private Number categoryId;

    /*
     * 模板ID，发布产品，必须放到Product中
     */
    private Number templateId;

    /*
     * 品类ID，和类目ID类似
     */
    private Number commodityId;

    /*
     * 属性名称扁平化结构，只保证不在类目上的CP有值
     */
    private String propNameStr;

    //预留
    private String propFeatures;

    public Number[] getKeyProperties() {
        return keyProperties;
    }

    public void setKeyProperties(Number[] keyProperties) {
        this.keyProperties = keyProperties;
    }

    public Number[] getAffectProperties() {
        return affectProperties;
    }

    public void setAffectProperties(Number[] affectProperties) {
        this.affectProperties = affectProperties;
    }

    public Number[] getFilterProperties() {
        return filterProperties;
    }

    public void setFilterProperties(Number[] filterProperties) {
        this.filterProperties = filterProperties;
    }

    public Number getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Number categoryId) {
        this.categoryId = categoryId;
    }

    public Number getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Number templateId) {
        this.templateId = templateId;
    }

    public Number getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Number commodityId) {
        this.commodityId = commodityId;
    }

    public String getPropNameStr() {
        return propNameStr;
    }

    public void setPropNameStr(String propNameStr) {
        this.propNameStr = propNameStr;
    }

    public String getPropFeatures() {
        return propFeatures;
    }

    public void setPropFeatures(String propFeatures) {
        this.propFeatures = propFeatures;
    }
}
