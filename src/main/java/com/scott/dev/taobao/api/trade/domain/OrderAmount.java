package com.scott.dev.taobao.api.trade.domain;

/*
 * 子订单的帐务数据结构
 */
public class OrderAmount {

    /*
     * 子交易订单编号
     */
    private Number oid;

    /*
     * 商品标题
     */
    private String title;

    /*
     * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
     */
    private String skuPropertiesName;

    /*
     * 子交易订单中购买商品的数量
     */
    private Number num;

    /*
     * 商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String price;

    /*
     * 子订单的系统优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String discountFee;

    /*
     * 卖家手工调整的子订单的优惠金额.格式为:1.01;单位:元;精确到小数点后两位.
     */
    private String adjustFee;

    /*
     *  子订单的系统优惠的名称，对应于discount_fee的名称
     */
    private String promotionName;

    /*
     *  子订单对应的商品数字id
     */
    private Number numIid;

    /*
     *  子订单对应的商品的sku_id
     */
    private Number skuId;

    /*
     * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。
     * 计算公式如下：payment = price * num + adjust_fee - discount_fee + post_fee
     * (邮费，单笔子订单时子订单实付金额包含邮费，多笔子订单时不包含邮费)；
     * 对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。
     * 建议使用退款前的实付金额减去退款单中的实际退款金额计算
     */
    private String payment;

    /*
     *分摊之后的实付金额
     */
    private String divideOrderFee;

    /*
     * 优惠分摊
     */
    private String partMjzDiscount;

    public Number getOid() {
        return oid;
    }

    public void setOid(Number oid) {
        this.oid = oid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSkuPropertiesName() {
        return skuPropertiesName;
    }

    public void setSkuPropertiesName(String skuPropertiesName) {
        this.skuPropertiesName = skuPropertiesName;
    }

    public Number getNum() {
        return num;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public String getAdjustFee() {
        return adjustFee;
    }

    public void setAdjustFee(String adjustFee) {
        this.adjustFee = adjustFee;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Number getNumIid() {
        return numIid;
    }

    public void setNumIid(Number numIid) {
        this.numIid = numIid;
    }

    public Number getSkuId() {
        return skuId;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getDivideOrderFee() {
        return divideOrderFee;
    }

    public void setDivideOrderFee(String divideOrderFee) {
        this.divideOrderFee = divideOrderFee;
    }

    public String getPartMjzDiscount() {
        return partMjzDiscount;
    }

    public void setPartMjzDiscount(String partMjzDiscount) {
        this.partMjzDiscount = partMjzDiscount;
    }
}
