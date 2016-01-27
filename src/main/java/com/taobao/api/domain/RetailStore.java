package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 电子凭证线下门店
 *
 * @author auto create
 * @since 1.0, null
 */
public class RetailStore extends TaobaoObject {

    private static final long serialVersionUID = 4477711442563198934L;

    /**
     * 地址
     */
    @ApiField("address")
    private String address;

    /**
     * 门店名称
     */
    @ApiField("name")
    private String name;

    /**
     * 经度
     */
    @ApiField("posx")
    private String posx;

    /**
     * 纬度
     */
    @ApiField("posy")
    private String posy;

    /**
     * 门店id
     */
    @ApiField("store_id")
    private String storeId;

    /**
     * 联系电话
     */
    @ApiListField("telno_list")
    @ApiField("string")
    private List<String> telnoList;

    public String getAddress() {
        return this.address;
    }

    public String getName() {
        return this.name;
    }

    public String getPosx() {
        return this.posx;
    }

    public String getPosy() {
        return this.posy;
    }

    public String getStoreId() {
        return this.storeId;
    }

    public List<String> getTelnoList() {
        return this.telnoList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosx(String posx) {
        this.posx = posx;
    }

    public void setPosy(String posy) {
        this.posy = posy;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public void setTelnoList(List<String> telnoList) {
        this.telnoList = telnoList;
    }

}
