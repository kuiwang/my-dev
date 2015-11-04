package com.scott.dev.taobao.api.tae.domain;

import java.util.List;

/**
 * 线下门店信息
 */
public class RetailStoreInfo {

    /**
     * 商品可售线下门店
     */
    private List<RetailStore> storeList;

    public List<RetailStore> getStoreList() {
        return this.storeList;
    }

    public void setStoreList(List<RetailStore> storeList) {
        this.storeList = storeList;
    }

}
