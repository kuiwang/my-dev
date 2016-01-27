package com.scott.dev.taobao.api.delivery.domain;

import java.util.Date;

/*
 * 获取的物流订单详情列表 返回的Shipping包含的具体信息为入参fields请求的字段信息
 */
public class Shipping {

    /*
     * 买家昵称
     */
    private String buyerNick;

    /*
     * 物流公司名称
     */
    private String companyName;

    /*
     * 运单创建时间
     */
    private Date created;

    /*
     * 预约取货结束时间
     */
    private Date deliveryEnd;

    /*
     * 预约取货开始时间
     */
    private Date deliveryStart;

    /*
     * 谁承担运费.可选值:buyer(买家承担),seller(卖家承担运费).
     */
    private String freightPayer;

    /*
     * 标示为是否快捷COD订单
     */
    private Boolean isQuickCodOrder;

    /*
     * 运单修改时间
     */
    private Number isSpilt;

    /*
     * 返回发货是否成功。
     */
    private Boolean isSuccess;

    /*
     * 货物名称
     */
    private String itemTitle;

    /*
     * 收件人地址信息(在传输请求参数Fields字段时，必须使用“receiver_location”才能返回此字段)
     */
    private Location location;

    /*
     * 运单修改时间
     */
    private Date modified;

    /*
     * 物流订单编号
     */
    private String orderCode;

    /*
     * 运单号.具体一个物流公司的运单号码.
     */
    private String outSid;

    /*
     * 收件人手机号码
     */
    private String receiverMobile;

    /*
     * 收件人姓名
     */
    private String receiverName;

    /*
     * 收件人电话
     */
    private String receiverPhone;

    /*
     * 卖家是否确认发货.可选值:yes(是),no(否).
     */
    private String sellerConfirm;

    /*
     * 卖家昵称
     */
    private String sellerNick;

    /*
     * 物流订单状态,可选值: CREATED(订单已创建) RECREATED(订单重新创建) 
     * CANCELLED(订单已取消) CLOSED(订单关闭) SENDING(等候发送给物流公司) 
     * ACCEPTING(已发送给物流公司,等待接单) ACCEPTED(物流公司已接单 REJECTED(物流公司不接单) 
     * PICK_UP(物流公司揽收成功) PICK_UP_FAILED(物流公司揽收失败) LOST(物流公司丢单) 
     * REJECTED_BY_RECEIVER(对方拒签) ACCEPTED_BY_RECEIVER(发货方式在线下单：对方已签收；自己联系：卖家已发货)
     */
    private String status;

    /*
     * 拆单子订单列表，对应的数据是：该物流订单下的全部子订单
     */
    private Number[] subTids;

    /*
     * 交易ID
     */
    private Number tid;

    /*
     * 物流方式.可选值:free(卖家包邮),post(平邮),express(快递),ems(EMS).
     */
    private String type;

    public String getBuyerNick() {
        return buyerNick;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Date getCreated() {
        return created;
    }

    public Date getDeliveryEnd() {
        return deliveryEnd;
    }

    public Date getDeliveryStart() {
        return deliveryStart;
    }

    public String getFreightPayer() {
        return freightPayer;
    }

    public Boolean getIsQuickCodOrder() {
        return isQuickCodOrder;
    }

    public Number getIsSpilt() {
        return isSpilt;
    }

    public Boolean getIsSuccess() {
        return isSuccess;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public Location getLocation() {
        return location;
    }

    public Date getModified() {
        return modified;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public String getOutSid() {
        return outSid;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public String getSellerConfirm() {
        return sellerConfirm;
    }

    public String getSellerNick() {
        return sellerNick;
    }

    public String getStatus() {
        return status;
    }

    public Number[] getSubTids() {
        return subTids;
    }

    public Number getTid() {
        return tid;
    }

    public String getType() {
        return type;
    }

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDeliveryEnd(Date deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public void setDeliveryStart(Date deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public void setFreightPayer(String freightPayer) {
        this.freightPayer = freightPayer;
    }

    public void setIsQuickCodOrder(Boolean isQuickCodOrder) {
        this.isQuickCodOrder = isQuickCodOrder;
    }

    public void setIsSpilt(Number isSpilt) {
        this.isSpilt = isSpilt;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public void setOutSid(String outSid) {
        this.outSid = outSid;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone;
    }

    public void setSellerConfirm(String sellerConfirm) {
        this.sellerConfirm = sellerConfirm;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setSubTids(Number[] subTids) {
        this.subTids = subTids;
    }

    public void setTid(Number tid) {
        this.tid = tid;
    }

    public void setType(String type) {
        this.type = type;
    }
}
