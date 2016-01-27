package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryStoreManageResponse;

/**
 * TOP API: taobao.inventory.store.manage request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:11
 */
public class InventoryStoreManageRequest implements TaobaoRequest<InventoryStoreManageResponse> {

    /**
     * 仓库的物理地址，可更新
     */
    private String address;

    /**
     * 仓库区域名，可更新
     */
    private String addressAreaName;

    /**
     * 仓库简称，可更新
     */
    private String aliasName;

    /**
     * 联系人，可更新
     */
    private String contact;

    private Map<String, String> headerMap = new TaobaoHashMap();

    /**
     * 参数定义，ADD：新建; UPDATE：更新
     */
    private String operateType;

    /**
     * 联系电话，可更新
     */
    private String phone;

    /**
     * 邮编，可更新
     */
    private Long postcode;

    /**
     * 商家的仓库编码，不允许重复，不允许更新
     */
    private String storeCode;

    /**
     * 商家的仓库名称，可更新
     */
    private String storeName;

    /**
     * 仓库类型，可更新。目前只支持自有仓，TYPE_OWN：自有物理仓
     */
    private String storeType;

    private Long timestamp;

    private TaobaoHashMap udfParams; // add user-defined text parameters

    @Override
    public void check() throws ApiRuleException {
        RequestCheckUtils.checkNotEmpty(address, "address");
        RequestCheckUtils.checkNotEmpty(addressAreaName, "addressAreaName");
        RequestCheckUtils.checkNotEmpty(operateType, "operateType");
        RequestCheckUtils.checkNotEmpty(storeCode, "storeCode");
        RequestCheckUtils.checkNotEmpty(storeName, "storeName");
        RequestCheckUtils.checkNotEmpty(storeType, "storeType");
    }

    public String getAddress() {
        return this.address;
    }

    public String getAddressAreaName() {
        return this.addressAreaName;
    }

    public String getAliasName() {
        return this.aliasName;
    }

    @Override
    public String getApiMethodName() {
        return "taobao.inventory.store.manage";
    }

    public String getContact() {
        return this.contact;
    }

    @Override
    public Map<String, String> getHeaderMap() {
        return headerMap;
    }

    public String getOperateType() {
        return this.operateType;
    }

    public String getPhone() {
        return this.phone;
    }

    public Long getPostcode() {
        return this.postcode;
    }

    @Override
    public Class<InventoryStoreManageResponse> getResponseClass() {
        return InventoryStoreManageResponse.class;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public String getStoreName() {
        return this.storeName;
    }

    public String getStoreType() {
        return this.storeType;
    }

    @Override
    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("address", this.address);
        txtParams.put("address_area_name", this.addressAreaName);
        txtParams.put("alias_name", this.aliasName);
        txtParams.put("contact", this.contact);
        txtParams.put("operate_type", this.operateType);
        txtParams.put("phone", this.phone);
        txtParams.put("postcode", this.postcode);
        txtParams.put("store_code", this.storeCode);
        txtParams.put("store_name", this.storeName);
        txtParams.put("store_type", this.storeType);
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

    public void setAddressAreaName(String addressAreaName) {
        this.addressAreaName = addressAreaName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPostcode(Long postcode) {
        this.postcode = postcode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    @Override
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
