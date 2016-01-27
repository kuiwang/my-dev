package com.scott.dev.taobao.api.hotel.domain;

import java.util.Date;
import java.util.List;

/**
 * HotelOrder（酒店订单）结构。各字段详细说明可参考接口定义。注意：trade_status，refund_status，
 * logistics_status不是严格准确的，请以交易API，物流API等得到的订单状态、物流状态为准确依据。
 */
public class HotelOrder {

    /**
     * 支付宝交易号，22位字符
     */
    private String alipayTradeNo;

    /**
     * 买家最早到达时间
     */
    private Date arriveEarly;

    /**
     * 买家最晚到达时间
     */
    private Date arriveLate;

    /**
     * 买家淘宝账号
     */
    private String buyerNick;

    /**
     * 入住时间
     */
    private Date checkinDate;

    /**
     * 离店时间
     */
    private Date checkoutDate;

    /**
     * 备注，存储关于礼品的信息，比如杜蕾斯
     */
    private String comment;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactPhone;

    /**
     * 备用联系人电话
     */
    private String contactPhoneBak;

    /**
     * 订单创建时间
     */
    private Date created;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 商品id
     */
    private Long gid;

    /**
     * 入住人信息
     */
    private List<OrderGuest> guests;

    /**
     * 酒店id
     */
    private Long hid;

    /**
     * 物流状态。STATUS_UNCONSIGNED：未发货 -> 等待卖家发货。STATUS_CONSIGNED：已发货 ->
     * 等待买家确认收货。STATUS_DELIVERED：已收货 -> 交易成功。STATUS_REVERT：已经退货 ->
     * 交易失败。STATUS_DELIVERED_PART：部分发货 -> 交易成功。STATUS_NO_OUT_ORDER：还未创建物流订单
     */
    private String logisticsStatus;

    /**
     * 买家留言
     */
    private String message;

    /**
     * 订单修改时间
     */
    private Date modified;

    /**
     * 天数
     */
    private Long nights;

    /**
     * 酒店订单id
     */
    private Long oid;

    /**
     * 合作方订单号,最长250个字符
     */
    private String outOid;

    /**
     * 实付款（分）
     */
    private Long payment;

    /**
     * 付款时间
     */
    private Date payTime;

    /**
     * 下单时每间夜的价格（分）
     */
    private List<Long> prices;

    /**
     * 退款状态。STATUS_WAIT_SELLER_AGREE：买家已经申请退款，等待卖家同意。
     * STATUS_WAIT_BUYER_RETURN_GOODS
     * ：卖家已经同意退款，等待买家退货。STATUS_WAIT_SELLER_CONFIRM_GOODS
     * ：买家已经退货，等待卖家确认收货。STATUS_CLOSED
     * ：退款关闭。STATUS_SUCCESS：退款成功->买家取消预定。STATUS_SELLER_REFUSE_BUYER
     * ：卖家拒绝退款。STATUS_WAIT_OUT_PAY_SYSTEM_REFUND
     * ：等待外部交易系统退款。STATUS_NO_REFUND
     * ：没有申请退款。STATUS_ACTIVE_REFUND：有活动退款。STATUS_END_REFUND：退款结束。
     */
    private String refundStatus;

    /**
     * 房型id
     */
    private Long rid;

    /**
     * 房间数
     */
    private Long roomNumber;

    /**
     * 卖家淘宝账号
     */
    private String sellerNick;

    /**
     * 淘宝订单id
     */
    private Long tid;

    /**
     * 总房价（分）
     */
    private Long totalRoomPrice;

    /**
     * 交易状态。WAIT_BUYER_PAY：未冻结/未付款 -> 等待买家付款。WAIT_SELLER_SEND_GOODS：已冻结/已付款
     * -> 等待卖家发货 -> 等待卖家确认。TRADE_CLOSED：已退款 -> 交易关闭。TRADE_FINISHED：已转交易 ->
     * 交易成功。TRADE_NO_CREATE_PAY：没有创建支付宝交易。TRADE_CLOSED_BY_TAOBAO：交易被淘宝关闭->
     * 卖家关闭交易或卖家核实未入住。TRADE_SUCCESS：预定成功（等待卖家核实入住）
     */
    private String tradeStatus;

    /**
     * 支付类型。A：全额支付。B：灵活支付－手续费。C：灵活支付－订金。D：灵活支付－手续费/间夜
     */
    private String type;

    public String getAlipayTradeNo() {
        return this.alipayTradeNo;
    }

    public Date getArriveEarly() {
        return this.arriveEarly;
    }

    public Date getArriveLate() {
        return this.arriveLate;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Date getCheckinDate() {
        return this.checkinDate;
    }

    public Date getCheckoutDate() {
        return this.checkoutDate;
    }

    public String getComment() {
        return this.comment;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactPhone() {
        return this.contactPhone;
    }

    public String getContactPhoneBak() {
        return this.contactPhoneBak;
    }

    public Date getCreated() {
        return this.created;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Long getGid() {
        return this.gid;
    }

    public List<OrderGuest> getGuests() {
        return this.guests;
    }

    public Long getHid() {
        return this.hid;
    }

    public String getLogisticsStatus() {
        return this.logisticsStatus;
    }

    public String getMessage() {
        return this.message;
    }

    public Date getModified() {
        return this.modified;
    }

    public Long getNights() {
        return this.nights;
    }

    public Long getOid() {
        return this.oid;
    }

    public String getOutOid() {
        return this.outOid;
    }

    public Long getPayment() {
        return this.payment;
    }

    public Date getPayTime() {
        return this.payTime;
    }

    public List<Long> getPrices() {
        return this.prices;
    }

    public String getRefundStatus() {
        return this.refundStatus;
    }

    public Long getRid() {
        return this.rid;
    }

    public Long getRoomNumber() {
        return this.roomNumber;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public Long getTid() {
        return this.tid;
    }

    public Long getTotalRoomPrice() {
        return this.totalRoomPrice;
    }

    public String getTradeStatus() {
        return this.tradeStatus;
    }

    public String getType() {
        return this.type;
    }

    public void setAlipayTradeNo(String alipayTradeNo) {
        this.alipayTradeNo = alipayTradeNo;
    }

    public void setArriveEarly(Date arriveEarly) {
        this.arriveEarly = arriveEarly;
    }

    public void setArriveLate(Date arriveLate) {
        this.arriveLate = arriveLate;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCheckinDate(Date checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public void setContactPhoneBak(String contactPhoneBak) {
        this.contactPhoneBak = contactPhoneBak;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public void setGuests(List<OrderGuest> guests) {
        this.guests = guests;
    }

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setLogisticsStatus(String logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setNights(Long nights) {
        this.nights = nights;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public void setOutOid(String outOid) {
        this.outOid = outOid;
    }

    public void setPayment(Long payment) {
        this.payment = payment;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public void setPrices(List<Long> prices) {
        this.prices = prices;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setRid(Long rid) {
        this.rid = rid;
    }

    public void setRoomNumber(Long roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setTid(Long tid) {
        this.tid = tid;
    }

    public void setTotalRoomPrice(Long totalRoomPrice) {
        this.totalRoomPrice = totalRoomPrice;
    }

    public void setTradeStatus(String tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public void setType(String type) {
        this.type = type;
    }

}
