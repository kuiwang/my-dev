package com.scott.dev.taobao.api.fenxiao.domain;

/**
 * 分销商档案信息
 */
public class DistributorArchive {

    /**
     * 近30天投诉率=近30天投诉总数/近30天支付宝成交笔数
     */
    private String complaintsCountPer;

    /**
     * 供应商授权分销商的产品的下载率。 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    private String downLoadRatio;

    /**
     * 好评率
     */
    private String goodEvaluationRate;

    /**
     * 店铺好评率，即店铺累计好评数/店铺评价总数
     */
    private String goodEvaluationRateD;

    /**
     * 总商品数
     */
    private String goodsSum;

    /**
     * 行业主营占比
     */
    private String indusPerScole;

    /**
     * 所在行业
     */
    private String industry;

    /**
     * 开店时间
     */
    private String openashopTime;

    /**
     * 近180天“宝贝与描述相符”店铺动态评分数据
     */
    private String orderMerchandiseScore;

    /**
     * 供应商在分销商店铺中的成交（已付款）订单笔数占比。
     * 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    private String orderShopRatio;

    /**
     * 近30天被处罚总数
     */
    private String punishedCount;

    /**
     * 近180天“卖家发货速度”店铺动态评分数据
     */
    private String saleConsignmentScore;

    /**
     * 近30天卖家平均退款时间,单位天
     */
    private String sellerRefundTime;

    /**
     * 近30天平均退款率=近30天退款笔数/近30天支付宝成交笔数
     */
    private String sellerRefundTimePer;

    /**
     * 卖家星级，加载周期：日
     */
    private String sellerStarName;

    /**
     * 卖家类型
     */
    private String sellerType;

    /**
     * 近180天“卖家服务态度”店铺动态评分数据
     */
    private String serviceQualityScore;

    /**
     * 店铺url
     */
    private String shopAddress;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 供应商授权分销商的产品的上架率。 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    private String upSelfRatio;

    /**
     * 供应商在分销商店铺中的上架商品占比。 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    private String upShopRatio;

    /**
     * 供应商在分销商店铺中铺货商品UV占店铺商品总UV的比。
     * 率的值都是*10000后的，取值后直接除以100后加上%即可。比如12.33%，返回值是1233。
     */
    private String uvShopRatio;

    public String getComplaintsCountPer() {
        return this.complaintsCountPer;
    }

    public void setComplaintsCountPer(String complaintsCountPer) {
        this.complaintsCountPer = complaintsCountPer;
    }

    public String getDownLoadRatio() {
        return this.downLoadRatio;
    }

    public void setDownLoadRatio(String downLoadRatio) {
        this.downLoadRatio = downLoadRatio;
    }

    public String getGoodEvaluationRate() {
        return this.goodEvaluationRate;
    }

    public void setGoodEvaluationRate(String goodEvaluationRate) {
        this.goodEvaluationRate = goodEvaluationRate;
    }

    public String getGoodEvaluationRateD() {
        return this.goodEvaluationRateD;
    }

    public void setGoodEvaluationRateD(String goodEvaluationRateD) {
        this.goodEvaluationRateD = goodEvaluationRateD;
    }

    public String getGoodsSum() {
        return this.goodsSum;
    }

    public void setGoodsSum(String goodsSum) {
        this.goodsSum = goodsSum;
    }

    public String getIndusPerScole() {
        return this.indusPerScole;
    }

    public void setIndusPerScole(String indusPerScole) {
        this.indusPerScole = indusPerScole;
    }

    public String getIndustry() {
        return this.industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getOpenashopTime() {
        return this.openashopTime;
    }

    public void setOpenashopTime(String openashopTime) {
        this.openashopTime = openashopTime;
    }

    public String getOrderMerchandiseScore() {
        return this.orderMerchandiseScore;
    }

    public void setOrderMerchandiseScore(String orderMerchandiseScore) {
        this.orderMerchandiseScore = orderMerchandiseScore;
    }

    public String getOrderShopRatio() {
        return this.orderShopRatio;
    }

    public void setOrderShopRatio(String orderShopRatio) {
        this.orderShopRatio = orderShopRatio;
    }

    public String getPunishedCount() {
        return this.punishedCount;
    }

    public void setPunishedCount(String punishedCount) {
        this.punishedCount = punishedCount;
    }

    public String getSaleConsignmentScore() {
        return this.saleConsignmentScore;
    }

    public void setSaleConsignmentScore(String saleConsignmentScore) {
        this.saleConsignmentScore = saleConsignmentScore;
    }

    public String getSellerRefundTime() {
        return this.sellerRefundTime;
    }

    public void setSellerRefundTime(String sellerRefundTime) {
        this.sellerRefundTime = sellerRefundTime;
    }

    public String getSellerRefundTimePer() {
        return this.sellerRefundTimePer;
    }

    public void setSellerRefundTimePer(String sellerRefundTimePer) {
        this.sellerRefundTimePer = sellerRefundTimePer;
    }

    public String getSellerStarName() {
        return this.sellerStarName;
    }

    public void setSellerStarName(String sellerStarName) {
        this.sellerStarName = sellerStarName;
    }

    public String getSellerType() {
        return this.sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getServiceQualityScore() {
        return this.serviceQualityScore;
    }

    public void setServiceQualityScore(String serviceQualityScore) {
        this.serviceQualityScore = serviceQualityScore;
    }

    public String getShopAddress() {
        return this.shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopName() {
        return this.shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getUpSelfRatio() {
        return this.upSelfRatio;
    }

    public void setUpSelfRatio(String upSelfRatio) {
        this.upSelfRatio = upSelfRatio;
    }

    public String getUpShopRatio() {
        return this.upShopRatio;
    }

    public void setUpShopRatio(String upShopRatio) {
        this.upShopRatio = upShopRatio;
    }

    public String getUvShopRatio() {
        return this.uvShopRatio;
    }

    public void setUvShopRatio(String uvShopRatio) {
        this.uvShopRatio = uvShopRatio;
    }

}
