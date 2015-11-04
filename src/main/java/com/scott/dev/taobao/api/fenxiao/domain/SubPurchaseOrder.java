package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 子采购单详细信息
 */
public class SubPurchaseOrder {

    //分销平台上商品商家编码
    private String itemOuterId;

    //SKU商家编码
    private String skuOuterId;

    //SKU属性值。如: 颜色:红色:别名;尺码:L:别名
    private String skuProperties;

    //快照地址。
    private String snapshotUrl;

    //创建时间。格式 yyyy-MM-dd HH:mm:ss 。
    private Date created;

    /*
     * 交易状态。可选值：
    WAIT_BUYER_PAY(等待付款)
    WAIT_CONFIRM(付款信息待确认)
    WAIT_CONFIRM_WAIT_SEND_GOODS(付款信息待确认，待发货)
    WAIT_CONFIRM_SEND_GOODS(付款信息待确认，已发货)
    WAIT_CONFIRM_GOODS_CONFIRM(付款信息待确认，已收货)
    WAIT_SELLER_SEND_GOODS(已付款，待发货)
    WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)
    WAIT_BUYER_CONFIRM_GOODS_ACOUNTED(已付款（已分账），已发货。只对代销分账支持)
    CONFIRM_WAIT_SEND_GOODS(付款信息已确认，待发货)
    CONFIRM_SEND_GOODS(付款信息已确认，已发货)
    TRADE_REFUNDED(已退款)
    TRADE_REFUNDING(退款中)
    TRADE_FINISHED(交易成功)
    TRADE_CLOSED(交易关闭)
    PAY_ACOUNTED_GOODS_CONFIRM （已分账发货成功）
    PAY_WAIT_ACOUNT_GOODS_CONFIRM（已付款，确认收货）
     */
    private String status;

    //退款金额
    private Price refundFee;

    /*
     * 子采购单id，淘宝交易主键，采购单未付款时为0.（只有支付宝 付款才有这个id，其余付款形式该字段为0）
     */
    private Number id;

    //分销平台的子采购单主键
    private Number fenxiaoId;

    //商品的SKU id。当存在时才会有值，建议使用sku_outer_id，sku_properties这两个值
    private Number skuId;

    //TC子订单ID（经销不显示）
    private Number tcOrderId;

    //分销平台上的产品id，同FenxiaoProduct 的pid
    private Number itemId;

    /*
     * 代销采购单对应下游200订单状态。 可选值： WAIT_SELLER_SEND_GOODS(已付款，待发货) 
     * WAIT_BUYER_CONFIRM_GOODS(已付款，已发货) TRADE_CLOSED(已退款成功) TRADE_REFUNDING(退款中) 
     * TRADE_FINISHED(交易成功) TRADE_CLOSED_BY_TAOBAO(交易关闭)
     */
    private String order200Status;

    //分销商店铺中宝贝一口价
    private Price auctionPrice;

    //产品的采购数量。取值范围:大于零的整数
    private Number num;

    //采购的产品标题。
    private String title;

    //产品的采购价格。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
    private Price price;

    //  分销商应付金额=num(采购数量)*price(采购价)。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
    private Price totalFee;

    //分销商实付金额=total_fee（分销商应付金额）+改价-优惠。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
    private Price distributorPayment;

    //买家订单上对应的子单零售金额，除以num（数量）后等于最终宝贝的零售价格（精确到2位小数;单位:元。如:200.07，表示:200元7分）
    private Price buyerPayment;

    //发票应开金额。根据买家实际付款去除邮费后，按各个子单(商品)金额比例进行分摊后的金额，仅供开发票时做票面金额参考
    private Price billFee;

    //后端商品id
    private Number scItemId;

    //商品优惠类型：聚划算、秒杀或其他
    private String tcPreferentialType;

    //优惠金额，始终为正数，单位是分，不带小数
    private Number tcDiscountFee;

    //商品的卖出金额调整，金额增加时为正数，金额减少时为负数，单位是分，不带小数
    private Number tcAdjustFee;

    //优惠活动的折扣金额
    private Price discountFee;

    //优惠活动类型 0=无优惠 1=限时折
    private String promotionType;

    /*
     * Feature对象列表 目前已有的属性： attr_key为 www，attr_value为1 
     * 表示是www子订单 attr_key为 wwwStoreCode，
     * attr_value 是www子订单发货的仓库编码 attr_key为isWt,attr_value为1 
     * 表示是网厅子订单 attr_key为wtInfo,attr_value为网厅相关合约信息
     */
    private Feature[] features;

    //老的SKU属性值。如: 颜色:红色:别名;尺码:L:别名
    private String oldSkuProperties;

    public String getItemOuterId() {
        return itemOuterId;
    }

    public void setItemOuterId(String itemOuterId) {
        this.itemOuterId = itemOuterId;
    }

    public String getSkuOuterId() {
        return skuOuterId;
    }

    public void setSkuOuterId(String skuOuterId) {
        this.skuOuterId = skuOuterId;
    }

    public String getSkuProperties() {
        return skuProperties;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Price getRefundFee() {
        return refundFee;
    }

    public void setRefundFee(Price refundFee) {
        this.refundFee = refundFee;
    }

    public Number getId() {
        return id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Number getFenxiaoId() {
        return fenxiaoId;
    }

    public void setFenxiaoId(Number fenxiaoId) {
        this.fenxiaoId = fenxiaoId;
    }

    public Number getSkuId() {
        return skuId;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public Number getTcOrderId() {
        return tcOrderId;
    }

    public void setTcOrderId(Number tcOrderId) {
        this.tcOrderId = tcOrderId;
    }

    public Number getItemId() {
        return itemId;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public String getOrder200Status() {
        return order200Status;
    }

    public void setOrder200Status(String order200Status) {
        this.order200Status = order200Status;
    }

    public Price getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(Price auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public Number getNum() {
        return num;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public Price getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Price totalFee) {
        this.totalFee = totalFee;
    }

    public Price getDistributorPayment() {
        return distributorPayment;
    }

    public void setDistributorPayment(Price distributorPayment) {
        this.distributorPayment = distributorPayment;
    }

    public Price getBuyerPayment() {
        return buyerPayment;
    }

    public void setBuyerPayment(Price buyerPayment) {
        this.buyerPayment = buyerPayment;
    }

    public Price getBillFee() {
        return billFee;
    }

    public void setBillFee(Price billFee) {
        this.billFee = billFee;
    }

    public Number getScItemId() {
        return scItemId;
    }

    public void setScItemId(Number scItemId) {
        this.scItemId = scItemId;
    }

    public String getTcPreferentialType() {
        return tcPreferentialType;
    }

    public void setTcPreferentialType(String tcPreferentialType) {
        this.tcPreferentialType = tcPreferentialType;
    }

    public Number getTcDiscountFee() {
        return tcDiscountFee;
    }

    public void setTcDiscountFee(Number tcDiscountFee) {
        this.tcDiscountFee = tcDiscountFee;
    }

    public Number getTcAdjustFee() {
        return tcAdjustFee;
    }

    public void setTcAdjustFee(Number tcAdjustFee) {
        this.tcAdjustFee = tcAdjustFee;
    }

    public Price getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(Price discountFee) {
        this.discountFee = discountFee;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    public String getOldSkuProperties() {
        return oldSkuProperties;
    }

    public void setOldSkuProperties(String oldSkuProperties) {
        this.oldSkuProperties = oldSkuProperties;
    }
}
