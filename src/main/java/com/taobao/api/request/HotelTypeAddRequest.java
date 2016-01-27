package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.HotelTypeAddResponse;

/**
 * TOP API: taobao.hotel.type.add request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:25
 */
public class HotelTypeAddRequest implements TaobaoRequest<HotelTypeAddResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 酒店id。必须为数字<br />
     * 支持最小值为：0
     */
    private Long hid;

    /**
     * 房型名称。长度不能超过30<br />
     * 支持最大长度为：30<br />
     * 支持的最大列表长度为：30
     */
    private String name;

    /**
     * 接入卖家数据主键,格式为“接入方酒店id-接入方房型id”<br />
     * 支持最大长度为：100<br />
     * 支持的最大列表长度为：100
     */
    private String siteParam;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(hid, "hid");
        RequestCheckUtils.checkMinValue(hid, 0L, "hid");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkMaxLength(name, 30, "name");
        RequestCheckUtils.checkMaxLength(siteParam, 100, "siteParam");
    }

    @Override
    public String getApiMethodName() {
        return "taobao.hotel.type.add";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getHid() {
        return this.hid;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public Class<HotelTypeAddResponse> getResponseClass() {
        return HotelTypeAddResponse.class;
    }

    public String getSiteParam() {
        return this.siteParam;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("hid", this.hid);
        txtParams.put("name", this.name);
        txtParams.put("site_param", this.siteParam);
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

    public void setHid(Long hid) {
        this.hid = hid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSiteParam(String siteParam) {
        this.siteParam = siteParam;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
