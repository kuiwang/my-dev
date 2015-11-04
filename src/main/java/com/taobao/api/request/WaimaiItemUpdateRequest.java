package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiItemUpdateResponse;

/**
 * TOP API: taobao.waimai.item.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiItemUpdateRequest implements TaobaoRequest<WaimaiItemUpdateResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 商品描述，至少输入5个字
     */
    private String auctiondesc;

    /**
     * 商品状态(0立即出售,-2放入仓库)
     */
    private Long auctionstatus;

    /**
     * 宝贝所属后台类目
     */
    private Long categoryid;

    /**
     * 商品自定义分类
     */
    private String categoryids;

    /**
     * 目前个字段为空，以后需要更新sku的话传sku
     */
    private String fields;

    /**
     * 商品外部编码，没有则为空
     */
    private String goodsno;

    /**
     * 当前外卖店铺id
     */
    private Long inShopId;

    /**
     * 宝贝id
     */
    private Long itemId;

    /**
     * 限购数量,不输入则表示该宝贝无限购数
     */
    private Long limitbuy;

    /**
     * 宝贝原价，最多两位小数
     */
    private String oriprice;

    /**
     * 宝贝图片
     */
    private String picurl;

    /**
     * 宝贝现在价格,最多两位小数<br />
     * 支持最大长度为：8<br />
     * 支持的最大列表长度为：8
     */
    private String price;

    /**
     * 菜品库存(范围1-999999)<br />
     * 支持的最大列表长度为：6
     */
    private Long quantity;

    /**
     * 商品规则ID
     */
    private Long ruleId;

    /**
     * [{"pv":[{"pText":"颜色","vText":"红色"},{"pText":"尺寸","vText":"8寸"},{
     * "pText":"辣度","vText":"重辣"}],
     * "quantity":"10","price":"100.00","outSkuId":"XXXXXID"}]
     */
    private String skuInfo;

    /**
     * 菜名<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String title;

    /**
     * 宝贝副图，最多可上传4张
     */
    private String viceimage;

    public void setAuctiondesc(String auctiondesc) {
        this.auctiondesc = auctiondesc;
    }

    public String getAuctiondesc() {
        return this.auctiondesc;
    }

    public void setAuctionstatus(Long auctionstatus) {
        this.auctionstatus = auctionstatus;
    }

    public Long getAuctionstatus() {
        return this.auctionstatus;
    }

    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }

    public Long getCategoryid() {
        return this.categoryid;
    }

    public void setCategoryids(String categoryids) {
        this.categoryids = categoryids;
    }

    public String getCategoryids() {
        return this.categoryids;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setGoodsno(String goodsno) {
        this.goodsno = goodsno;
    }

    public String getGoodsno() {
        return this.goodsno;
    }

    public void setInShopId(Long inShopId) {
        this.inShopId = inShopId;
    }

    public Long getInShopId() {
        return this.inShopId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setLimitbuy(Long limitbuy) {
        this.limitbuy = limitbuy;
    }

    public Long getLimitbuy() {
        return this.limitbuy;
    }

    public void setOriprice(String oriprice) {
        this.oriprice = oriprice;
    }

    public String getOriprice() {
        return this.oriprice;
    }

    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    public String getPicurl() {
        return this.picurl;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return this.price;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Long getRuleId() {
        return this.ruleId;
    }

    public void setSkuInfo(String skuInfo) {
        this.skuInfo = skuInfo;
    }

    public String getSkuInfo() {
        return this.skuInfo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public void setViceimage(String viceimage) {
        this.viceimage = viceimage;
    }

    public String getViceimage() {
        return this.viceimage;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.waimai.item.update";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("auctiondesc", this.auctiondesc);
        txtParams.put("auctionstatus", this.auctionstatus);
        txtParams.put("categoryid", this.categoryid);
        txtParams.put("categoryids", this.categoryids);
        txtParams.put("fields", this.fields);
        txtParams.put("goodsno", this.goodsno);
        txtParams.put("in_shop_id", this.inShopId);
        txtParams.put("item_id", this.itemId);
        txtParams.put("limitbuy", this.limitbuy);
        txtParams.put("oriprice", this.oriprice);
        txtParams.put("picurl", this.picurl);
        txtParams.put("price", this.price);
        txtParams.put("quantity", this.quantity);
        txtParams.put("rule_id", this.ruleId);
        txtParams.put("sku_info", this.skuInfo);
        txtParams.put("title", this.title);
        txtParams.put("viceimage", this.viceimage);
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

    public Class<WaimaiItemUpdateResponse> getResponseClass() {
        return WaimaiItemUpdateResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(auctiondesc, "auctiondesc");
        RequestCheckUtils.checkNotEmpty(auctionstatus, "auctionstatus");
        RequestCheckUtils.checkNotEmpty(categoryid, "categoryid");
        RequestCheckUtils.checkNotEmpty(inShopId, "inShopId");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(picurl, "picurl");
        RequestCheckUtils.checkNotEmpty(price, "price");
        RequestCheckUtils.checkMaxLength(price, 8, "price");
        RequestCheckUtils.checkNotEmpty(quantity, "quantity");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 30, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
