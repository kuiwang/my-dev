package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SpItemListGetResponse;

/**
 * TOP API: taobao.sp.item.list.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:50
 */
public class SpItemListGetRequest implements TaobaoRequest<SpItemListGetResponse> {

    /**
     * 商品所在地:省名
     */
    private String area;

    /**
     * 标准商品后台类目id。该ID可以通过taobao.itemcats.get接口获取到。
     */
    private Long cid;

    /**
     * 30天成交笔数(上限)
     */
    private String endBiz30day;

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
     * 是否支持货到付款，设置为true表示该商品支持货到付款，设置为false或不设置表示不判断这个属性
     */
    private String hdfk;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 是否支持假一赔三，设置为true表示该商品支持假一赔三，设置为false或不设置表示不判断这个属性
     */
    private String jyps;

    /**
     * 商品标题中包含的关键字. 注意:查询时keyword,cid至少选择其中一个参数
     */
    private String keyword;

    /**
     * 是否免邮费，设置为true表示该商品免邮，设置为false或不设置表示不判断这个属性
     */
    private String myf;

    /**
     * 结果页数.
     */
    private Long pageNo;

    /**
     * 每页返回结果数.最大每页40
     */
    private Long pageSize;

    /**
     * 是否支持七天退换，设置为true表示该商品支持七天退换，设置为false或不设置表示不判断这个属性
     */
    private String qtth;

    /**
     * 站点key<br />
     * 支持最大长度为：32<br />
     * 支持的最大列表长度为：32
     */
    private String siteKey;

    /**
     * price_asc: 价格从低到高, 默认为折扣价格; sales_desc:销量从高到低; credit_desc:信用从高到低
     */
    private String sort;

    /**
     * 30天成交笔数, 下限
     */
    private String startBiz30day;

    /**
     * 佣金比率下限，如：1234表示12.34%
     */
    private String startCommissionRate;

    /**
     * 卖家信用: 1(一心) 2(两心) 3(三心) 4(四心) 5(五心) 6(一钻) 7(两钻) 8(三钻) 9(四钻) 10(五钻)
     * 11(一冠) 12(两冠) 13(三冠) 14(四冠) 15(五冠) 16(一黄冠) 17(二黄冠) 18(三黄冠) 19(四黄冠)
     * 20(五黄冠)
     */
    private String startCredit;

    /**
     * 起始价格, 默认为折扣价格.传入价格参数时,需注意起始价格和最高价格必须一起传入,并且 start_price <= end_price
     */
    private String startPrice;

    private Long timestamp;

    /**
     * 是否商城的商品，设置为true表示该商品是属于淘宝商城的商品，设置为false或不设置表示不判断这个属性
     */
    private String tmallItem;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 是否支持消费者保障，设置为true表示该商品支持消费者保障，设置为false或不设置表示不判断这个属性
     */
    private String xfzbz;

    /**
     * 是否支持正品保障，设置为true表示该商品支持正品保障，设置为false或不设置表示不判断这个属性
     */
    private String zpbz;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(siteKey, "siteKey");
        RequestCheckUtils.checkMaxLength(siteKey, 32, "siteKey");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.sp.item.list.get";
    }

    public String getArea() {
        return this.area;
    }

    public Long getCid() {
        return this.cid;
    }

    public String getEndBiz30day() {
        return this.endBiz30day;
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

    public String getHdfk() {
        return this.hdfk;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getJyps() {
        return this.jyps;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public String getMyf() {
        return this.myf;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    public String getQtth() {
        return this.qtth;
    }

    @Override
    public Class<SpItemListGetResponse> getResponseClass() {
        return SpItemListGetResponse.class;
    }

    public String getSiteKey() {
        return this.siteKey;
    }

    public String getSort() {
        return this.sort;
    }

    public String getStartBiz30day() {
        return this.startBiz30day;
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

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("area", this.area);
        txtParams.put("cid", this.cid);
        txtParams.put("end_biz30day", this.endBiz30day);
        txtParams.put("end_commission_rate", this.endCommissionRate);
        txtParams.put("end_credit", this.endCredit);
        txtParams.put("end_price", this.endPrice);
        txtParams.put("hdfk", this.hdfk);
        txtParams.put("jyps", this.jyps);
        txtParams.put("keyword", this.keyword);
        txtParams.put("myf", this.myf);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("qtth", this.qtth);
        txtParams.put("site_key", this.siteKey);
        txtParams.put("sort", this.sort);
        txtParams.put("start_biz30day", this.startBiz30day);
        txtParams.put("start_commission_rate", this.startCommissionRate);
        txtParams.put("start_credit", this.startCredit);
        txtParams.put("start_price", this.startPrice);
        txtParams.put("tmall_item", this.tmallItem);
        txtParams.put("xfzbz", this.xfzbz);
        txtParams.put("zpbz", this.zpbz);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTmallItem() {
        return this.tmallItem;
    }

    public String getXfzbz() {
        return this.xfzbz;
    }

    public String getZpbz() {
        return this.zpbz;
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

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setEndBiz30day(String endBiz30day) {
        this.endBiz30day = endBiz30day;
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

    public void setHdfk(String hdfk) {
        this.hdfk = hdfk;
    }

    public void setJyps(String jyps) {
        this.jyps = jyps;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public void setMyf(String myf) {
        this.myf = myf;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setQtth(String qtth) {
        this.qtth = qtth;
    }

    public void setSiteKey(String siteKey) {
        this.siteKey = siteKey;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public void setStartBiz30day(String startBiz30day) {
        this.startBiz30day = startBiz30day;
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

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTmallItem(String tmallItem) {
        this.tmallItem = tmallItem;
    }

    public void setXfzbz(String xfzbz) {
        this.xfzbz = xfzbz;
    }

    public void setZpbz(String zpbz) {
        this.zpbz = zpbz;
    }
}
