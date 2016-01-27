package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WaimaiShopUpdateResponse;

/**
 * TOP API: taobao.waimai.shop.update request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:28
 */
public class WaimaiShopUpdateRequest implements TaobaoRequest<WaimaiShopUpdateResponse> {

    /**
     * 店铺地址
     */
    private String address;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 外卖店名称
     */
    private String name;

    /**
     * 店铺电话号码
     */
    private String phone;

    /**
     * 店铺标志
     * 
     * 注意：这里传递的图片url是通过taobao.waimai.item.pic.upload接口上传获得的
     */
    private String picUrl;

    /**
     * 店铺坐标x 注意：这里是大坐标，即是乘以100000后的值
     */
    private Long posx;

    /**
     * 店铺坐标y 注意：这里是大坐标，即是乘以100000后的值
     */
    private Long posy;

    /**
     * 外卖店铺id
     */
    private Long shopid;

    /**
     * 店铺与ISV的关联关系
     */
    private String shopoutid;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(address, "address");
        RequestCheckUtils.checkNotEmpty(name, "name");
        RequestCheckUtils.checkNotEmpty(phone, "phone");
        RequestCheckUtils.checkNotEmpty(posx, "posx");
        RequestCheckUtils.checkNotEmpty(posy, "posy");
        RequestCheckUtils.checkNotEmpty(shopid, "shopid");
    }

    public String getAddress() {
        return this.address;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.waimai.shop.update";
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getName() {
        return this.name;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getPicUrl() {
        return this.picUrl;
    }

    public Long getPosx() {
        return this.posx;
    }

    public Long getPosy() {
        return this.posy;
    }

    @Override
    public Class<WaimaiShopUpdateResponse> getResponseClass() {
        return WaimaiShopUpdateResponse.class;
    }

    public Long getShopid() {
        return this.shopid;
    }

    public String getShopoutid() {
        return this.shopoutid;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("name", this.name);
        txtParams.put("phone", this.phone);
        txtParams.put("pic_url", this.picUrl);
        txtParams.put("posx", this.posx);
        txtParams.put("posy", this.posy);
        txtParams.put("shopid", this.shopid);
        txtParams.put("shopoutid", this.shopoutid);
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

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPosx(Long posx) {
        this.posx = posx;
    }

    public void setPosy(Long posy) {
        this.posy = posy;
    }

    public void setShopid(Long shopid) {
        this.shopid = shopid;
    }

    public void setShopoutid(String shopoutid) {
        this.shopoutid = shopoutid;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
