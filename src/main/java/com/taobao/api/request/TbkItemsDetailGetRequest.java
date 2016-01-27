package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TbkItemsDetailGetResponse;

/**
 * TOP API: taobao.tbk.items.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class TbkItemsDetailGetRequest implements TaobaoRequest<TbkItemsDetailGetResponse> {

    /**
     * 需返回的字段列表.可选值:num_iid,seller_id,nick,title,price,volume,pic_url,
     * item_url,shop_url ;字段之间用","分隔.
     */
    private String fields;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 淘宝客商品数字id串.最大输入40个.格式如:"value1,value2,value3" 用" , "号分隔商品数字id
     */
    private String numIids;

    private Long timestamp;

    /**
     * 商品track_iid串（带有追踪效果的商品id),最大输入40个,与num_iids必填其一
     */
    private String trackIids;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(fields, "fields");
        RequestCheckUtils.checkMaxListSize(numIids, 50, "numIids");
        RequestCheckUtils.checkMaxListSize(trackIids, 50, "trackIids");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.tbk.items.detail.get";
    }

    public String getFields() {
        return this.fields;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getNumIids() {
        return this.numIids;
    }

    @Override
    public Class<TbkItemsDetailGetResponse> getResponseClass() {
        return TbkItemsDetailGetResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("fields", this.fields);
        txtParams.put("num_iids", this.numIids);
        txtParams.put("track_iids", this.trackIids);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTrackIids() {
        return this.trackIids;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public void setNumIids(String numIids) {
        this.numIids = numIids;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTrackIids(String trackIids) {
        this.trackIids = trackIids;
    }
}
