package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiCategoryOperateResponse;

/**
 * TOP API: taobao.waimai.category.operate request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiCategoryOperateRequest implements TaobaoRequest<WaimaiCategoryOperateResponse> {

    /**
     * 2，新增 参数：storeId ; 0=1 ; d=json数组
     * 
     * 如：{"cates":[{"name":"test1","cid":111,"order":2,"user":"test","pid":
     * 111,"rid":1111,"bid":12346}]}
     * 
     * 
     * { "cates": [ { "name": "test1", // 类目名， 必选 "order": 2 // 排序值，升序,可选 }
     * ] }
     * 
     * 3, 修改
     * 
     * { "cates": [ { "name": "test1", "cid": 111, // 类目id，必须 "order": 2 //
     * 排序值，升序 } ] }
     * 
     * 4, 删除 { "cates": [ { "cid": 111, // 类目id，必须 } ] }
     */
    private String data;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 0 查询 1 创建 2 更新 3 删除
     */
    private Long operate;

    /**
     * 店铺ID
     */
    private Long shopId;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(operate, "operate");
        RequestCheckUtils.checkNotEmpty(shopId, "shopId");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.category.operate";
    }

    public String getData() {
        return this.data;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getOperate() {
        return this.operate;
    }

    @Override
    public Class<WaimaiCategoryOperateResponse> getResponseClass() {
        return WaimaiCategoryOperateResponse.class;
    }

    public Long getShopId() {
        return this.shopId;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("data", this.data);
        txtParams.put("operate", this.operate);
        txtParams.put("shop_id", this.shopId);
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

    public void setData(String data) {
        this.data = data;
    }

    public void setOperate(Long operate) {
        this.operate = operate;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
