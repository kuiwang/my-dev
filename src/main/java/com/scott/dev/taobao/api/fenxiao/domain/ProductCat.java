package com.scott.dev.taobao.api.fenxiao.domain;

//产品线
public class ProductCat {

    //产品线名称
    private String name;

    //产品数量
    private Number productNum;

    //  产品线ID
    private Number id;

    //最低零售价百分比
    private String retailLowPercent;

    //最高零食价百分比
    private String retailHighPercent;

    //代销采购价百分比
    private String costPercentAgent;

    //经销采购价百分比
    private String costPercentDealer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getProductNum() {
        return productNum;
    }

    public void setProductNum(Number productNum) {
        this.productNum = productNum;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getRetailLowPercent() {
        return retailLowPercent;
    }

    public void setRetailLowPercent(String retailLowPercent) {
        this.retailLowPercent = retailLowPercent;
    }

    public String getRetailHighPercent() {
        return retailHighPercent;
    }

    public void setRetailHighPercent(String retailHighPercent) {
        this.retailHighPercent = retailHighPercent;
    }

    public String getCostPercentAgent() {
        return costPercentAgent;
    }

    public void setCostPercentAgent(String costPercentAgent) {
        this.costPercentAgent = costPercentAgent;
    }

    public String getCostPercentDealer() {
        return costPercentDealer;
    }

    public void setCostPercentDealer(String costPercentDealer) {
        this.costPercentDealer = costPercentDealer;
    }
}
