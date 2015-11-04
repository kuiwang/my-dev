package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 外卖订单对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class TakeoutThirdOrder extends TaobaoObject {

    private static final long serialVersionUID = 8647944373266247395L;

    /**
     * 送餐地址
     */
    @ApiField("address")
    private String address;

    /**
     * 代送商列表
     */
    @ApiListField("agent_list")
    @ApiField("delivery_agent_v_o")
    private List<DeliveryAgentVO> agentList;

    /**
     * 支付宝流水号
     */
    @ApiField("alipay_stream_id")
    private String alipayStreamId;

    /**
     * 买家在该订单所在的店铺的历史订单数量
     */
    @ApiField("buyer_history_order_count")
    private Long buyerHistoryOrderCount;

    /**
     * 买家的用户昵称
     */
    @ApiField("buyer_nick")
    private String buyerNick;

    /**
     * 创建时间
     */
    @ApiField("create_time")
    private String createTime;

    /**
     * 配送费
     */
    @ApiField("delivery_pay")
    private String deliveryPay;

    /**
     * 距离单位为米
     */
    @ApiField("distance")
    private Long distance;

    /**
     * 送达时间要求_结束
     */
    @ApiField("end_deliverytime")
    private String endDeliverytime;

    /**
     * 距离倒计时结束的秒数
     */
    @ApiField("end_seconds")
    private Long endSeconds;

    /**
     * 用户下单方式(PC/APP)
     */
    @ApiField("from")
    private Long from;

    /**
     * 下单餐品列表
     */
    @ApiListField("goods_list")
    @ApiField("order_goods")
    private List<OrderGoods> goodsList;

    /**
     * 订单号
     */
    @ApiField("id")
    private Long id;

    /**
     * 订单修改时间
     */
    @ApiField("modify_time")
    private String modifyTime;

    /**
     * 用户下单时的备注信息
     */
    @ApiField("note")
    private String note;

    /**
     * 订单状态
     */
    @ApiField("order_status")
    private Long orderStatus;

    /**
     * 订单状态文案
     */
    @ApiField("order_status_info")
    private String orderStatusInfo;

    /**
     * 0 支付宝订单 8 货到付款
     */
    @ApiField("order_type")
    private Long orderType;

    /**
     * 买家支付宝账号
     */
    @ApiField("pay_account")
    private String payAccount;

    /**
     * 付款时间
     */
    @ApiField("pay_time")
    private String payTime;

    /**
     * 就餐人数
     */
    @ApiField("people_number")
    private Long peopleNumber;

    /**
     * 优惠列表
     */
    @ApiListField("promotion_list")
    @ApiField("promotion_o")
    private List<PromotionO> promotionList;

    /**
     * 送达时间要求_起始
     */
    @ApiField("start_deliverytime")
    private String startDeliverytime;

    /**
     * 店铺联系电话
     */
    @ApiField("store_contactphone")
    private String storeContactphone;

    /**
     * 分店ID
     */
    @ApiField("store_id")
    private Long storeId;

    /**
     * 店铺名称
     */
    @ApiField("store_name")
    private String storeName;

    /**
     * 订单超时的时间
     */
    @ApiField("time_out_stamp")
    private String timeOutStamp;

    /**
     * 总支付金额
     */
    @ApiField("total_pay")
    private String totalPay;

    /**
     * 用户地址对象
     */
    @ApiField("user_address")
    private UserThirdAddress userAddress;

    /**
     * 买家ID
     */
    @ApiField("user_id")
    private Long userId;

    /**
     * X坐标
     */
    @ApiField("x")
    private String x;

    /**
     * y坐标
     */
    @ApiField("y")
    private String y;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<DeliveryAgentVO> getAgentList() {
        return this.agentList;
    }

    public void setAgentList(List<DeliveryAgentVO> agentList) {
        this.agentList = agentList;
    }

    public String getAlipayStreamId() {
        return this.alipayStreamId;
    }

    public void setAlipayStreamId(String alipayStreamId) {
        this.alipayStreamId = alipayStreamId;
    }

    public Long getBuyerHistoryOrderCount() {
        return this.buyerHistoryOrderCount;
    }

    public void setBuyerHistoryOrderCount(Long buyerHistoryOrderCount) {
        this.buyerHistoryOrderCount = buyerHistoryOrderCount;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDeliveryPay() {
        return this.deliveryPay;
    }

    public void setDeliveryPay(String deliveryPay) {
        this.deliveryPay = deliveryPay;
    }

    public Long getDistance() {
        return this.distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public String getEndDeliverytime() {
        return this.endDeliverytime;
    }

    public void setEndDeliverytime(String endDeliverytime) {
        this.endDeliverytime = endDeliverytime;
    }

    public Long getEndSeconds() {
        return this.endSeconds;
    }

    public void setEndSeconds(Long endSeconds) {
        this.endSeconds = endSeconds;
    }

    public Long getFrom() {
        return this.from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public List<OrderGoods> getGoodsList() {
        return this.goodsList;
    }

    public void setGoodsList(List<OrderGoods> goodsList) {
        this.goodsList = goodsList;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Long getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(Long orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderStatusInfo() {
        return this.orderStatusInfo;
    }

    public void setOrderStatusInfo(String orderStatusInfo) {
        this.orderStatusInfo = orderStatusInfo;
    }

    public Long getOrderType() {
        return this.orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public String getPayAccount() {
        return this.payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayTime() {
        return this.payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Long getPeopleNumber() {
        return this.peopleNumber;
    }

    public void setPeopleNumber(Long peopleNumber) {
        this.peopleNumber = peopleNumber;
    }

    public List<PromotionO> getPromotionList() {
        return this.promotionList;
    }

    public void setPromotionList(List<PromotionO> promotionList) {
        this.promotionList = promotionList;
    }

    public String getStartDeliverytime() {
        return this.startDeliverytime;
    }

    public void setStartDeliverytime(String startDeliverytime) {
        this.startDeliverytime = startDeliverytime;
    }

    public String getStoreContactphone() {
        return this.storeContactphone;
    }

    public void setStoreContactphone(String storeContactphone) {
        this.storeContactphone = storeContactphone;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getTimeOutStamp() {
        return this.timeOutStamp;
    }

    public void setTimeOutStamp(String timeOutStamp) {
        this.timeOutStamp = timeOutStamp;
    }

    public String getTotalPay() {
        return this.totalPay;
    }

    public void setTotalPay(String totalPay) {
        this.totalPay = totalPay;
    }

    public UserThirdAddress getUserAddress() {
        return this.userAddress;
    }

    public void setUserAddress(UserThirdAddress userAddress) {
        this.userAddress = userAddress;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getX() {
        return this.x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return this.y;
    }

    public void setY(String y) {
        this.y = y;
    }

}
