package com.scott.dev.taobao.api.fenxiao.domain;

//产品分销商属性
public class FenxiaoPdu {

    //产品ID
    private Number productId;

    //分销商ID
    private Number distributorId;

    //产品销售属性值
    private String skuProperties;

    //产品代销配额库存
    private Number quantityAgent;

    //分销商用户名
    private String distributorName;

    public Number getProductId() {
        return productId;
    }

    public void setProductId(Number productId) {
        this.productId = productId;
    }

    public Number getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(Number distributorId) {
        this.distributorId = distributorId;
    }

    public String getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public Number getQuantityAgent() {
        return quantityAgent;
    }

    public void setQuantityAgent(Number quantityAgent) {
        this.quantityAgent = quantityAgent;
    }

    public String getDistributorName() {
        return distributorName;
    }

    public void setDistributorName(String distributorName) {
        this.distributorName = distributorName;
    }
}
