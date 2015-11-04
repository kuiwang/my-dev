package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.ApiRuleException;
import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.RequestCheckUtils;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.WlbInventoryDetailGetResponse;

/**
 * TOP API: taobao.wlb.inventory.detail.get request
 * 
 * @author auto create
 * @since 1.0, 2014-11-02 16:51:12
 */
public class WlbInventoryDetailGetRequest implements TaobaoRequest<WlbInventoryDetailGetResponse> {

    private Map<String, String> headerMap = new TaobaoHashMap();

    private TaobaoHashMap udfParams; // add user-defined text parameters

    private Long timestamp;

    /**
     * 库存类型列表，值包括： VENDIBLE--可销售库存 FREEZE--冻结库存 ONWAY--在途库存 DEFECT--残次品库存
     * ENGINE_DAMAGE--机损 BOX_DAMAGE--箱损 EXPIRATION--过保
     */
    private String inventoryTypeList;

    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 仓库编码
     */
    private String storeCode;

    public void setInventoryTypeList(String inventoryTypeList) {
        this.inventoryTypeList = inventoryTypeList;
    }

    public String getInventoryTypeList() {
        return this.inventoryTypeList;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getItemId() {
        return this.itemId;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getStoreCode() {
        return this.storeCode;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public String getApiMethodName() {
        return "taobao.wlb.inventory.detail.get";
    }

    public Map<String, String> getTextParams() {
        TaobaoHashMap txtParams = new TaobaoHashMap();
        txtParams.put("inventory_type_list", this.inventoryTypeList);
        txtParams.put("item_id", this.itemId);
        txtParams.put("store_code", this.storeCode);
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

    public Class<WlbInventoryDetailGetResponse> getResponseClass() {
        return WlbInventoryDetailGetResponse.class;
    }

    public void check() throws ApiRuleException {
        RequestCheckUtils.checkMaxListSize(inventoryTypeList, 20, "inventoryTypeList");
        RequestCheckUtils.checkNotEmpty(itemId, "itemId");
    }

    public Map<String, String> getHeaderMap() {
        return headerMap;
    }
}
