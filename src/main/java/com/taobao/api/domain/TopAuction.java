package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 外卖商品对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class TopAuction extends TaobaoObject {

    private static final long serialVersionUID = 8621256343944384921L;

    /**
     * 外卖商品描述
     */
    @ApiField("auction_desc")
    private String auctionDesc;

    /**
     * 商品sku列表
     */
    @ApiListField("auction_skudos")
    @ApiField("auction_sku_d_o")
    private List<AuctionSkuDO> auctionSkudos;

    /**
     * 宝贝状态(0,1出售状态,-2在仓库中)
     */
    @ApiField("auction_status")
    private Long auctionStatus;

    /**
     * 外卖宝贝所属后台类目
     */
    @ApiField("category_id")
    private Long categoryId;

    /**
     * 商品发布时间(毫秒)
     */
    @ApiField("create_time")
    private String createTime;

    /**
     * 宝贝外部编码
     */
    @ApiField("goods_no")
    private String goodsNo;

    /**
     * 外卖商品id
     */
    @ApiField("item_id")
    private Long itemId;

    /**
     * 单个宝贝限购数量
     */
    @ApiField("limit_buy")
    private Long limitBuy;

    /**
     * 最后修改时间(毫秒)
     */
    @ApiField("modify_time")
    private String modifyTime;

    /**
     * 商品最初发布的数量
     */
    @ApiField("old_quantity")
    private Long oldQuantity;

    /**
     * 宝贝原价
     */
    @ApiField("ori_price")
    private String oriPrice;

    /**
     * 宝贝完整图片路径
     */
    @ApiField("pic_url")
    private String picUrl;

    /**
     * 宝贝价格，最多两位小数
     */
    @ApiField("price")
    private String price;

    /**
     * 宝贝库存
     */
    @ApiField("quantity")
    private Long quantity;

    /**
     * 1推荐，0不推荐
     */
    @ApiField("recommend")
    private Long recommend;

    /**
     * 宝贝规则ID
     */
    @ApiField("rule_id")
    private Long ruleId;

    /**
     * 外卖商品标题
     */
    @ApiField("title")
    private String title;

    /**
     * 商品多图信息，多个图片url以英文逗号分隔
     */
    @ApiField("vice_image")
    private String viceImage;

    public String getAuctionDesc() {
        return this.auctionDesc;
    }

    public void setAuctionDesc(String auctionDesc) {
        this.auctionDesc = auctionDesc;
    }

    public List<AuctionSkuDO> getAuctionSkudos() {
        return this.auctionSkudos;
    }

    public void setAuctionSkudos(List<AuctionSkuDO> auctionSkudos) {
        this.auctionSkudos = auctionSkudos;
    }

    public Long getAuctionStatus() {
        return this.auctionStatus;
    }

    public void setAuctionStatus(Long auctionStatus) {
        this.auctionStatus = auctionStatus;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getGoodsNo() {
        return this.goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getLimitBuy() {
        return this.limitBuy;
    }

    public void setLimitBuy(Long limitBuy) {
        this.limitBuy = limitBuy;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getOldQuantity() {
        return this.oldQuantity;
    }

    public void setOldQuantity(Long oldQuantity) {
        this.oldQuantity = oldQuantity;
    }

    public String getOriPrice() {
        return this.oriPrice;
    }

    public void setOriPrice(String oriPrice) {
        this.oriPrice = oriPrice;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getPrice() {
        return this.price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getRecommend() {
        return this.recommend;
    }

    public void setRecommend(Long recommend) {
        this.recommend = recommend;
    }

    public Long getRuleId() {
        return this.ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getViceImage() {
        return this.viceImage;
    }

    public void setViceImage(String viceImage) {
        this.viceImage = viceImage;
    }

}
