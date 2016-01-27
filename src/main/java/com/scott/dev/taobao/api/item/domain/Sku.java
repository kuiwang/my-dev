package com.scott.dev.taobao.api.item.domain;

/*
 * Sku结构
 */
public class Sku {

    /*
     * 商品级别的条形码
     */
    private String barcode;

    /*
     * 基础色数据
     */
    private String changeProp;

    /*
     * sku创建日期 时间格式：yyyy-MM-dd HH:mm:ss
     */
    private String created;

    /*
     * sku所属商品id(注意：iid近期即将废弃，请用num_iid参数)
     */
    private String iid;

    /*
     * sku最后修改日期 时间格式：yyyy-MM-dd HH:mm:ss
     */
    private String modified;

    /*
     * sku所属商品数字id
     */
    private Number numIid;

    /*
     * 商家设置的外部id。天猫和集市的卖家，
     * 需要登录才能获取到自己的商家编码，不能获取到他人的商家编码。
     */
    private String outerId;

    /*
     * 属于这个sku的商品的价格 取值范围:0-100000000;精确到2位小数;单位:元。
     * 如:200.07，表示:200元7分。
     */
    private String price;

    /*
     * sku的销售属性组合字符串（颜色，大小，等等，可通过类目API获取某类目下的销售属性）,格式是p1:v1;p2:v2
     */
    private String properties;

    /*
     * sku所对应的销售属性的中文名字串，格式如：pid1:vid1:pid_name1:vid_name1;pid2:vid2:pid_name2:vid_name2……
     */
    private String propertiesName;

    /*
     * 属于这个sku的商品的数量，
     */
    private Number quantity;

    /*
     * sku级别发货时间
     */
    private String skuDeliveryTime;

    /*
     * sku的id
     */
    private Number skuId;

    /*
     * 表示SKu上的产品规格信息
     */
    private Number skuSpecId;

    /*
     * sku状态。 normal:正常 ；delete:删除
     */
    private String status;

    /*
     * 商品在付款减库存的状态下，该sku上未付款的订单数量
     */
    private Number withHoldQuantity;

    public String getBarcode() {
        return barcode;
    }

    public String getChangeProp() {
        return changeProp;
    }

    public String getCreated() {
        return created;
    }

    public String getIid() {
        return iid;
    }

    public String getModified() {
        return modified;
    }

    public Number getNumIid() {
        return numIid;
    }

    public String getOuterId() {
        return outerId;
    }

    public String getPrice() {
        return price;
    }

    public String getProperties() {
        return properties;
    }

    public String getPropertiesName() {
        return propertiesName;
    }

    public Number getQuantity() {
        return quantity;
    }

    public String getSkuDeliveryTime() {
        return skuDeliveryTime;
    }

    public Number getSkuId() {
        return skuId;
    }

    public Number getSkuSpecId() {
        return skuSpecId;
    }

    public String getStatus() {
        return status;
    }

    public Number getWithHoldQuantity() {
        return withHoldQuantity;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setChangeProp(String changeProp) {
        this.changeProp = changeProp;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public void setNumIid(Number numIid) {
        this.numIid = numIid;
    }

    public void setOuterId(String outerId) {
        this.outerId = outerId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    public void setPropertiesName(String propertiesName) {
        this.propertiesName = propertiesName;
    }

    public void setQuantity(Number quantity) {
        this.quantity = quantity;
    }

    public void setSkuDeliveryTime(String skuDeliveryTime) {
        this.skuDeliveryTime = skuDeliveryTime;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public void setSkuSpecId(Number skuSpecId) {
        this.skuSpecId = skuSpecId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setWithHoldQuantity(Number withHoldQuantity) {
        this.withHoldQuantity = withHoldQuantity;
    }
}
