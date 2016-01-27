package com.scott.dev.taobao.api.fenxiao.domain;

/*
 * 分销产品SKU
 */
public class FenxiaoSku {

    /*
     * 代销采购价，单位：元
     */
    private String costPrice;

    /*
     * 经销采购价
     */
    private String dealerCostPrice;

    /*
     * SkuID
     */
    private Number id;

    /*
     * 名称
     */
    private String name;

    /*
     * 商家编码
     */
    private String outerId;

    /*
     * sku的销售属性组合字符串。格式:pid:vid;pid:vid,
     * 如:1627207:3232483;1630696:3284570,表示:机身颜色:军绿色;手机套餐:一电一充
     */
    private String properties;

    /*
     * 库存
     */
    private Number quantity;

    /*
     * 配额可用库存
     */
    private Number quotaQuantity;

    /*
     * 预扣库存
     */
    private Number reservedQuantity;

    /*
     * 关联的后端商品id
     */
    private Number scitemId;

    /*
     * 市场价
     */
    private String standardPrice;

    public String getCostPrice() {
        return costPrice;
    }

    public String getDealerCostPrice() {
        return dealerCostPrice;
    }

    public Number getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getOuterId() {
        return outerId;
    }

    public String getProperties() {
        return properties;
    }

    public Number getQuantity() {
        return quantity;
    }

    public Number getQuotaQuantity() {
        return quotaQuantity;
    }

    public Number getReservedQuantity() {
        return reservedQuantity;
    }

    public Number getScitemId() {
        return scitemId;
    }

    public String getStandardPrice() {
        return standardPrice;
    }

    public void setCostPrice(String costPrice) {
        this.costPrice = costPrice;
    }

    public void setDealerCostPrice(String dealerCostPrice) {
        this.dealerCostPrice = dealerCostPrice;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public void setQuotaQuantity(Number quotaQuantity) {
        this.quotaQuantity = quotaQuantity;
    }

    public void setReservedQuantity(Number reservedQuantity) {
        this.reservedQuantity = reservedQuantity;
    }

    public void setScitemId(Number scitemId) {
        this.scitemId = scitemId;
    }

    public void setStandardPrice(String standardPrice) {
        this.standardPrice = standardPrice;
    }
}
