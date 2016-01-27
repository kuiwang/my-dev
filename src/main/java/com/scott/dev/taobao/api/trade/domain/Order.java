package com.scott.dev.taobao.api.trade.domain;

import java.util.Date;

/*
 * 订单结构
 */
public class Order {

    /*
     *  手工调整金额.格式为:1.01;单位:元;精确到小数点后两位
     */
    private String adjustFee;

    /*
     *  捆绑的子订单号，表示该子订单要和捆绑的子订单一起发货，用于卖家子订单捆绑发货
     */
    private Number bindOid;

    /*
     * 买家昵称
     */
    private String buyerNick;

    /*
     * 买家是否已评价。可选值：true(已评价)，false(未评价)
     */
    private Boolean buyerRate;

    /*
     * 交易商品对应的类目ID
     */
    private Number cid;

    /*
     * 子订单发货时间，当卖家对订单进行了多次发货，子订单的发货时间和主订单的发货时间可能不一样了，
     * 那么就需要以子订单的时间为准。（没有进行多次发货的订单，主订单的发货时间和子订单的发货时间都一样）
     */
    private String consignTime;

    /*
     * 子订单级订单优惠金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String discountFee;

    /*
     * 分摊之后的实付金额
     */
    private String divideOrderFee;

    /*
     * 子订单的交易结束时间 说明：子订单有单独的结束时间，与主订单的结束时间可能有所不同，在有退款发起的时候或者是主订单分阶段付款的时候，
     * 子订单的结束时间会早于主订单的结束时间，所以开放这个字段便于订单结束状态的判断
     */
    private Date endTime;

    /*
     * 商品的字符串编号(注意：iid近期即将废弃，请用num_iid参数)
     */
    private String iid;

    /*
     * 子订单所在包裹的运单号
     */
    private String invoiceNo;

    /*
     * 表示订单交易是否含有对应的代销采购单。 如果该订单中存在一个对应的代销采购单，那么该值为true；反之，该值为false。
     */
    private Boolean isDaixiao;

    /*
     *  是否超卖
     */
    private Boolean isOversold;

    /*
     * 是否是服务订单，是返回true，否返回false。
     */
    private Boolean isServiceOrder;

    /*
     * 子订单是否是www订单
     */
    private Boolean isWww;

    /*
     * 套餐ID
     */
    private Number itemMealId;

    /*
     * 套餐的值。如：M8原装电池:便携支架:M8专用座充:莫凡保护袋
     */
    private String itemMealName;

    /*
     * 子订单发货的快递公司名称
     */
    private String logisticsCompany;

    /*
     * 订单修改时间，目前只有taobao.trade.ordersku.update会返回此字段。
     */
    private Date modified;

    /*
     * 购买数量。取值范围:大于零的整数
     */
    private Number num;

    /*
     * 商品数字ID
     */
    private Number numIid;

    /*
     * 子订单编号
     */
    private Number oid;

    /*
     * 子订单来源,如jhs(聚划算)、taobao(淘宝)、wap(无线)
     */
    private String orderFrom;

    /*
     * 商家外部编码(可与商家外部系统对接)。外部商家自己定义的商品Item的id，可以通过taobao.items.custom.get获取商品的Item的信息
     */
    private String outerIid;

    /*
     * 外部网店自己定义的Sku编号
     */
    private String outerSkuId;

    /*
     * 优惠分摊
     */
    private String partMjzDiscount;

    /*
     * 子订单实付金额。精确到2位小数，单位:元。如:200.07，表示:200元7分。对于多子订单的交易，
     * 计算公式如下：payment = price * num + adjust_fee - discount_fee ；单子订单交易，payment与主订单的payment一致，
     * 对于退款成功的子订单，由于主订单的优惠分摊金额，会造成该字段可能不为0.00元。建议使用退款前的实付金额减去退款单中的实际退款金额计算。
     */
    private String payment;

    /*
     * 商品图片的绝对路径
     */
    private String picPath;

    /*
     *  商品价格。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String price;

    /*
     * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
     */
    private Number refundId;

    /*
     * 退款状态。退款状态。可选值 WAIT_SELLER_AGREE(买家已经申请退款，等待卖家同意) WAIT_BUYER_RETURN_GOODS(卖家已经同意退款，等待买家退货) 
     * WAIT_SELLER_CONFIRM_GOODS(买家已经退货，等待卖家确认收货) SELLER_REFUSE_BUYER(卖家拒绝退款) 
     * CLOSED(退款关闭) SUCCESS(退款成功)
     */
    private String refundStatus;

    /*
     * 卖家昵称
     */
    private String sellerNick;

    /*
     * 卖家是否已评价。可选值：true(已评价)，false(未评价)
     */
    private Boolean sellerRate;

    /*
     * 卖家类型，可选值为：B（商城商家），C（普通卖家）
     */
    private String sellerType;

    /*
     * 子订单的运送方式（卖家对订单进行多次发货之后，一个主订单下的子订单的运送方式可能不同，用order.shipping_type来区分子订单的运送方式）
     */
    private String shippingType;

    /*
     * 商品的最小库存单位Sku的id.可以通过taobao.item.sku.get获取详细的Sku信息
     */
    private String skuId;

    /*
     * SKU的值。如：机身颜色:黑色;手机套餐:官方标配
     */
    private String skuPropertiesName;

    /*
     * 订单快照详细信息
     */
    private String snapshot;

