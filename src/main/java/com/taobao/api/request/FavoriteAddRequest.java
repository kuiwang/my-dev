package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FavoriteAddResponse;

/**
 * TOP API: taobao.favorite.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:22
 */
public class FavoriteAddRequest implements TaobaoRequest<FavoriteAddResponse> {

    /**
     * ITEM表示宝贝，SHOP表示店铺，只能传入这两者之一
     */
    private String collectType;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 如果收藏的是商品，就传num_iid，如果是店铺，就传入sid<br />
     * 支持最大值为：9223372036854775807<br />
     * 支持最小值为：1
     */
    private Long itemNumid;

    /**
     * 该收藏是否公开
     */
    private Boolean shared;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(collectType, "collectType");
        RequestCheckUtils.checkNotEmpty(itemNumid, "itemNumid");
        RequestCheckUtils.checkMaxValue(itemNumid, 9223372036854775807L, "itemNumid");
        RequestCheckUtils.checkMinValue(itemNumid, 1L, "itemNumid");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.favorite.add";
    }

    public String getCollectType() {
        return this.collectType;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getItemNumid() {
        return this.itemNumid;
    }

    @Override
    public Class<FavoriteAddResponse> getResponseClass() {
        return FavoriteAddResponse.class;
    }

    public Boolean getShared() {
        return this.shared;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("collect_type", this.collectType);
        txtParams.put("item_numid", this.itemNumid);
        txtParams.put("shared", this.shared);
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

    public void setCollectType(String collectType) {
        this.collectType = collectType;
    }

    public void setItemNumid(Long itemNumid) {
        this.itemNumid = itemNumid;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
