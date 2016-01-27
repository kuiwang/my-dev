package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 满就送卖家销售详情list
 *
 * @author auto create
 * @since 1.0, null
 */
public class XiamiSellerlistInfo extends TaobaoObject {

    private static final long serialVersionUID = 8531655324331557627L;

    /**
     * 来源
     */
    @ApiField("comefrom")
    private String comefrom;

    /**
     * 礼包订单ID
     */
    @ApiField("gift_order_id")
    private Long giftOrderId;

    /**
     * 创建时间戳
     */
    @ApiField("gmt_create")
    private Long gmtCreate;

    /**
     * 领取时间戳
     */
    @ApiField("gmt_get")
    private Long gmtGet;

    /**
     * 后付款订单付款时间
     */
    @ApiField("gmt_pay")
    private Long gmtPay;

    /**
     * 数字ID
     */
    @ApiField("id")
    private Long id;

    /**
     * 是否已领取
     */
    @ApiField("is_get")
    private Long isGet;

    /**
     * 是否付款
     */
    @ApiField("is_pay")
    private Long isPay;

    /**
     * 订单ID
     */
    @ApiField("original_order_id")
    private Long originalOrderId;

    /**
     * 礼包名称
     */
    @ApiField("packname")
    private String packname;

    /**
     * 礼包价格
     */
    @ApiField("pay")
    private Long pay;

    /**
     * 关联ID
     */
    @ApiField("relation_id")
    private Long relationId;

    /**
     * 卖家ID
     */
    @ApiField("seller_id")
    private Long sellerId;

    /**
     * 店铺ID
     */
    @ApiField("shop_id")
    private Long shopId;

    /**
     * 店铺名称
     */
    @ApiField("shop_name")
    private String shopName;

    /**
     * 店铺URL
     */
    @ApiField("shop_url")
    private String shopUrl;

    /**
     * 买家ID
     */
    @ApiField("taobao_uid")
    private Long taobaoUid;

    /**
     * 礼包类型
     */
    @ApiField("type")
    private Long type;

    /**
     * 领取的虾米ID
     */
    @ApiField("user_id")
    private Long userId;

    public String getComefrom() {
        return this.comefrom;
    }

    public Long getGiftOrderId() {
        return this.giftOrderId;
    }

    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public Long getGmtGet() {
        return this.gmtGet;
    }

    public Long getGmtPay() {
        return this.gmtPay;
    }

    public Long getId() {
        return this.id;
    }

    public Long getIsGet() {
        return this.isGet;
    }

    public Long getIsPay() {
        return this.isPay;
    }

    public Long getOriginalOrderId() {
        return this.originalOrderId;
    }

    public String getPackname() {
        return this.packname;
    }

    public Long getPay() {
        return this.pay;
    }

    public Long getRelationId() {
        return this.relationId;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getShopName() {
        return this.shopName;
    }

    public String getShopUrl() {
        return this.shopUrl;
    }

    public Long getTaobaoUid() {
        return this.taobaoUid;
    }

    public Long getType() {
        return this.type;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setComefrom(String comefrom) {
        this.comefrom = comefrom;
    }

    public void setGiftOrderId(Long giftOrderId) {
        this.giftOrderId = giftOrderId;
    }

    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGmtGet(Long gmtGet) {
        this.gmtGet = gmtGet;
    }

    public void setGmtPay(Long gmtPay) {
        this.gmtPay = gmtPay;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsGet(Long isGet) {
        this.isGet = isGet;
    }

    public void setIsPay(Long isPay) {
        this.isPay = isPay;
    }

    public void setOriginalOrderId(Long originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    public void setPackname(String packname) {
        this.packname = packname;
    }

    public void setPay(Long pay) {
        this.pay = pay;
    }

    public void setRelationId(Long relationId) {
        this.relationId = relationId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public void setTaobaoUid(Long taobaoUid) {
        this.taobaoUid = taobaoUid;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

}