    /*
     * 订单快照URL
     */
    private String snapshotUrl;

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
     * 发货的仓库编码
     */
    private String storeCode;

    /*
     * 门票有效期的key
     */
    private String ticketExpdateKey;

    /*
     *  对应门票有效期的外部id
     */
    private String ticketOuterId;

    /*
     * 订单超时到期时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date timeoutActionTime;

    /*
     * 商品标题
     */
    private String title;

    /*
     * 应付金额（商品价格 * 商品数量 + 手工调整金额 - 子订单级订单优惠金额）。精确到2位小数;单位:元。如:200.07，表示:200元7分
     */
    private String totalFee;

    public String getAdjustFee() {
        return adjustFee;
    }

    public Number getBindOid() {
        return bindOid;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public Boolean getBuyerRate() {
        return buyerRate;
    }

    public Number getCid() {
        return cid;
    }

    public String getConsignTime() {
        return consignTime;
    }

    public String getDiscountFee() {
        return discountFee;
    }

    public String getDivideOrderFee() {
        return divideOrderFee;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getIid() {
        return iid;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public Boolean getIsDaixiao() {
        return isDaixiao;
    }

    public Boolean getIsOversold() {
        return isOversold;
    }

    public Boolean getIsServiceOrder() {
        return isServiceOrder;
    }

    public Boolean getIsWww() {
        return isWww;
    }

    public Number getItemMealId() {
        return itemMealId;
    }

    public String getItemMealName() {
        return itemMealName;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public Date getModified() {
        return modified;
    }

    public Number getNum() {
        return num;
    }

    public Number getNumIid() {
        return numIid;
    }

    public Number getOid() {
        return oid;
    }

    public String getOrderFrom() {
        return orderFrom;
    }

    public String getOuterIid() {
        return outerIid;
    }

    public String getOuterSkuId() {
        return outerSkuId;
    }

    public String getPartMjzDiscount() {
        return partMjzDiscount;
    }

    public String getPayment() {
        return payment;
    }

    public String getPicPath() {
        return picPath;
    }

    public String getPrice() {
        return price;
    }

    public Number getRefundId() {
        return refundId;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public Boolean getSellerRate() {
        return sellerRate;
    }

    public String getSellerType() {
        return sellerType;
    }

    public String getShippingType() {
        return shippingType;
    }

    public String getSkuId() {
        return skuId;
    }

    public String getSkuPropertiesName() {
        return skuPropertiesName;
    }

    public String getSnapshot() {
        return snapshot;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public String getStatus() {
        return status;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public String getTicketExpdateKey() {
        return ticketExpdateKey;
    }

    public String getTicketOuterId() {
        return ticketOuterId;
    }

    public Date getTimeoutActionTime() {
        return timeoutActionTime;
    }

    public String getTitle() {
        return title;
    }

    public String getTotalFee() {
        return totalFee;
    }

    public void setAdjustFee(String adjustFee) {
        this.adjustFee = adjustFee;
    }

    public void setBindOid(Number bindOid) {
        this.bindOid = bindOid;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setBuyerRate(Boolean buyerRate) {
        this.buyerRate = buyerRate;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setConsignTime(String consignTime) {
        this.consignTime = consignTime;
    }

    public void setDiscountFee(String discountFee) {
        this.discountFee = discountFee;
    }

    public void setDivideOrderFee(String divideOrderFee) {
        this.divideOrderFee = divideOrderFee;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setIid(String iid) {
        this.iid = iid;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public void setIsDaixiao(Boolean isDaixiao) {
        this.isDaixiao = isDaixiao;
    }

    public void setIsOversold(Boolean isOversold) {
        this.isOversold = isOversold;
    }

    public void setIsServiceOrder(Boolean isServiceOrder) {
        this.isServiceOrder = isServiceOrder;
    }

    public void setIsWww(Boolean isWww) {
        this.isWww = isWww;
    }

    public void setItemMealId(Number itemMealId) {
        this.itemMealId = itemMealId;
    }

    public void setItemMealName(String itemMealName) {
        this.itemMealName = itemMealName;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setNum(Number num) {
        this.num = num;
    }

    public void setNumIid(Number numIid) {
        this.numIid = numIid;
    }

    public void setOid(Number oid) {
        this.oid = oid;
    }

    public void setOrderFrom(String orderFrom) {
        this.orderFrom = orderFrom;
    }

    public void setOuterIid(String outerIid) {
        this.outerIid = outerIid;
    }

    public void setOuterSkuId(String outerSkuId) {
        this.outerSkuId = outerSkuId;
    }

    public void setPartMjzDiscount(String partMjzDiscount) {
        this.partMjzDiscount = partMjzDiscount;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setRefundId(Number refundId) {
        this.refundId = refundId;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setSellerRate(Boolean sellerRate) {
        this.sellerRate = sellerRate;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setSkuPropertiesName(String skuPropertiesName) {
        this.skuPropertiesName = skuPropertiesName;
    }

    public void setSnapshot(String snapshot) {
        this.snapshot = snapshot;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setTicketExpdateKey(String ticketExpdateKey) {
        this.ticketExpdateKey = ticketExpdateKey;
    }

    public void setTicketOuterId(String ticketOuterId) {
        this.ticketOuterId = ticketOuterId;
    }

    public void setTimeoutActionTime(Date timeoutActionTime) {
        this.timeoutActionTime = timeoutActionTime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTotalFee(String totalFee) {
        this.totalFee = totalFee;
    }

}
