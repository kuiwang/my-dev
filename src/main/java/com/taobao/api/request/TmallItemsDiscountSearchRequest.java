package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TmallItemsDiscountSearchResponse;

/**
 * TOP API: tmall.items.discount.search request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:31
 */
public class TmallItemsDiscountSearchRequest implements
        TaobaoRequest<TmallItemsDiscountSearchResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品标签。品牌特卖商品库：3458；天猫原创商品库：4801,不再支持 天猫精品库：8578；
     */
    private Long auctionTag;

    /**
     * 品牌的id。点击某品牌类目的时候会出现。
     */
    private Long brand;

    /**
     * 前台类目id，目前其他接口无法获取，只能自己去寻找。建议使用关键字获取数据。支持多选过滤，cat=catid1,catid2。
     */
    private String cat;

    /**
     * 商品最高价格
     */
    private String endPrice;

    /**
     * 是否包邮，-1为包邮
     */
    private Long postFee;

    /**
     * 表示搜索的关键字，例如搜索query=nike。当输入关键字为中文时，将对他进行URLEncode的UTF-8格式编码，如
     * 耐克，那么q=%E8%80%90%E5%85%8B。
     */
    private String q;

    /**
     * 排序类型。类型包括： s: 人气排序 p: 价格从低到高; pd: 价格从高到低; d: 月销量从高到低; td: 总销量从高到低;
     * pt: 按发布时间排序.
     */
    private String sort;

    /**
     * 可以用该字段来实现分页功能。表示查询起始位置，默认从第0条开始，start=10,表示从第10条数据开始查询，start不得大于1000
     * 。<br />
     * 支持最大值为：1000
     */
    private Long start;

    /**
     * 商品最低价格
     */
    private String startPrice;

    public void setAuctionTag(Long auctionTag) {
        this.auctionTag = auctionTag;
    }

    public Long getAuctionTag() {
        return this.auctionTag;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public Long getBrand() {
        return this.brand;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getCat() {
        return this.cat;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public String getEndPrice() {
        return this.endPrice;
    }

    public void setPostFee(Long postFee) {
        this.postFee = postFee;
    }

    public Long getPostFee() {
        return this.postFee;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getQ() {
        return this.q;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getSort() {
        return this.sort;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public Long getStart() {
        return this.start;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    public String getStartPrice() {
        return this.startPrice;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "tmall.items.discount.search";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auction_tag", this.auctionTag);
        txtParams.put("brand", this.brand);
        txtParams.put("cat", this.cat);
        txtParams.put("end_price", this.endPrice);
        txtParams.put("post_fee", this.postFee);
        txtParams.put("q", this.q);
        txtParams.put("sort", this.sort);
        txtParams.put("start", this.start);
        txtParams.put("start_price", this.startPrice);
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

    public Class<TmallItemsDiscountSearchResponse> getResponseClass() {
        return TmallItemsDiscountSearchResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxValue(start, 1000L, "start");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
