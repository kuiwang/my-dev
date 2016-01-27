package com.scott.dev.taobao.api.fenxiao.domain;

//产品分销商属性
public class FenxiaoPdu {

    //分销商ID
    private Number distributorId;

    //分销商用户名
    private String distributorName;

    //产品ID
    private Number productId;

    //产品代销配额库存
    private Number quantityAgent;

    //产品销售属性值
    private String skuProperties;

    public Number getDistributorId() {
        return distributorId;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public Number getProductId() {
        return productId;
    }

    public Number getQuantityAgent() {
        return quantityAgent;
    }

    public String getSkuProperties() {
        return skuProperties;
    }

    public void setDistributorId(Number distributorId) {
        this.distributorId = distributorId;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public void setQuantityAgent(Number quantityAgent) {
        this.quantityAgent = quantityAgent;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }
}
