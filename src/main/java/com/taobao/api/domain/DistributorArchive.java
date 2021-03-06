package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分销商档案信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class DistributorArchive extends TaobaoObject {

    private static final long serialVersionUID = 8637869413444471547L;

    /**
     * 近30天投诉率=近30天投诉总数/近30天支付宝成交笔数
     */
    @ApiField("complaints_count_per")
    private String complaintsCountPer;

    /**
     * 供应商授权分销商的产品的下载率。 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    @ApiField("down_load_ratio")
    private String downLoadRatio;

    /**
     * 好评率
     */
    @ApiField("good_evaluation_rate")
    private String goodEvaluationRate;

    /**
     * 店铺好评率，即店铺累计好评数/店铺评价总数
     */
    @ApiField("good_evaluation_rate_d")
    private String goodEvaluationRateD;

    /**
     * 总商品数
     */
    @ApiField("goods_sum")
    private String goodsSum;

    /**
     * 行业主营占比
     */
    @ApiField("indus_per_scole")
    private String indusPerScole;

    /**
     * 所在行业
     */
    @ApiField("industry")
    private String industry;

    /**
     * 开店时间
     */
    @ApiField("openashop_time")
    private String openashopTime;

    /**
     * 近180天“宝贝与描述相符”店铺动态评分数据
     */
    @ApiField("order_merchandise_score")
    private String orderMerchandiseScore;

    /**
     * 供应商在分销商店铺中的成交（已付款）订单笔数占比。
     * 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    @ApiField("order_shop_ratio")
    private String orderShopRatio;

    /**
     * 近30天被处罚总数
     */
    @ApiField("punished_count")
    private String punishedCount;

    /**
     * 近180天“卖家发货速度”店铺动态评分数据
     */
    @ApiField("sale_consignment_score")
    private String saleConsignmentScore;

    /**
     * 近30天卖家平均退款时间,单位天
     */
    @ApiField("seller_refund_time")
    private String sellerRefundTime;

    /**
     * 近30天平均退款率=近30天退款笔数/近30天支付宝成交笔数
     */
    @ApiField("seller_refund_time_per")
    private String sellerRefundTimePer;

    /**
     * 卖家星级，加载周期：日
     */
    @ApiField("seller_star_name")
    private String sellerStarName;

    /**
     * 卖家类型
     */
    @ApiField("seller_type")
    private String sellerType;

    /**
     * 近180天“卖家服务态度”店铺动态评分数据
     */
    @ApiField("service_quality_score")
    private String serviceQualityScore;

    /**
     * 店铺url
     */
    @ApiField("shop_address")
    private String shopAddress;

    /**
     * 店铺名称
     */
    @ApiField("shop_name")
    private String shopName;

    /**
     * 供应商授权分销商的产品的上架率。 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    @ApiField("up_self_ratio")
    private String upSelfRatio;

    /**
     * 供应商在分销商店铺中的上架商品占比。 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    @ApiField("up_shop_ratio")
    private String upShopRatio;

    /**
     * 供应商在分销商店铺中铺货商品UV占店铺商品总UV的比。
     * 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    @ApiField("uv_shop_ratio")
    private String uvShopRatio;

    public String getComplaintsCountPer() {
        return this.complaintsCountPer;
    }

    public String getDownLoadRatio() {
        return this.downLoadRatio;
    }

    public String getGoodEvaluationRate() {
        return this.goodEvaluationRate;
    }

    public String getGoodEvaluationRateD() {
        return this.goodEvaluationRateD;
    }

    public String getGoodsSum() {
        return this.goodsSum;
    }

    public String getIndusPerScole() {
        return this.indusPerScole;
    }

    public String getIndustry() {
        return this.industry;
    }

    public String getOpenashopTime() {
        return this.openashopTime;
    }

    public String getOrderMerchandiseScore() {
        return this.orderMerchandiseScore;
    }

    public String getOrderShopRatio() {
        return this.orderShopRatio;
    }

    public String getPunishedCount() {
        return this.punishedCount;
    }

    public String getSaleConsignmentScore() {
        return this.saleConsignmentScore;
    }

    public String getSellerRefundTime() {
        return this.sellerRefundTime;
    }

    public String getSellerRefundTimePer() {
        return this.sellerRefundTimePer;
    }

    public String getSellerStarName() {
        return this.sellerStarName;
    }

    public String getSellerType() {
        return this.sellerType;
    }

    public String getServiceQualityScore() {
        return this.serviceQualityScore;
    }

    public String getShopAddress() {
        return this.shopAddress;
    }

    public String getShopName() {
        return this.shopName;
    }

    public String getUpSelfRatio() {
        return this.upSelfRatio;
    }

    public String getUpShopRatio() {
        return this.upShopRatio;
    }

    public String getUvShopRatio() {
        return this.uvShopRatio;
    }

    public void setComplaintsCountPer(String complaintsCountPer) {
        this.complaintsCountPer = complaintsCountPer;
    }

    public void setDownLoadRatio(String downLoadRatio) {
        this.downLoadRatio = downLoadRatio;
    }

    public void setGoodEvaluationRate(String goodEvaluationRate) {
        this.goodEvaluationRate = goodEvaluationRate;
    }

    public void setGoodEvaluationRateD(String goodEvaluationRateD) {
        this.goodEvaluationRateD = goodEvaluationRateD;
    }

    public void setGoodsSum(String goodsSum) {
        this.goodsSum = goodsSum;
    }

    public void setIndusPerScole(String indusPerScole) {
        this.indusPerScole = indusPerScole;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setOpenashopTime(String openashopTime) {
        this.openashopTime = openashopTime;
    }

    public void setOrderMerchandiseScore(String orderMerchandiseScore) {
        this.orderMerchandiseScore = orderMerchandiseScore;
    }

    public void setOrderShopRatio(String orderShopRatio) {
        this.orderShopRatio = orderShopRatio;
    }

    public void setPunishedCount(String punishedCount) {
        this.punishedCount = punishedCount;
    }

    public void setSaleConsignmentScore(String saleConsignmentScore) {
        this.saleConsignmentScore = saleConsignmentScore;
    }

    public void setSellerRefundTime(String sellerRefundTime) {
        this.sellerRefundTime = sellerRefundTime;
    }

    public void setSellerRefundTimePer(String sellerRefundTimePer) {
        this.sellerRefundTimePer = sellerRefundTimePer;
    }

    public void setSellerStarName(String sellerStarName) {
        this.sellerStarName = sellerStarName;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public void setServiceQualityScore(String serviceQualityScore) {
        this.serviceQualityScore = serviceQualityScore;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setUpSelfRatio(String upSelfRatio) {
        this.upSelfRatio = upSelfRatio;
    }

    public void setUpShopRatio(String upShopRatio) {
        this.upShopRatio = upShopRatio;
    }

    public void setUvShopRatio(String uvShopRatio) {
        this.uvShopRatio = uvShopRatio;
    }

}
