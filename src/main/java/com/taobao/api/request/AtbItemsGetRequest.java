package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AtbItemsGetResponse;

/**
 * TOP API: taobao.atb.items.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class AtbItemsGetRequest implements TaobaoRequest<AtbItemsGetResponse> {

    /**
     * 商品所在地
     */
    private String area;

    /**
     * 是否自动发货
     */
    private String autoSend;

    /**
     * 是否支持抵价券，设置为true表示该商品支持抵价券，设置为false或不设置表示不判断这个属性
     */
    private String cashCoupon;

    /**
     * 标准商品后台类目id。该ID可以通过taobao.itemcats.get接口获取到。
     */
    private Long cid;

    /**
     * 30天累计推广量（与返回数据中的commission_num字段对应）上限.
     */
    private String endCommissionNum;

    /**
     * 佣金比率上限，如：2345表示23.45%。注：
     * start_commissionRate和end_commissionRate一起设置才有效。
     */
    private String endCommissionRate;

    /**
     * 可选值和start_credit一样.start_credit的值一定要小于或等于end_credit的值。注：
     * end_credit与start_credit一起使用才生效
     */
    private String endCredit;

    /**
     * 最高价格
     */
    private String endPrice;

    /**
     * 商品总成交量（与返回字段volume对应）上限。
     */
    private String endTotalnum;

    /**
     * 需返回的字段列表.可选值:open_iid,title,nick,pic_url,price,commission,
     * commission_rate
     * ,commission_num,commission_volume,seller_credit_score,
     * item_location,volume ;字段之间用","分隔
     */
    private String fields;

    /**
     * 是否查询消保卖家
     */
    private String guarantee;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品标题中包含的关键字. 注意:查询时keyword,cid至少选择其中一个参数
     */
    private String keyword;

    /**
     * 是否商城的商品，设置为true表示该商品是属于淘宝商城的商品，设置为false或不设置表示不判断这个属性
     */
    private String mallItem;

    /**
     * 是否30天维修，设置为true表示该商品是支持30天维修，设置为false或不设置表示不判断这个属性
     */
    private String onemonthRepair;

    /**
     * 是否海外商品，设置为true表示该商品是属于海外商品，默认为false
     */
    private String overseasItem;

    /**
     * 结果页数.1~10 支持最大值为：10
     */
    private Long pageNo;

    /**
     * 每页返回结果数.最大每页40 支持最大值为：400
     */
    private Long pageSize;

    /**
     * 是否如实描述(即:先行赔付)商品，设置为true表示该商品是如实描述的商品，设置为false或不设置表示不判断这个属性
     */
    private String realDescribe;

    /**
     * 是否支持7天退换，设置为true表示该商品支持7天退换，设置为false或不设置表示不判断这个属性
     */
    private String sevendaysReturn;

    /**
     * 默认排序:default price_desc(价格从高到低) price_asc(价格从低到高)
     * credit_desc(信用等级从高到低) commissionRate_desc(佣金比率从高到低)
     * commissionRate_asc(佣金比率从低到高) commissionNum_desc(成交量成高到低)
     * commissionNum_asc(成交量从低到高) commissionVolume_desc(总支出佣金从高到低)
     * commissionVolume_asc(总支出佣金从低到高) delistTime_desc(商品下架时间从高到低)
     * delistTime_asc(商品下架时间从低到高)
     */
    private String sort;

    /**
     * 30天累计推广量（与返回数据中的commission_num字段对应）下限.注：
     * 该字段要与end_commissionNum一起使用才生效
     */
    private String startCommissionNum;

    /**
     * 佣金比率下限，如：1234表示12.34%
     */
    private String startCommissionRate;

    /**
     * 卖家信用: 1heart(一心) 2heart (两心) 3heart(三心) 4heart(四心) 5heart(五心)
     * 1diamond(一钻) 2diamond(两钻 3diamond(三钻) 4diamond(四钻) 5diamond(五钻)
     * 1crown(一冠) 2crown(两冠) 3crown(三冠) 4crown(四冠) 5crown(五冠)
     * 1goldencrown(一黄冠) 2goldencrown(二黄冠) 3goldencrown(三黄冠)
     * 4goldencrown(四黄冠) 5goldencrown(五黄冠)
     */
    private String startCredit;

    /**
     * 起始价格.传入价格参数时,需注意起始价格和最高价格必须一起传入,并且 start_price <= end_price
     */
    private String startPrice;

    /**
     * 商品总成交量（与返回字段volume对应）下限。
     */
    private String startTotalnum;

    /**
     * 是否支持货到付款，设置为true表示该商品是支持货到付款，设置为false或不设置表示不判断这个属性
     */
    private String supportCod;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 是否支持VIP卡，设置为true表示该商品支持VIP卡，设置为false或不设置表示不判断这个属性
     */
    private String vipCard;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.atb.items.get";
    }

    public String getArea() {
        return this.area;
    }

    public String getAutoSend() {
        return this.autoSend;
    }

    public String getCashCoupon() {
        return this.cashCoupon;
    }

    public Long getCid() {
        return this.cid;
    }

    public String getEndCommissionNum() {
        return this.endCommissionNum;
    }

    public String getEndCommissionRate() {
        return this.endCommissionRate;
    }

    public String getEndCredit() {
        return this.endCredit;
    }

    public String getEndPrice() {
        return this.endPrice;
    }

    public String getEndTotalnum() {
        return this.endTotalnum;
    }

    public String getFields() {
        return this.fields;
    }

    public String getGuarantee() {
        return this.guarantee;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getMallItem() {
        return this.mallItem;
    }

    public String getOnemonthRepair() {
        return this.onemonthRepair;
    }

    public String getOverseasItem() {
        return this.overseasItem;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getRealDescribe() {
        return this.realDescribe;
    }

    @Override
    public Class<AtbItemsGetResponse> getResponseClass() {
        return AtbItemsGetResponse.class;
    }

    public String getSevendaysReturn() {
        return this.sevendaysReturn;
    }

    public String getSort() {
        return this.sort;
    }

    public String getStartCommissionNum() {
        return this.startCommissionNum;
    }

    public String getStartCommissionRate() {
        return this.startCommissionRate;
    }

    public String getStartCredit() {
        return this.startCredit;
    }

    public String getStartPrice() {
        return this.startPrice;
    }

    public String getStartTotalnum() {
        return this.startTotalnum;
    }

    public String getSupportCod() {
        return this.supportCod;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("area", this.area);
        txtParams.put("auto_send", this.autoSend);
        txtParams.put("cash_coupon", this.cashCoupon);
        txtParams.put("cid", this.cid);
        txtParams.put("end_commission_num", this.endCommissionNum);
        txtParams.put("end_commission_rate", this.endCommissionRate);
        txtParams.put("end_credit", this.endCredit);
        txtParams.put("end_price", this.endPrice);
        txtParams.put("end_totalnum", this.endTotalnum);
        txtParams.put("fields", this.fields);
        txtParams.put("guarantee", this.guarantee);
        txtParams.put("keyword", this.keyword);
        txtParams.put("mall_item", this.mallItem);
        txtParams.put("onemonth_repair", this.onemonthRepair);
        txtParams.put("overseas_item", this.overseasItem);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("real_describe", this.realDescribe);
        txtParams.put("sevendays_return", this.sevendaysReturn);
        txtParams.put("sort", this.sort);
        txtParams.put("start_commission_num", this.startCommissionNum);
        txtParams.put("start_commission_rate", this.startCommissionRate);
        txtParams.put("start_credit", this.startCredit);
        txtParams.put("start_price", this.startPrice);
        txtParams.put("start_totalnum", this.startTotalnum);
        txtParams.put("support_cod", this.supportCod);
        txtParams.put("vip_card", this.vipCard);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getVipCard() {
        return this.vipCard;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setAutoSend(String autoSend) {
        this.autoSend = autoSend;
    }

    public void setCashCoupon(String cashCoupon) {
        this.cashCoupon = cashCoupon;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setEndCommissionNum(String endCommissionNum) {
        this.endCommissionNum = endCommissionNum;
    }

    public void setEndCommissionRate(String endCommissionRate) {
        this.endCommissionRate = endCommissionRate;
    }

    public void setEndCredit(String endCredit) {
        this.endCredit = endCredit;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public void setEndTotalnum(String endTotalnum) {
        this.endTotalnum = endTotalnum;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setMallItem(String mallItem) {
        this.mallItem = mallItem;
    }

    public void setOnemonthRepair(String onemonthRepair) {
        this.onemonthRepair = onemonthRepair;
    }

    public void setOverseasItem(String overseasItem) {
        this.overseasItem = overseasItem;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setRealDescribe(String realDescribe) {
        this.realDescribe = realDescribe;
    }

    public void setSevendaysReturn(String sevendaysReturn) {
        this.sevendaysReturn = sevendaysReturn;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setStartCommissionNum(String startCommissionNum) {
        this.startCommissionNum = startCommissionNum;
    }

    public void setStartCommissionRate(String startCommissionRate) {
        this.startCommissionRate = startCommissionRate;
    }

    public void setStartCredit(String startCredit) {
        this.startCredit = startCredit;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    public void setStartTotalnum(String startTotalnum) {
        this.startTotalnum = startTotalnum;
    }

    public void setSupportCod(String supportCod) {
        this.supportCod = supportCod;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setVipCard(String vipCard) {
        this.vipCard = vipCard;
    }
}
