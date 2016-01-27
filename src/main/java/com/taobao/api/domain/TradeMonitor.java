package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 经销订单监控记录信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TradeMonitor extends TaobaoObject {

    private static final long serialVersionUID = 2845797917167662741L;

    /**
     * 地区
     */
    @ApiField("area")
    private String area;

    /**
     * 交易订单的商品购买数量
     */
    @ApiField("buy_amount")
    private Long buyAmount;

    /**
     * 收货人姓名
     */
    @ApiField("buyer_full_name")
    private String buyerFullName;

    /**
     * 买家的淘宝账号昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 城市
     */
    @ApiField("city")
    private String city;

    /**
     * 经销商的淘宝账号昵称
     */
    @ApiField("distributor_nick")
    private String distributorNick;

    /**
     * 交易订单的商品id
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 交易订单的商品的商家编码
     */
    @ApiField("item_number")
    private String itemNumber;

    /**
     * 交易订单的商品价格
     */
    @ApiField("item_price")
    private Long itemPrice;

    /**
     * 交易订单的商品的sku名称
     */
    @ApiField("item_sku_name")
    private String itemSkuName;

    /**
     * 交易订单的商品的sku商家编码
     */
    @ApiField("item_sku_number")
    private String itemSkuNumber;

    /**
     * 交易订单的商品标题
     */
    @ApiField("item_title")
    private String itemTitle;

    /**
     * 交易订单的商品总价格（单价×数量+改价+优惠）
     */
    @ApiField("item_total_price")
    private Long itemTotalPrice;

    /**
     * 交易订单的付款时间
     */
    @ApiField("pay_time")
    private Date payTime;

    /**
     * 供应商的产品id
     */
    @ApiField("product_id")
    private Long productId;

    /**
     * 供应商的产品的商家编码
     */
    @ApiField("product_number")
    private String productNumber;

    /**
     * 供应商的产品的sku商家编码
     */
    @ApiField("product_sku_number")
    private String productSkuNumber;

    /**
     * 供应商的产品标题
     */
    @ApiField("product_title")
    private String productTitle;

    /**
     * 省份
     */
    @ApiField("provence")
    private String provence;

    /**
     * 交易订单的商品最高零售价
     */
    @ApiField("retail_price_high")
    private Long retailPriceHigh;

    /**
     * 交易订单的商品最低零售价
     */
    @ApiField("retail_price_low")
    private Long retailPriceLow;

    /**
     * 收货人地址
     */
    @ApiField("shipping_address")
    private String shippingAddress;

    /**
     * 交易订单的状态： WAIT_SELLER_SEND_GOODS(已付款，待发货）<br>
     * WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)<br>
     * TRADE_FINISHED(交易成功) TRADE_CLOSED(交易关闭)<br>
     * TRADE_REFUNDING（退款中）
     */
    @ApiField("status")
    private String status;

    /**
     * 交易订单的子订单号
     */
    @ApiField("sub_tc_order_id")
    private Long subTcOrderId;

    /**
     * 供应商的淘宝账号昵称
     */
    @ApiField("supplier_nick")
    private String supplierNick;

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
     * 交易订单号
     */
    @ApiField("tc_order_id")
    private Long tcOrderId;

    /**
     * 商品优惠类型：聚划算、秒杀或其他
     */
    @ApiField("tc_preferential_type")
    private String tcPreferentialType;

    /**
     * 主键id
     */
    @ApiField("trade_monitor_id")
    private Long tradeMonitorId;

    public String getArea() {
        return this.area;
    }

    public Long getBuyAmount() {
        return this.buyAmount;
    }

    public String getBuyerFullName() {
        return this.buyerFullName;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public String getCity() {
        return this.city;
    }

    public String getDistributorNick() {
        return this.distributorNick;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getItemNumber() {
        return this.itemNumber;
    }

    public Long getItemPrice() {
        return this.itemPrice;
    }

    public String getItemSkuName() {
        return this.itemSkuName;
    }

    public String getItemSkuNumber() {
        return this.itemSkuNumber;
    }

    public String getItemTitle() {
        return this.itemTitle;
    }

    public Long getItemTotalPrice() {
        return this.itemTotalPrice;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProductNumber() {
        return this.productNumber;
    }

    public String getProductSkuNumber() {
        return this.productSkuNumber;
    }

    public String getProductTitle() {
        return this.productTitle;
    }

    public String getProvence() {
        return this.provence;
    }

    public Long getRetailPriceHigh() {
        return this.retailPriceHigh;
    }

    public Long getRetailPriceLow() {
        return this.retailPriceLow;
    }

    public String getShippingAddress() {
        return this.shippingAddress;
    }

    public String getStatus() {
        return this.status;
    }

    public Long getSubTcOrderId() {
        return this.subTcOrderId;
    }

    public String getSupplierNick() {
        return this.supplierNick;
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

    public Long getTradeMonitorId() {
        return this.tradeMonitorId;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setBuyAmount(Long buyAmount) {
        this.buyAmount = buyAmount;
    }

    public void setBuyerFullName(String buyerFullName) {
        this.buyerFullName = buyerFullName;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistributorNick(String distributorNick) {
        this.distributorNick = distributorNick;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void setItemSkuName(String itemSkuName) {
        this.itemSkuName = itemSkuName;
    }

    public void setItemSkuNumber(String itemSkuNumber) {
        this.itemSkuNumber = itemSkuNumber;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setItemTotalPrice(Long itemTotalPrice) {
        this.itemTotalPrice = itemTotalPrice;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    public void setProductSkuNumber(String productSkuNumber) {
        this.productSkuNumber = productSkuNumber;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }

    public void setRetailPriceHigh(Long retailPriceHigh) {
        this.retailPriceHigh = retailPriceHigh;
    }

    public void setRetailPriceLow(Long retailPriceLow) {
        this.retailPriceLow = retailPriceLow;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubTcOrderId(Long subTcOrderId) {
        this.subTcOrderId = subTcOrderId;
    }

    public void setSupplierNick(String supplierNick) {
        this.supplierNick = supplierNick;
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

    public void setTradeMonitorId(Long tradeMonitorId) {
        this.tradeMonitorId = tradeMonitorId;
    }

}
