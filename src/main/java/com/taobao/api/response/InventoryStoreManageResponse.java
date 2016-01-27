package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Store;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.inventory.store.manage response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class InventoryStoreManageResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2845641771663596563L;

    /**
     * 返回结果
     */
    @ApiListField("store_list")
    @ApiField("store")
    private List<Store> storeList;

    public List<Store> getStoreList() {
        return this.storeList;
    }

    public void setStoreList(List<Store> storeList) {
        this.storeList = storeList;
    }

}
