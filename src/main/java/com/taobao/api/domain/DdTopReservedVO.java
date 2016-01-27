package com.taobao.api.domain;

import java.util.Date;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 淘点点预定订单列表对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class DdTopReservedVO extends TaobaoObject {

    private static final long serialVersionUID = 4414281695857116483L;

    /**
     * 桌台类型：1.散座|2.包厢
     */
    @ApiField("auction_position")
    private Long auctionPosition;

    /**
     * 桌子容纳的最大人数
     */
    @ApiField("auction_serve_max")
    private Long auctionServeMax;

    /**
     * 桌位容纳的最小人数
     */
    @ApiField("auction_serve_min")
    private Long auctionServeMin;

    /**
     * 买家昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 核销时间
     */
    @ApiField("check_time")
    private Date checkTime;

    /**
     * 城市编码
     */
    @ApiField("city")
    private Long city;

    /**
     * 下单时间
     */
    @ApiField("create_time")
    private Date createTime;

    /**
     * 订金，以分为单位
     */
    @ApiField("deposit")
    private Long deposit;

    /**
     * 淘点点预定单id
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否打印，true表示已经打印
     */
    @ApiField("is_print")
    private Boolean isPrint;

    /**
     * 点菜单订单id
     */
    @ApiField("menu_order_id")
    private String menuOrderId;

    /**
     * 当天的预定编号
     */
    @ApiField("num")
    private Long num;

    /**
     * 预定金付款时间
     */
    @ApiField("paid_time")
    private Date paidTime;

    /**
     * 预定人数
     */
    @ApiField("people_count")
    private Long peopleCount;

    /**
     * 退款截止时间
     */
    @ApiField("refund_deadline")
    private Date refundDeadline;

    /**
     * 预定时间
     */
    @ApiField("reserve_time")
    private Date reserveTime;

    /**
     * 卖家标注
     */
    @ApiField("seller_mark")
    private Long sellerMark;

    /**
     * 卖家备注
     */
    @ApiField("seller_memo")
    private String sellerMemo;

    /**
     * 预订单状态:1-新建,101-结账订单建立,2-用户已付款，12-生成现金券，21-现金券核销，22-付款超时，20-订单过期，301-
     * 退款，500-创建订单失败
     */
    @ApiField("status")
    private Long status;

    /**
     * 淘点点商户编码
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 商户名称
     */
    @ApiField("store_name")
    private String storeName;

    /**
     * 淘宝订单号
     */
    @ApiField("taobao_order_id")
    private String taobaoOrderId;

    /**
     * 买家备注
     */
    @ApiField("user_memo")
    private String userMemo;

    /**
     * 联系人称呼
     */
    @ApiField("user_name")
    private String userName;

    /**
     * 用户电话
     */
    @ApiField("user_phone")
    private String userPhone;

    public Long getAuctionPosition() {
        return this.auctionPosition;
    }

    public Long getAuctionServeMax() {
        return this.auctionServeMax;
    }

    public Long getAuctionServeMin() {
        return this.auctionServeMin;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public Date getCheckTime() {
        return this.checkTime;
    }

    public Long getCity() {
        return this.city;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getDeposit() {
        return this.deposit;
    }

    public Long getId() {
        return this.id;
    }

    public Boolean getIsPrint() {
        return this.isPrint;
    }

    public String getMenuOrderId() {
        return this.menuOrderId;
    }

    public Long getNum() {
        return this.num;
    }

    public Date getPaidTime() {
        return this.paidTime;
    }

    public Long getPeopleCount() {
        return this.peopleCount;
    }

    public Date getRefundDeadline() {
        return this.refundDeadline;
    }

    public Date getReserveTime() {
        return this.reserveTime;
    }

    public Long getSellerMark() {
        return this.sellerMark;
    }

    public String getSellerMemo() {
        return this.sellerMemo;
    }

    public Long getStatus() {
        return this.status;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getTaobaoOrderId() {
        return this.taobaoOrderId;
    }

    public String getUserMemo() {
        return this.userMemo;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserPhone() {
        return this.userPhone;
    }

    public void setAuctionPosition(Long auctionPosition) {
        this.auctionPosition = auctionPosition;
    }

    public void setAuctionServeMax(Long auctionServeMax) {
        this.auctionServeMax = auctionServeMax;
    }

    public void setAuctionServeMin(Long auctionServeMin) {
        this.auctionServeMin = auctionServeMin;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setDeposit(Long deposit) {
        this.deposit = deposit;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsPrint(Boolean isPrint) {
        this.isPrint = isPrint;
    }

    public void setMenuOrderId(String menuOrderId) {
        this.menuOrderId = menuOrderId;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public void setPaidTime(Date paidTime) {
        this.paidTime = paidTime;
    }

    public void setPeopleCount(Long peopleCount) {
        this.peopleCount = peopleCount;
    }

    public void setRefundDeadline(Date refundDeadline) {
        this.refundDeadline = refundDeadline;
    }

    public void setReserveTime(Date reserveTime) {
        this.reserveTime = reserveTime;
    }

    public void setSellerMark(Long sellerMark) {
        this.sellerMark = sellerMark;
    }

    public void setSellerMemo(String sellerMemo) {
        this.sellerMemo = sellerMemo;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setTaobaoOrderId(String taobaoOrderId) {
        this.taobaoOrderId = taobaoOrderId;
    }

    public void setUserMemo(String userMemo) {
        this.userMemo = userMemo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

}
