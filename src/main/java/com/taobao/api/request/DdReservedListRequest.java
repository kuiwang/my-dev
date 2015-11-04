package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.DdReservedListResponse;

/**
 * TOP API: taobao.dd.reserved.list request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class DdReservedListRequest implements TaobaoRequest<DdReservedListResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 买家称呼
     */
    private String buyerNick;

    /**
     * 买家预定手机号
     */
    private String buyerPhone;

    /**
     * 下单结束时间
     */
    private Date createEnd;

    /**
     * 下单开始时间
     */
    private Date createStart;

    /**
     * 预定结束时间
     */
    private Date ends;

    /**
     * 打印状态 0 : 未打印 1 : 已打印 2 : 已处理
     */
    private Long option;

    /**
     * 翻页游码
     */
    private Long pn;

    /**
     * 页面大小
     */
    private Long ps;

    /**
     * 预定开始时间
     */
    private Date starts;

    /**
     * 店铺哪个字段标明：前支付，基础，高级？
     */
    private String status;

    /**
     * 淘宝商户id
     */
    private String storeId;

    public void setBuyerNick(String buyerNick) {
        this.buyerNick = buyerNick;
    }

    public String getBuyerNick() {
        return this.buyerNick;
    }

    public void setBuyerPhone(String buyerPhone) {
        this.buyerPhone = buyerPhone;
    }

    public String getBuyerPhone() {
        return this.buyerPhone;
    }

    public void setCreateEnd(Date createEnd) {
        this.createEnd = createEnd;
    }

    public Date getCreateEnd() {
        return this.createEnd;
    }

    public void setCreateStart(Date createStart) {
        this.createStart = createStart;
    }

    public Date getCreateStart() {
        return this.createStart;
    }

    public void setEnds(Date ends) {
        this.ends = ends;
    }

    public Date getEnds() {
        return this.ends;
    }

    public void setOption(Long option) {
        this.option = option;
    }

    public Long getOption() {
        return this.option;
    }

    public void setPn(Long pn) {
        this.pn = pn;
    }

    public Long getPn() {
        return this.pn;
    }

    public void setPs(Long ps) {
        this.ps = ps;
    }

    public Long getPs() {
        return this.ps;
    }

    public void setStarts(Date starts) {
        this.starts = starts;
    }

    public Date getStarts() {
        return this.starts;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.dd.reserved.list";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("buyer_nick", this.buyerNick);
        txtParams.put("buyer_phone", this.buyerPhone);
        txtParams.put("create_end", this.createEnd);
        txtParams.put("create_start", this.createStart);
        txtParams.put("ends", this.ends);
        txtParams.put("option", this.option);
        txtParams.put("pn", this.pn);
        txtParams.put("ps", this.ps);
        txtParams.put("starts", this.starts);
        txtParams.put("status", this.status);
        txtParams.put("store_id", this.storeId);
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

    public Class<DdReservedListResponse> getResponseClass() {
        return DdReservedListResponse.class;
    }

    public void check() throws ApiRuleException {
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
