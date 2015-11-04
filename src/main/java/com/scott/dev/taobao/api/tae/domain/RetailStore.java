package com.scott.dev.taobao.api.tae.domain;

import java.util.List;

/**
 * 电子凭证线下门店
 */
public class RetailStore {

    /**
     * 地址
     */
    private String address;

    /**
     * 门店名称
     */
    private String name;

    /**
     * 经度
     */
    private String posx;

    /**
     * 纬度
     */
    private String posy;

    /**
     * 门店id
     */
    private String storeId;

    /**
     * 联系电话
     */
    private List<String> telnoList;

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosx() {
        return this.posx;
    }

    public void setPosx(String posx) {
        this.posx = posx;
    }

    public String getPosy() {
        return this.posy;
    }

    public void setPosy(String posy) {
        this.posy = posy;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public List<String> getTelnoList() {
        return this.telnoList;
    }

    public void setTelnoList(List<String> telnoList) {
        this.telnoList = telnoList;
    }

}
