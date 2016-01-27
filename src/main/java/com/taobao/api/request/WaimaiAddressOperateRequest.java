package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiAddressOperateResponse;

/**
 * TOP API: taobao.waimai.address.operate request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:27
 */
public class WaimaiAddressOperateRequest implements TaobaoRequest<WaimaiAddressOperateResponse> {

    /**
     * 详细地址
     */
    private String address;

    /**
     * 城市汉字名称
     */
    private String city;

    /**
     * 是否是默认地址
     */
    private Long defaulted;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 地址ID
     */
    private Long id;

    /**
     * 收货人姓名
     */
    private String name;

    /**
     * 电话
     */
    private String phone;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    /**
     * 经度保留8位有效整数
     */
    private Long x;

    /**
     * 纬度保留7位有效整数
     */
    private Long y;

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(name, "name");
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.address.operate";
    }

    public String getCity() {
        return this.city;
    }

    public Long getDefaulted() {
        return this.defaulted;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    @Override
    public Class<WaimaiAddressOperateResponse> getResponseClass() {
        return WaimaiAddressOperateResponse.class;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("city", this.city);
        txtParams.put("defaulted", this.defaulted);
        txtParams.put("id", this.id);
        txtParams.put("name", this.name);
        txtParams.put("phone", this.phone);
        txtParams.put("x", this.x);
        txtParams.put("y", this.y);
        if (this.udfParams != null) {
            txtParams.putAll(this.udfParams);
        }
        return txtParams;
    }

    @Override
    public Long getTimestamp() {
        return this.timestamp;
    }

    public Long getX() {
        return this.x;
    }

    public Long getY() {
        return this.y;
    }

    @Override
    public void putOtherTextParam(String key, String value) {
        if (this.udfParams == null) {
            this.udfParams = new TaobaoHashMap();
        }
        this.udfParams.put(key, value);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDefaulted(Long defaulted) {
        this.defaulted = defaulted;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setX(Long x) {
        this.x = x;
    }

    public void setY(Long y) {
        this.y = y;
    }
}
