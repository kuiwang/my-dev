package com.scott.dev.taobao.api.trade.domain;

import java.util.Date;

/*
 * 订单结构
 */
public class Order {

    /*
     * 套餐的值。如：M8原装电池:便携支架:M8专用座充:莫凡保护袋
     */
    private String itemMealName;

    /*
     * 商品图片的绝对路径
     */
    private String picPath;

    /*
     * 卖家昵称
     */
    private String sellerNick;

    /*
     * 买家昵称
     */
    private String buyerNick;

    /*
     * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) 
     * WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) 
     * CLOSED(退款关闭) SUCCESS(退款成功)
     */
    private String refundStatus;

    /*
     * 商家外部编码(可与商家外部系统对接)。外部商家自己定义的商品Item的id，可以通过taobao.items.custom.get获取商品的Item的信息
     */
    private String outerIid;

    /*
     * 订单快照URL
     */
    private String snapshotUrl;

    /*
     * 订单快照详细信息
     */
    private String snapshot;

    /*
     * 订单超时到期时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date timeoutActionTime;

    /*
     * 买家是否已评价。可选值：true(已评价)，false(未评价)
     */
    private Boolean buyerRate;

    /*
     * 卖家是否已评价。可选值：true(已评价)，false(未评价)
     */
    private Boolean sellerRate;

    /*
     * 卖家类型，可选值为：B（商城商家），C（普通卖家）
     */
    private String sellerType;

    /*
     * 交易商品对应的类目ID
     */
    private Number cid;

    /*
     * 子订单编号
     */
    private Number oid;

    /*
     * 订单状态（请关注此状态，如果为TRADE_CLOSED_BY_TAOBAO状态，则不要对此订单进行发货，切记啊！）。可选值:
    TRADE_NO_CREATE_PAY(没有创建支付宝交易)
    WAIT_BUYER_PAY(等待买家付款)
    WAIT_SELLER_SEND_GOODS(等待卖家发货,即:买家已付款)
    WAIT_BUYER_CONFIRM_GOODS(等待买家确认收货,即:卖家已发货)
    TRADE_BUYER_SIGNED(买家已签收,货到付款专用)
    TRADE_FINISHED(交易成功)
    TRADE_CLOSED(付款以后用户退款成功，交易自动关闭)
    TRADE_CLOSED_BY_TAOBAO(付款以前，卖家或买家主动关闭交易)
    PAY_PENDING(国际信用卡支付付款确认中)
     */
    private String status;

    /*
     * 商品的字符串编号(注意：iid近期即将废弃，请用num_iid参数)
     */
    private String iid;

    /*
     * 商品标题
     */
    private String title;

    /*
     *  商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String price;

    /*
     * 商品数字ID
     */
    private Number numIid;

    /*
     * 套餐ID
     */
    private Number itemMealId;

    /*
     * 商品的最小库存单位Sku的id.可以通过taobao.item.sku.get获取详细的Sku信息
     */
    private String skuId;

    /*
     * 购买数量。取值范围:大于零的整数
     */
    private Number num;

    /*
     * 外部网店自己定义的Sku编号
     */
    private String outerSkuId;

    /*
     * 子订单来源,如jhs(聚划算)、taobao(淘宝)、wap(无线)
     */
    private String orderFrom;

    /*
     * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单级订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String totalFee;

    /*
     * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。对于多子订单的交易，
     * 计算公式如下：payment = price * num + adjust_fee - discount_fee ；单子订单交易，payment与主订单的payment一致，
     * 对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。建议使用退款前的实付金额减去退款单中的实际退款金额计算。
     */
    private String payment;

    /*
     * 子订单级订单优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String discountFee;

    /*
     *  手工调整金额.格式为:1.01;单位:元;精确到小数点后两位
     */
    private String adjustFee;

    /*
     * 订单修改时间，目前只有taobao.trade.ordersku.update会返回此字段。
     */
    private Date modified;

    /*
     * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
     */
    private String skuPropertiesName;

    /*
     * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
     */
    private Number refundId;

    /*
     *  是否超卖
     */
    private Boolean isOversold;

    /*
     * 是否是服务订单，是返回true，否返回false。
     */
    private Boolean isServiceOrder;

    /*
     * 子订单的交易结束时间 说明：子订单有单独的结束时间，与主订单的结束时间可能有所不同，在有退款发起的时候或者是主订单分阶段付款的时候，
     * 子订单的结束时间会早于主订单的结束时间，所以开放这个字段便于订单结束状态的判断
     */
    private Date endTime;

