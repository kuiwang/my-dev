package com.scott.dev.taobao.api.fenxiao.domain;

import java.util.Date;

import com.scott.dev.taobao.api.Price;

/*
 * 采购单及子采购单信息
 */
public class PurchaseOrder {

    /*
     * 支付宝交易号。
     */
    private String alipayNo;

    /*
     * 买家nick，供应商查询不会返回买家昵称，分销商查询才会返回。
     */
    private String buyerNick;

    /*
     * 买家支付给分销商的总金额。注意买家购买的商品可能不是全部来自同一供货商，请同时参考子单上的相关金额。
     * （精确到2位小数;单位:元。如:200.07，表示:200元7分）
     */
    private Price buyerPayment;

    /*
     * 加密后的买家淘宝ID，长度为32位
     */
    private String buyerTaobaoId;

    /*
     * 物流发货时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date consignTime;

    /*
     * 采购单创建时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 分销商来源网站（taobao）。
     */
    private String distributorFrom;

    /*
     * 分销商实付金额。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    private Price distributorPayment;

    /*
     * 分销商在来源网站的帐号名。
     */
    private String distributorUsername;

    /*
     * 交易结束时间
     */
    private Date endTime;

    /*
     * 主订单属性信息，key-value形式： orderNovice ：订单发票抬头； orderNoviceContent ：代表发票明细
     */
    private Feature[] features;

    /*
     * 分销流水号，分销平台产生的主键
     */
    private Number fenxiaoId;

    /*
     * 供应商交易ID 非采购单ID，如果改发货状态 是需要该ID，ID在用户未付款前为0，付款后有具体值（发货时使用该ID）
     */
    private Number id;

    /*
     * 自定义key
     */
    private String[] isvCustomKey;

    /*
     * 自定义值
     */
    private String[] isvCustomValue;

    /*
     * 物流公司
     */
    private String logisticsCompanyName;

    /*
     * 运单号
     */
    private String logisticsId;

    /*
     * 采购单留言。（代销模式下信息包括买家留言和分销商留言）
     */
    private String memo;

    /*
     * 交易修改时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date modified;

    /*
     * 采购单留言列表
     */
    private OrderMessage[] orderMessages;

    /*
     * 付款时间。格式:yyyy-MM-dd HH:mm:ss
     */
    private Date payTime;

    /*
     * 支付方式：ALIPAY_SURETY（支付宝担保交易）、ALIPAY_CHAIN（分账交易）、TRANSFER（线下转账）、
     * PREPAY（预存款）、IMMEDIATELY（即时到账）、CASHGOODS（先款后货）
     */
    private String payType;

    /*
     * 采购单邮费。(精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    private Price postFee;

    /*
     * 买家详细的信息。
     */
    private Receiver receiver;

    /*
     * 配送方式，FAST(快速)、EMS、ORDINARY(平邮)、SELLER(卖家包邮)
     */
    private String shipping;

    /*
     * 订单快照URL
     */
    private String snapshotUrl;

    /*
     * 采购单交易状态。可选值：
    WAIT_BUYER_PAY(等待付款)
    WAIT_SELLER_SEND_GOODS(已付款，待发货）
    WAIT_BUYER_CONFIRM_GOODS(已付款，已发货)
    TRADE_FINISHED(交易成功)
    TRADE_CLOSED(交易关闭)
    WAIT_BUYER_CONFIRM_GOODS_ACOUNTED(已付款（已分账），已发货。只对代销分账支持)
    PAY_ACOUNTED_GOODS_CONFIRM （已分账发货成功）
    PAY_WAIT_ACOUNT_GOODS_CONFIRM（已付款，确认收货）
     */
    private String status;

    /*
     * 子订单的详细信息列表。
     */
    private SubPurchaseOrder[] subPurchaseOrders;

    /*
     * 返回供应商备注旗帜 vlaue在1-5之间。非1-5之间，都采用1作为默认。 1:红色 2:黄色 3:绿色 4:蓝色 5:粉红色
     */
    private Number supplierFlag;

    /*
     * 供应商来源网站, values: taobao, alibaba
     */
    private String supplierFrom;

    /*
     * 供应商备注
     */
    private String supplierMemo;

    /*
     * 供应商在来源网站的帐号名。
     */
    private String supplierUsername;

    /*
     * 主订单ID （经销不显示）
     */
    private Number tcOrderId;

