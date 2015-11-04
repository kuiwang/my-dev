package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 线下门店信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class RetailStoreInfo extends TaobaoObject {

    private static final long serialVersionUID = 2854298732975841224L;

    /**
     * 商品可售线下门店
     */
    @ApiListField("store_list")
    @ApiField("retail_store")
    private List<RetailStore> storeList;

    public List<RetailStore> getStoreList() {
        return this.storeList;
    }

    public void setStoreList(List<RetailStore> storeList) {
        this.storeList = storeList;
    }

}
