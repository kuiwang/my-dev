package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 当前用户城市为单位的店铺列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class TopShopGroupByCity extends TaobaoObject {

    private static final long serialVersionUID = 7891447367752842489L;

    /**
     * 城市id
     */
    @ApiField("cityid")
    private Long cityid;

    /**
     * 城市名称
     */
    @ApiField("cityname")
    private String cityname;

    /**
     * 店铺list
     */
    @ApiListField("shoplist")
    @ApiField("top_shop")
    private List<TopShop> shoplist;

    public Long getCityid() {
        return this.cityid;
    }

    public String getCityname() {
        return this.cityname;
    }

    public List<TopShop> getShoplist() {
        return this.shoplist;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public void setShoplist(List<TopShop> shoplist) {
        this.shoplist = shoplist;
    }

}