    /*
     * 子订单发货时间，当卖家对订单进行了多次发货，子订单的发货时间和主订单的发货时间可能不一样了，
     * 那么就需要以子订单的时间为准。（没有进行多次发货的订单，主订单的发货时间和子订单的发货时间都一样）
     */
    private String consignTime;

    /*
     * 子订单的运送方式（卖家对订单进行多次发货之后，一个主订单下的子订单的运送方式可能不同，用order.shipping_type来区分子订单的运送方式）
     */
    private String shippingType;

    /*
     *  捆绑的子订单号，表示该子订单要和捆绑的子订单一起发货，用于卖家子订单捆绑发货
     */
    private Number bindOid;

    /*
     * 子订单发货的快递公司名称
     */
    private String logisticsCompany;

    /*
     * 子订单所在包裹的运单号
     */
    private String invoiceNo;

    /*
     * 表示订单交易是否含有对应的代销采购单。 如果该订单中存在一个对应的代销采购单，那么该值为true；反之，该值为false。
     */
    private Boolean isDaixiao;

    /*
     * 分摊之后的实付金额
     */
    private String divideOrderFee;

    /*
     * 优惠分摊
     */
    private String partMjzDiscount;

    /*
     *  对应门票有效期的外部id
     */
    private String ticketOuterId;

    /*
     * 门票有效期的key
     */
    private String ticketExpdateKey;

    /*
     * 发货的仓库编码
     */
    private String storeCode;

    /*
     * 子订单是否是www订单
     */
    private Boolean isWww;

    public String getItemMealName() {
        return itemMealName;
    }

    public void setItemMealName(String itemMealName) {
        this.itemMealName = itemMealName;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getOuterIid() {
        return outerIid;
    }

    public void setOuterIid(String outerIid) {
        this.outerIid = outerIid;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public Date getTimeoutActionTime() {
        return timeoutActionTime;
    }

    public void setTimeoutActionTime(Date timeoutActionTime) {
        this.timeoutActionTime = timeoutActionTime;
    }

    public Boolean getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Boolean buyerRate) {
        this.buyerRate = buyerRate;
    }

    public Boolean getSellerRate() {
        return sellerRate;
    }

    public void setSellerRate(Boolean sellerRate) {
        this.sellerRate = sellerRate;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public Number getCid() {
        return cid;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public Number getOid() {
        return oid;
    }

    public void setOid(Number oid) {
        this.oid = oid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIid() {
        return iid;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Number getNumIid() {
        return numIid;
    }

    public void setNumIid(Number numIid) {
        this.numIid = numIid;
    }

    public Number getItemMealId() {
        return itemMealId;
    }

    public void setItemMealId(Number itemMealId) {
        this.itemMealId = itemMealId;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public Number getNum() {
        return num;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public String getOuterSkuId() {
        return outerSkuId;
    }

    public void setOuterSkuId(String outerSkuId) {
        this.outerSkuId = outerSkuId;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
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

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public String getSkuPropertiesName() {
        return skuPropertiesName;
    }

    public void setSkuPropertiesName(String skuPropertiesName) {
        this.skuPropertiesName = skuPropertiesName;
    }

    public Number getRefundId() {
        return refundId;
    }

    public void setRefundId(Number refundId) {
        this.refundId = refundId;
    }

    public Boolean getIsOversold() {
        return isOversold;
    }

    public void setIsOversold(Boolean isOversold) {
        this.isOversold = isOversold;
    }

    public Boolean getIsServiceOrder() {
        return isServiceOrder;
    }

    public void setIsServiceOrder(Boolean isServiceOrder) {
        this.isServiceOrder = isServiceOrder;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public Number getBindOid() {
        return bindOid;
    }

    public void setBindOid(Number bindOid) {
        this.bindOid = bindOid;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Boolean getIsDaixiao() {
        return isDaixiao;
    }

    public void setIsDaixiao(Boolean isDaixiao) {
        this.isDaixiao = isDaixiao;
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

    public String getTicketOuterId() {
        return ticketOuterId;
    }

    public void setTicketOuterId(String ticketOuterId) {
        this.ticketOuterId = ticketOuterId;
    }

    public String getTicketExpdateKey() {
        return ticketExpdateKey;
    }

    public void setTicketExpdateKey(String ticketExpdateKey) {
        this.ticketExpdateKey = ticketExpdateKey;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Boolean getIsWww() {
        return isWww;
    }

    public void setIsWww(Boolean isWww) {
        this.isWww = isWww;
    }

}
