package com.scott.dev.taobao.api.fenxiao.domain;

//产品线
public class ProductCat {

    //代销采购价百分比
    private String costPercentAgent;

    //经销采购价百分比
    private String costPercentDealer;

    //  产品线ID
    private Number id;

    //产品线名称
    private String name;

    //产品数量
    private Number productNum;

    //最高零食价百分比
    private String retailHighPercent;

    //最低零售价百分比
    private String retailLowPercent;

    public String getCostPercentAgent() {
        return costPercentAgent;
    }

    public String getCostPercentDealer() {
        return costPercentDealer;
    }

    public Number getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Number getProductNum() {
        return productNum;
    }

    public String getRetailHighPercent() {
        return retailHighPercent;
    }

    public String getRetailLowPercent() {
        return retailLowPercent;
    }

    public void setCostPercentAgent(String costPercentAgent) {
        this.costPercentAgent = costPercentAgent;
    }

    public void setCostPercentDealer(String costPercentDealer) {
        this.costPercentDealer = costPercentDealer;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductNum(Number productNum) {
        this.productNum = productNum;
    }

    public void setRetailHighPercent(String retailHighPercent) {
        this.retailHighPercent = retailHighPercent;
    }

    public void setRetailLowPercent(String retailLowPercent) {
        this.retailLowPercent = retailLowPercent;
    }
}