    /*
     * 采购单总额（不含邮费,精确到2位小数;单位:元。如:200.07，表示:200元7分 )
     */
    private Price totalFee;

    /*
     * 分销方式：AGENT（代销）、DEALER（经销）
     */
    private String tradeType;

    public String getAlipayNo() {
        return alipayNo;
    }

    public String getBuyerNick() {
        return buyerNick;
    }

    public Price getBuyerPayment() {
        return buyerPayment;
    }

    public String getBuyerTaobaoId() {
        return buyerTaobaoId;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public Date getCreated() {
        return created;
    }

    public String getDistributorFrom() {
        return distributorFrom;
    }

    public Price getDistributorPayment() {
        return distributorPayment;
    }

    public String getDistributorUsername() {
        return distributorUsername;
    }

    public Date getEndTime() {
        return endTime;
    }

    public Feature[] getFeatures() {
        return features;
    }

    public Number getFenxiaoId() {
        return fenxiaoId;
    }

    public Number getId() {
        return id;
    }

    public String[] getIsvCustomKey() {
        return isvCustomKey;
    }

    public String[] getIsvCustomValue() {
        return isvCustomValue;
    }

    public String getLogisticsCompanyName() {
        return logisticsCompanyName;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public String getMemo() {
        return memo;
    }

    public Date getModified() {
        return modified;
    }

    public OrderMessage[] getOrderMessages() {
        return orderMessages;
    }

    public Date getPayTime() {
        return payTime;
    }

    public String getPayType() {
        return payType;
    }

    public Price getPostFee() {
        return postFee;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public String getShipping() {
        return shipping;
    }

    public String getSnapshotUrl() {
        return snapshotUrl;
    }

    public String getStatus() {
        return status;
    }

    public SubPurchaseOrder[] getSubPurchaseOrders() {
        return subPurchaseOrders;
    }

    public Number getSupplierFlag() {
        return supplierFlag;
    }

    public String getSupplierFrom() {
        return supplierFrom;
    }

    public String getSupplierMemo() {
        return supplierMemo;
    }

    public String getSupplierUsername() {
        return supplierUsername;
    }

    public Number getTcOrderId() {
        return tcOrderId;
    }

    public Price getTotalFee() {
        return totalFee;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setAlipayNo(String alipayNo) {
        this.alipayNo = alipayNo;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setBuyerPayment(Price buyerPayment) {
        this.buyerPayment = buyerPayment;
    }

    public void setBuyerTaobaoId(String buyerTaobaoId) {
        this.buyerTaobaoId = buyerTaobaoId;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDistributorFrom(String distributorFrom) {
        this.distributorFrom = distributorFrom;
    }

    public void setDistributorPayment(Price distributorPayment) {
        this.distributorPayment = distributorPayment;
    }

    public void setDistributorUsername(String distributorUsername) {
        this.distributorUsername = distributorUsername;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setFeatures(Feature[] features) {
        this.features = features;
    }

    public void setFenxiaoId(Number fenxiaoId) {
        this.fenxiaoId = fenxiaoId;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public void setIsvCustomKey(String[] isvCustomKey) {
        this.isvCustomKey = isvCustomKey;
    }

    public void setIsvCustomValue(String[] isvCustomValue) {
        this.isvCustomValue = isvCustomValue;
    }

    public void setLogisticsCompanyName(String logisticsCompanyName) {
        this.logisticsCompanyName = logisticsCompanyName;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setOrderMessages(OrderMessage[] orderMessages) {
        this.orderMessages = orderMessages;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public void setPostFee(Price postFee) {
        this.postFee = postFee;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public void setSnapshotUrl(String snapshotUrl) {
        this.snapshotUrl = snapshotUrl;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubPurchaseOrders(SubPurchaseOrder[] subPurchaseOrders) {
        this.subPurchaseOrders = subPurchaseOrders;
    }

    public void setSupplierFlag(Number supplierFlag) {
        this.supplierFlag = supplierFlag;
    }

    public void setSupplierFrom(String supplierFrom) {
        this.supplierFrom = supplierFrom;
    }

    public void setSupplierMemo(String supplierMemo) {
        this.supplierMemo = supplierMemo;
    }

    public void setSupplierUsername(String supplierUsername) {
        this.supplierUsername = supplierUsername;
    }

    public void setTcOrderId(Number tcOrderId) {
        this.tcOrderId = tcOrderId;
    }

    public void setTotalFee(Price totalFee) {
        this.totalFee = totalFee;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

}
