package com.scott.dev.taobao.api.delivery.domain;

import java.util.Date;

/*
 * 运费模板对象
 */
public class DeliveryTemplate {

    /*
     * 运费模板上设置的发货地址
     */
    private String address;

    /*
     * 可选值：0,1,2,3
    ,说明如下
    1)买家承担运费的模版
    0：买家承担服务费
    1: 卖家承担服务费
    2)卖家承担运费的模版
    2:卖家承担运费的模版（集市），卖家承担服务费
    3:卖家承担运费的模版（天猫），卖家承担服务费
     */
    private Number assumer;

    /*
     * 该模板上设置的卖家发货地址区域ID，
     * 如：address为浙江省杭州市西湖去文三路XX号那么这个consign_area_id的值就是西湖区的ID
     */
    private Number consignAreaId;

    /*
     * 模板创建时间
     */
    private Date created;

    /*
     * 运费模板中运费详细信息对象，包含默认运费和指定地区运费
     */
    private TopFee[] feeList;

    /*
     * 模板修改时间
     */
    private Date modified;

    /*
     * 模板名称，长度不能超过25个字节
     */
    private String name;

    /*
     * 物流服务模板支持增值服务列表，多个用分号隔开。cod:货到付款 mops：刷卡付款
     */
    private String supports;

    /*
     * 模块ID
     */
    private Number templateId;

    /*
     * 可选值：0 说明： 0:表示按宝贝件数计算运费 
    
    1:表示按宝贝重量计算运费 
    
    3:表示按宝贝体积计算运费
     */
    private Number valuation;

    public String getAddress() {
        return address;
    }

    public Number getAssumer() {
        return assumer;
    }

    public Number getConsignAreaId() {
        return consignAreaId;
    }

    public Date getCreated() {
        return created;
    }

    public TopFee[] getFeeList() {
        return feeList;
    }

    public Date getModified() {
        return modified;
    }

    public String getName() {
        return name;
    }

    public String getSupports() {
        return supports;
    }

    public Number getTemplateId() {
        return templateId;
    }

    public Number getValuation() {
        return valuation;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAssumer(Number assumer) {
        this.assumer = assumer;
    }

    public void setConsignAreaId(Number consignAreaId) {
        this.consignAreaId = consignAreaId;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setFeeList(TopFee[] feeList) {
        this.feeList = feeList;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSupports(String supports) {
        this.supports = supports;
    }

    public void setTemplateId(Number templateId) {
        this.templateId = templateId;
    }

    public void setValuation(Number valuation) {
        this.valuation = valuation;
    }

}
