package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AtbItemsRelateGetResponse;

/**
 * TOP API: taobao.atb.items.relate.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class AtbItemsRelateGetRequest implements TaobaoRequest<AtbItemsRelateGetResponse> {

    /**
     * 分类id.推荐类型为5时cid不能为空。仅支持叶子类目ID，即通过taobao.itemcats.get获取到is_parent=
     * false的cid。
     */
    private Long cid;

    /**
     * 需返回的字段列表.可选值:open_iid,title,nick,pic_url,price,click_url,commission,
     * ommission_rate,commission_num,commission_volume,shop_click_url,
     * seller_credit_score,item_location,volume;字段之间用","分隔
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 指定返回结果的最大条数.实际返回结果个数根据算法来确定,所以该值会小于或者等于该值
     */
    private Long maxCount;

    /**
     * open_iid
     */
    private String openIid;

    /**
     * 推荐类型. 1:同类商品推荐;此时必须得输入num_iid 2:异类商品推荐;此时必须得输入num_iid
     * 3:同店商品推荐;此时必须得输入num_iid 4:店铺热门推荐;此时必须得输入seller_id
     * 5:类目热门推荐;此时必须得输入cid
     */
    private Long relateType;

    /**
     * 卖家的用户id.注：推荐类型为4时seller_id不能为空
     */
    private Long sellerId;

    /**
     * 店铺类型.默认all,商城:b,集市:c
     */
    private String shopType;

    /**
     * default(默认排序,关联推荐相关度),price_desc(价格从高到低),
     * price_asc(价格从低到高),commissionRate_desc(佣金比率从高到低),
     * commissionRate_asc(佣金比率从低到高), commissionNum_desc(成交量成高到低),
     * commissionNum_asc(成交量从低到高)
     */
    private String sort;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(fields, 20, "fields");
        RequestCheckUtils.checkNotEmpty(openIid, "openIid");
        RequestCheckUtils.checkNotEmpty(relateType, "relateType");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.atb.items.relate.get";
    }

    public Long getCid() {
        return this.cid;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getMaxCount() {
        return this.maxCount;
    }

    public String getOpenIid() {
        return this.openIid;
    }

    public Long getRelateType() {
        return this.relateType;
    }

    @Override
    public Class<AtbItemsRelateGetResponse> getResponseClass() {
        return AtbItemsRelateGetResponse.class;
    }

    public Long getSellerId() {
        return this.sellerId;
    }

    public String getShopType() {
        return this.shopType;
    }

    public String getSort() {
        return this.sort;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("fields", this.fields);
        txtParams.put("max_count", this.maxCount);
        txtParams.put("open_iid", this.openIid);
        txtParams.put("relate_type", this.relateType);
        txtParams.put("seller_id", this.sellerId);
        txtParams.put("shop_type", this.shopType);
        txtParams.put("sort", this.sort);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setMaxCount(Long maxCount) {
        this.maxCount = maxCount;
    }

    public void setOpenIid(String openIid) {
        this.openIid = openIid;
    }

    public void setRelateType(Long relateType) {
        this.relateType = relateType;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
