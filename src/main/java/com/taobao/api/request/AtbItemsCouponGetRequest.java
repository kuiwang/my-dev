package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AtbItemsCouponGetResponse;

/**
 * TOP API: taobao.atb.items.coupon.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class AtbItemsCouponGetRequest implements TaobaoRequest<AtbItemsCouponGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品所在地
     */
    private String area;

    /**
     * 标准商品后台类目id。该ID可以通过taobao.itemcats.get接口获取到。 支持最大值为：2147483647
     */
    private Long cid;

    /**
     * 优惠商品类型.1:打折商品,默认值为1
     */
    private Long couponType;

    /**
     * 设置30天累计推广量（与返回数据中的commission_num字段对应）上限.注：
     * 该字段要与start_commissionNum一起使用才生效
     */
    private Long endCommissionNum;

    /**
     * 最高佣金比率选项，如：2345表示23.45%。注：要起始佣金比率和最高佣金比率一起设置才有效。
     */
    private Long endCommissionRate;

    /**
     * 最高累计推广佣金选项
     */
    private Long endCommissionVolume;

    /**
     * 设置折扣比例范围上限,如：8000表示80.00%.注：要起始折扣比率和最高折扣比率一起设置才有效
     */
    private Long endCouponRate;

    /**
     * 可选值和start_credit一样.start_credit的值一定要小于或等于end_credit的值。注：
     * end_credit与start_credit一起使用才生效
     */
    private String endCredit;

    /**
     * 设置商品总成交量（与返回字段volume对应）上限。
     */
    private Long endVolume;

    /**
     * 需返回的字段列表.可选值:open_iid,title,nick,pic_url,price,commission,
     * commission_rate
     * ,commission_num,commission_volume,seller_credit_score,
     * item_location,volume
     * ,coupon_price,coupon_rate,coupon_start_time,coupon_end_time
     * ,shop_type;字段之间用","分隔
     */
    private String fields;

    /**
     * 商品标题中包含的关键字. 注意:查询时keyword,cid至少选择其中一个参数
     */
    private String keyword;

    /**
     * 结果页数.1~99
     */
    private Long pageNo;

    /**
     * 每页返回结果数.最大每页100
     */
    private Long pageSize;

    /**
     * 店铺类型.默认all,商城:b,集市:c
     */
    private String shopType;

    /**
     * default(默认排序), price_desc(折扣价格从高到低), price_asc(折扣价格从低到高),
     * credit_desc(信用等级从高到低), credit_asc(信用等级从低到高),
     * commissionRate_desc(佣金比率从高到低), commissionRate_asc(佣金比率从低到高),
     * volume_desc(成交量成高到低), volume_asc(成交量从低到高)
     */
    private String sort;

    /**
     * 设置30天累计推广量（与返回数据中的commission_num字段对应）下限.注：
     * 该字段要与end_commissionNum一起使用才生效
     */
    private Long startCommissionNum;

    /**
     * 起始佣金比率选项，如：1234表示12.34%
     */
    private Long startCommissionRate;

    /**
     * 起始累计推广量佣金.注：返回的数据是30天内累计推广佣金，该字段要与最高累计推广佣金一起使用才生效
     */
    private Long startCommissionVolume;

    /**
     * 设置折扣比例范围下限,如：7000表示70.00%
     */
    private Long startCouponRate;

    /**
     * 卖家信用: 1heart(一心) 2heart (两心) 3heart(三心) 4heart(四心) 5heart(五心)
     * 1diamond(一钻) 2diamond(两钻) 3diamond(三钻) 4diamond(四钻) 5diamond(五钻)
     * 1crown(一冠) 2crown(两冠) 3crown(三冠) 4crown(四冠) 5crown(五冠)
     * 1goldencrown(一黄冠) 2goldencrown(二黄冠) 3goldencrown(三黄冠)
     * 4goldencrown(四黄冠) 5goldencrown(五黄冠)
     */
    private String startCredit;

    /**
     * 设置商品总成交量（与返回字段volume对应）下限。
     */
    private Long startVolume;

    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return this.area;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getCid() {
        return this.cid;
    }

    public void setCouponType(Long couponType) {
        this.couponType = couponType;
    }

    public Long getCouponType() {
        return this.couponType;
    }

    public void setEndCommissionNum(Long endCommissionNum) {
        this.endCommissionNum = endCommissionNum;
    }

    public Long getEndCommissionNum() {
        return this.endCommissionNum;
    }

    public void setEndCommissionRate(Long endCommissionRate) {
        this.endCommissionRate = endCommissionRate;
    }

    public Long getEndCommissionRate() {
        return this.endCommissionRate;
    }

    public void setEndCommissionVolume(Long endCommissionVolume) {
        this.endCommissionVolume = endCommissionVolume;
    }

    public Long getEndCommissionVolume() {
        return this.endCommissionVolume;
    }

    public void setEndCouponRate(Long endCouponRate) {
        this.endCouponRate = endCouponRate;
    }

    public Long getEndCouponRate() {
        return this.endCouponRate;
    }

    public void setEndCredit(String endCredit) {
        this.endCredit = endCredit;
    }

    public String getEndCredit() {
        return this.endCredit;
    }

    public void setEndVolume(Long endVolume) {
        this.endVolume = endVolume;
    }

    public Long getEndVolume() {
        return this.endVolume;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public String getShopType() {
        return this.shopType;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSort() {
        return this.sort;
    }

    public void setStartCommissionNum(Long startCommissionNum) {
        this.startCommissionNum = startCommissionNum;
    }

    public Long getStartCommissionNum() {
        return this.startCommissionNum;
    }

    public void setStartCommissionRate(Long startCommissionRate) {
        this.startCommissionRate = startCommissionRate;
    }

    public Long getStartCommissionRate() {
        return this.startCommissionRate;
    }

    public void setStartCommissionVolume(Long startCommissionVolume) {
        this.startCommissionVolume = startCommissionVolume;
    }

    public Long getStartCommissionVolume() {
        return this.startCommissionVolume;
    }

    public void setStartCouponRate(Long startCouponRate) {
        this.startCouponRate = startCouponRate;
    }

    public Long getStartCouponRate() {
        return this.startCouponRate;
    }

    public void setStartCredit(String startCredit) {
        this.startCredit = startCredit;
    }

    public String getStartCredit() {
        return this.startCredit;
    }

    public void setStartVolume(Long startVolume) {
        this.startVolume = startVolume;
    }

    public Long getStartVolume() {
        return this.startVolume;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.atb.items.coupon.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("area", this.area);
        txtParams.put("cid", this.cid);
        txtParams.put("coupon_type", this.couponType);
        txtParams.put("end_commission_num", this.endCommissionNum);
        txtParams.put("end_commission_rate", this.endCommissionRate);
        txtParams.put("end_commission_volume", this.endCommissionVolume);
        txtParams.put("end_coupon_rate", this.endCouponRate);
        txtParams.put("end_credit", this.endCredit);
        txtParams.put("end_volume", this.endVolume);
        txtParams.put("fields", this.fields);
        txtParams.put("keyword", this.keyword);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("shop_type", this.shopType);
        txtParams.put("sort", this.sort);
        txtParams.put("start_commission_num", this.startCommissionNum);
        txtParams.put("start_commission_rate", this.startCommissionRate);
        txtParams.put("start_commission_volume", this.startCommissionVolume);
        txtParams.put("start_coupon_rate", this.startCouponRate);
        txtParams.put("start_credit", this.startCredit);
        txtParams.put("start_volume", this.startVolume);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<AtbItemsCouponGetResponse> getResponseClass() {
        return AtbItemsCouponGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
