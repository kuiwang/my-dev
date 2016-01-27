package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupAddResponse;

/**
 * TOP API: taobao.simba.adgroup.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:15
 */
public class SimbaAdgroupAddRequest implements TaobaoRequest<SimbaAdgroupAddResponse> {

    /**
     * 推广计划Id
     */
    private Long campaignId;

    /**
     * 推广组默认出价，单位为分，不能小于5 不能大于日最高限额<br />
     * 支持最小值为：5
     */
    private Long defaultPrice;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 创意图片地址，必须是商品的图片之一
     */
    private String imgUrl;

    /**
     * 商品Id
     */
    private Long itemId;

    /**
     * 主人昵称
     */
    private String nick;

    private Long timestamp;

    /**
     * 创意标题，最多20个汉字<br />
     * 支持最大长度为：40<br />
     * 支持的最大列表长度为：40
     */
    private String title;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(campaignId, "campaignId");
        RequestCheckUtils.checkNotEmpty(defaultPrice, "defaultPrice");
        RequestCheckUtils.checkMinValue(defaultPrice, 5L, "defaultPrice");
        RequestCheckUtils.checkNotEmpty(imgUrl, "imgUrl");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 40, "title");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.adgroup.add";
    }

    public Long getCampaignId() {
        return this.campaignId;
    }

    public Long getDefaultPrice() {
        return this.defaultPrice;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaAdgroupAddResponse> getResponseClass() {
        return SimbaAdgroupAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("campaign_id", this.campaignId);
        txtParams.put("default_price", this.defaultPrice);
        txtParams.put("img_url", this.imgUrl);
        txtParams.put("item_id", this.itemId);
        txtParams.put("nick", this.nick);
        txtParams.put("title", this.title);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setCampaignId(Long campaignId) {
        this.campaignId = campaignId;
    }

    public void setDefaultPrice(Long defaultPrice) {
        this.defaultPrice = defaultPrice;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
