package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AtbItemsDetailGetResponse;

/**
 * TOP API: taobao.atb.items.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class AtbItemsDetailGetRequest implements TaobaoRequest<AtbItemsDetailGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 需返回的字段列表.可选值:AitaobaoItemDetail淘宝客商品结构体中的所有字段;字段之间用","分隔。
     * item_detail需要设置到Item模型下的字段,如设置:open_iid,detail_url等;
     * 只设置item_detail,则不返回的Item下的所有信息.注：item结构中的skus、videos、props_name不返回
     */
    private String fields;

    /**
     * open_iid串.最大输入10个.格式如:"value1,value2,value3" 用" , "号分隔
     */
    private String openIids;

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getFields() {
        return this.fields;
    }

    public void setOpenIids(String openIids) {
        this.openIids = openIids;
    }

    public String getOpenIids() {
        return this.openIids;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.atb.items.detail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("open_iids", this.openIids);
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

    public Class<AtbItemsDetailGetResponse> getResponseClass() {
        return AtbItemsDetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(fields, 200, "fields");
        RequestCheckUtils.checkNotEmpty(openIids, "openIids");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
