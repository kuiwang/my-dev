package com.taobao.api.request;

import java.util.Date;
import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsJushitaJdpDatadeleteResponse;

/**
 * TOP API: taobao.topats.jushita.jdp.datadelete request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:32
 */
public class TopatsJushitaJdpDatadeleteRequest implements
        TaobaoRequest<TopatsJushitaJdpDatadeleteResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 删除数据时间段的结束修改时间，格式为：yyyy-MM-dd
     * HH:mm:ss，结束时间必须为前天的23:59:59秒以前，根据是业务的modified时间
     */
    private Date endModified;

    /**
     * 删除数据时间段的起始修改时间，格式为：yyyy-MM-dd HH:mm:ss,根据是业务的modified时间
     */
    private Date startModified;

    /**
     * 推送的数据类型，可选值为：tb_trade(淘宝交易)，tb_item(淘宝商品)，tb_refund(淘宝退款)，fx_trade(
     * 分销订单)，tm_refund(天猫退款)，同时删除多种类型以分号分隔，如：
     * "tb_trade;tb_item;tb_refund;fx_trade;tm_refund"
     */
    private String syncType;

    /**
     * 用户昵称，不填表示删除所有用户的数据。
     */
    private String userNick;

    public void setEndModified(Date endModified) {
        this.endModified = endModified;
    }

    public Date getEndModified() {
        return this.endModified;
    }

    public void setStartModified(Date startModified) {
        this.startModified = startModified;
    }

    public Date getStartModified() {
        return this.startModified;
    }

    public void setSyncType(String syncType) {
        this.syncType = syncType;
    }

    public String getSyncType() {
        return this.syncType;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public String getUserNick() {
        return this.userNick;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.topats.jushita.jdp.datadelete";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("end_modified", this.endModified);
        txtParams.put("start_modified", this.startModified);
        txtParams.put("sync_type", this.syncType);
        txtParams.put("user_nick", this.userNick);
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

    public Class<TopatsJushitaJdpDatadeleteResponse> getResponseClass() {
        return TopatsJushitaJdpDatadeleteResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(endModified, "endModified");
        RequestCheckUtils.checkNotEmpty(startModified, "startModified");
        RequestCheckUtils.checkNotEmpty(syncType, "syncType");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
