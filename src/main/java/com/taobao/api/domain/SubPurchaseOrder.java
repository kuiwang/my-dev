package com.taobao.api.domain;

import java.util.Date;
import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 子采购单详细信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class SubPurchaseOrder extends TaobaoObject {

    private static final long serialVersionUID = 4562945523167255629L;

    /**
     * 分销商店铺中宝贝一口价
     */
    @ApiField("auction_price")
    private String auctionPrice;

    /**
     * 发票应开金额。根据买家实际付款去除邮费后，按各个子单(商品)金额比例进行分摊后的金额，仅供开发票时做票面金额参考。
     */
    @ApiField("bill_fee")
    private String billFee;

    /**
     * 买家订单上对应的子单零售金额，除以num（数量）后等于最终宝贝的零售价格（精确到2位小数;单位:元。如:200.07，表示:200元7分
     * ）
     */
    @ApiField("buyer_payment")
    private String buyerPayment;

    /**
     * 创建时间。格式 yyyy-MM-dd HH:mm:ss 。
     */
    @ApiField("created")
    private Date created;

    /**
     * 优惠活动的折扣金额
     */
    @ApiField("discount_fee")
    private String discountFee;

    /**
     * 分销商实付金额=total_fee（分销商应付金额）+改价-优惠。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
     */
    @ApiField("distributor_payment")
    private String distributorPayment;

    /**
     * Feature对象列表 目前已有的属性： attr_key为 www，attr_value为1 表示是www子订单 attr_key为
     * wwwStoreCode，attr_value 是www子订单发货的仓库编码 attr_key为isWt,attr_value为1
     * 表示是网厅子订单 attr_key为wtInfo,attr_value为网厅相关合约信息
     */
    @ApiListField("features")
    @ApiField("feature")
    private List<Feature> features;

    /**
     * 分销平台的子采购单主键
     */
    @ApiField("fenxiao_id")
    private Long fenxiaoId;

    /**
     * 子采购单id，淘宝交易主键，采购单未付款时为0.（只有支付宝 付款才有这个id，其余付款形式该字段为0）
     */
    @ApiField("id")
    private Long id;

    /**
     * 分销平台上的产品id，同FenxiaoProduct 的pid
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 分销平台上商品商家编码。
     */
    @ApiField("item_outer_id")
    private String itemOuterId;

    /**
     * 产品的采购数量。取值范围:大于零的整数
     */
    @ApiField("num")
    private Long num;

    /**
     * 老的SKU属性值。如: 颜色:红色:别名;尺码:L:别名
     */
    @ApiField("old_sku_properties")
    private String oldSkuProperties;

    /**
     * 代销采购单对应下游200订单状态。 可选值： WAIT_SELLER_SEND_GOODS(已付款，待发货)
     * WAIT_BUYER_CONFIRM_GOODS(已付款，已发货) TRADE_CLOSED(已退款成功)
     * TRADE_REFUNDING(退款中) TRADE_FINISHED(交易成功)
     * TRADE_CLOSED_BY_TAOBAO(交易关闭)
     */
    @ApiField("order_200_status")
    private String order200Status;

    /**
     * 产品的采购价格。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
     */
    @ApiField("price")
    private String price;

    /**
     * 优惠活动类型 0=无优惠 1=限时折
     */
    @ApiField("promotion_type")
    private String promotionType;

    /**
     * 退款金额
     */
    @ApiField("refund_fee")
    private String refundFee;

    /**
     * 后端商品id
     */
    @ApiField("sc_item_id")
    private Long scItemId;

    /**
     * 商品的SKU id。当存在时才会有值，建议使用sku_outer_id，sku_properties这两个值
     */
    @ApiField("sku_id")
    private Long skuId;

    /**
     * SKU商家编码。
     */
    @ApiField("sku_outer_id")
    private String skuOuterId;

    /**
     * SKU属性值。如: 颜色:红色:别名;尺码:L:别名
     */
    @ApiField("sku_properties")
    private String skuProperties;

    /**
     * 快照地址。
     */
    @ApiField("snapshot_url")
    private String snapshotUrl;

    /**
     * 交易状态。可选值：<br>
     * WAIT_BUYER_PAY(等待付款)<br>
     * WAIT_CONFIRM(付款信息待确认)<br>
     * WAIT_CONFIRM_WAIT_SEND_GOODS(付款信息待确认，待发货)<br>
     * WAIT_CONFIRM_SEND_GOODS(付款信息待确认，已发货)<br>
     * WAIT_CONFIRM_GOODS_CONFIRM(付款信息待确认，已收货)<br>
     * WAIT_SELLER_SEND_GOODS(已付款，待发货)<br>
     * WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)<br>
     * WAIT_BUYER_CONFIRM_GOODS_ACOUNTED(已付款（已分账），已发货。只对代销分账支持)<br>
     * CONFIRM_WAIT_SEND_GOODS(付款信息已确认，待发货)<br>
     * CONFIRM_SEND_GOODS(付款信息已确认，已发货)<br>
     * TRADE_REFUNDED(已退款)<br>
     * TRADE_REFUNDING(退款中)<br>
     * TRADE_FINISHED(交易成功)<br>
     * TRADE_CLOSED(交易关闭)<br>
     * PAY_ACOUNTED_GOODS_CONFIRM （已分账发货成功）<br>
     * PAY_WAIT_ACOUNT_GOODS_CONFIRM（已付款，确认收货）
     */
    @ApiField("status")
    private String status;

    /**
     * 商品的卖出金额调整，金额增加时为正数，金额减少时为负数，单位是分，不带小数
     */
    @ApiField("tc_adjust_fee")
    private Long tcAdjustFee;

    /**
     * 优惠金额，始终为正数，单位是分，不带小数
     */
    @ApiField("tc_discount_fee")
    private Long tcDiscountFee;

    /**
     * TC子订单ID（经销不显示）
     */
    @ApiField("tc_order_id")
    private Long tcOrderId;

    /**
     * 商品优惠类型：聚划算、秒杀或其他
     */
    @ApiField("tc_preferential_type")
    private String tcPreferentialType;

    /**
     * 采购的产品标题。
     */
    @ApiField("title")
    private String title;

    /**
     * 分销商应付金额=num(采购数量)*price(采购价)。（精确到2位小数;单位:元。如:200.07，表示:200元7分）
     */
    @ApiField("total_fee")
    private String totalFee;

    public String getAuctionPrice() {
        return this.auctionPrice;
    }

    public String getBillFee() {
        return this.billFee;
    }

    public String getBuyerPayment() {
        return this.buyerPayment;
    }

    public Date getCreated() {
        return this.created;
    }

    public String getDiscountFee() {
        return this.discountFee;
    }

    public String getDistributorPayment() {
        return this.distributorPayment;
    }

    public List<Feature> getFeatures() {
        return this.features;
    }

    public Long getFenxiaoId() {
        return this.fenxiaoId;
    }

    public Long getId() {
        return this.id;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getItemOuterId() {
        return this.itemOuterId;
    }

    public Long getNum() {
        return this.num;
    }

    public String getOldSkuProperties() {
        return this.oldSkuProperties;
    }

    public String getOrder200Status() {
        return this.order200Status;
    }

    public String getPrice() {
        return this.price;
    }

    public String getPromotionType() {
        return this.promotionType;
    }

    public String getRefundFee() {
        return this.refundFee;
    }

    public Long getScItemId() {
        return this.scItemId;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public String getSkuOuterId() {
        return this.skuOuterId;
    }

    public String getSkuProperties() {
        return this.skuProperties;
    }

    public String getSnapshotUrl() {
        return this.snapshotUrl;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getTcAdjustFee() {
        return this.tcAdjustFee;
    }

    public Long getTcDiscountFee() {
        return this.tcDiscountFee;
    }

    public Long getTcOrderId() {
        return this.tcOrderId;
    }

    public String getTcPreferentialType() {
        return this.tcPreferentialType;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTotalFee() {
        return this.totalFee;
    }

    public void setAuctionPrice(String auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public void setBillFee(String billFee) {
        this.billFee = billFee;
    }

    public void setBuyerPayment(String buyerPayment) {
        this.buyerPayment = buyerPayment;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public void setDistributorPayment(String distributorPayment) {
        this.distributorPayment = distributorPayment;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public void setFenxiaoId(Long fenxiaoId) {
        this.fenxiaoId = fenxiaoId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setItemOuterId(String itemOuterId) {
        this.itemOuterId = itemOuterId;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setOldSkuProperties(String oldSkuProperties) {
        this.oldSkuProperties = oldSkuProperties;
    }

    public void setOrder200Status(String order200Status) {
        this.order200Status = order200Status;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public void setRefundFee(String refundFee) {
        this.refundFee = refundFee;
    }

    public void setScItemId(Long scItemId) {
        this.scItemId = scItemId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSkuOuterId(String skuOuterId) {
        this.skuOuterId = skuOuterId;
    }

    public void setSkuProperties(String skuProperties) {
        this.skuProperties = skuProperties;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setTcAdjustFee(Long tcAdjustFee) {
        this.tcAdjustFee = tcAdjustFee;
    }

    public void setTcDiscountFee(Long tcDiscountFee) {
        this.tcDiscountFee = tcDiscountFee;
    }

    public void setTcOrderId(Long tcOrderId) {
        this.tcOrderId = tcOrderId;
    }

    public void setTcPreferentialType(String tcPreferentialType) {
        this.tcPreferentialType = tcPreferentialType;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

}
