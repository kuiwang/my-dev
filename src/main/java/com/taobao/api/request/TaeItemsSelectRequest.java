package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TaeItemsSelectResponse;

/**
 * TOP API: taobao.tae.items.select request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:48
 */
public class TaeItemsSelectRequest implements TaobaoRequest<TaeItemsSelectResponse> {

    /**
     * 淘宝类目id
     */
    private String cid;

    /**
     * 结束价格，单位：元
     */
    private String endPrice;

    /**
     * 返回字段列表
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 商品更新时间
     */
    private Long modifiedTime;

    /**
     * 页码，传入大小以返回pageNo的下一页为准
     */
    private Long pageNo;

    /**
     * 每页大小 小于200
     */
    private Long pageSize;

    /**
     * 店铺类目id
     */
    private String sellerCids;

    /**
     * 卖家昵称
     */
    private String sellerNick;

    /**
     * 开始价格，单位：元
     */
    private String startPrice;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tae.items.select";
    }

    public String getCid() {
        return this.cid;
    }

    public String getEndPrice() {
        return this.endPrice;
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    public Long getPageNo() {
        return this.pageNo;
    }

    public Long getPageSize() {
        return this.pageSize;
    }

    @Override
    public Class<TaeItemsSelectResponse> getResponseClass() {
        return TaeItemsSelectResponse.class;
    }

    public String getSellerCids() {
        return this.sellerCids;
    }

    public String getSellerNick() {
        return this.sellerNick;
    }

    public String getStartPrice() {
        return this.startPrice;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("cid", this.cid);
        txtParams.put("end_price", this.endPrice);
        txtParams.put("fields", this.fields);
        txtParams.put("modified_time", this.modifiedTime);
        txtParams.put("page_no", this.pageNo);
        txtParams.put("page_size", this.pageSize);
        txtParams.put("seller_cids", this.sellerCids);
        txtParams.put("seller_nick", this.sellerNick);
        txtParams.put("start_price", this.startPrice);
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

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setEndPrice(String endPrice) {
        this.endPrice = endPrice;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setModifiedTime(Long modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public void setPageNo(Long pageNo) {
        this.pageNo = pageNo;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public void setSellerCids(String sellerCids) {
        this.sellerCids = sellerCids;
    }

    public void setSellerNick(String sellerNick) {
        this.sellerNick = sellerNick;
    }

    public void setStartPrice(String startPrice) {
        this.startPrice = startPrice;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
