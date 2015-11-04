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

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 推广组Id
     */
    private Long adgroupId;

    /**
     * 创意图片地址，必须是推广组对应商品的图片之一
     */
    private String imgUrl;

    /**
     * 主人昵称
     */
    private String nick;

    /**
     * 创意标题，最多20个汉字<br />
     * 支持最大长度为：40<br />
     * 支持的最大列表长度为：40
     */
    private String title;

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNick() {
        return this.nick;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.simba.creative.add";
    }

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

    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public Class<SimbaCreativeAddResponse> getResponseClass() {
        return SimbaCreativeAddResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(adgroupId, "adgroupId");
        RequestCheckUtils.checkNotEmpty(imgUrl, "imgUrl");
        RequestCheckUtils.checkNotEmpty(title, "title");
        RequestCheckUtils.checkMaxLength(title, 40, "title");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
