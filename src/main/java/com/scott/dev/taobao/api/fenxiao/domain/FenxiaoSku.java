package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 分销产品SKU
 */
public class FenxiaoSku {

    /*
     * 名称
     */
    private String name;

    /*
     * 商家编码
     */
    private String outerId;

    /*
     * 市场价
     */
    private String standardPrice;

    /*
     * SkuID
     */
    private Number id;

    /*
     * 库存
     */
    private Number quantity;

    /*
     * sku的销售属性组合字符串。格式:pid:vid;pid:vid,
     * 如:1627207:3232483;1630696:3284570,表示:机身颜色:军绿色;手机套餐:一电一充
     */
    private String properties;

    /*
     * 代销采购价，单位：元
     */
    private String costPrice;

    /*
     * 经销采购价
     */
    private String dealerCostPrice;

    /*
     * 关联的后端商品id
     */
    private Number scitemId;

    /*
     * 预扣库存
     */
    private Number reservedQuantity;

    /*
     * 配额可用库存
     */
    private Number quotaQuantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOuterId() {
        return outerId;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public String getStandardPrice() {
        return standardPrice;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getQuantity() {
        return quantity;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public String getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public String getDealerCostPrice() {
        return dealerCostPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public Number getScitemId() {
        return scitemId;
    }

    public void setScitemId(Number scitemId) {
        this.scitemId = scitemId;
    }

    public Number getReservedQuantity() {
        return reservedQuantity;
    }

    public void setReservedQuantity(Number reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public Number getQuotaQuantity() {
        return quotaQuantity;
    }

    public void setQuotaQuantity(Number quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }
}
