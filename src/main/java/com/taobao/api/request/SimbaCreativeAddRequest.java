package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCreativeAddResponse;

/**
 * TOP API: taobao.simba.creative.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:17
 */
public class SimbaCreativeAddRequest implements TaobaoRequest<SimbaCreativeAddResponse> {

    /**
     * 推广组Id
     */
    private Long adgroupId;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 创意图片地址，必须是推广组对应商品的图片之一
     */
    private String imgUrl;

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
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
        RequestCheckUtils.checkNotEmpty(imgUrl, "imgUrl");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 40, "title");
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.simba.creative.add";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getNick() {
        return this.nick;
    }

    @Override
    public Class<SimbaCreativeAddResponse> getResponseClass() {
        return SimbaCreativeAddResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("adgroup_id", this.adgroupId);
        txtParams.put("img_url", this.imgUrl);
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

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
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
