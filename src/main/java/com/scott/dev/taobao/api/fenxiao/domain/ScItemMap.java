package com.scott.dev.taobao.api.fenxiao.domain;

//后端商品映射关系对象
public class ScItemMap {

    //1:前台和后台关系 7:分销和后台关系
    private Number mapType;

    //map_type=1时，item_id为IC商品id map_type=7时，item_id为分销商品id
    private Number itemId;

    //当宝贝下没SKU时该字段为空
    private Number skuId;

    //Ic商家id(分销商id)
    private Number userId;

    //Ic商家nick(分销商nick)
    private String userNick;

    //后端商品ID
    private Number relItemId;

    ///后端商品所有者名称
    private String relUserNick;

    //后端商品所有者id
    private Number relUserId;

    //后端商品所有者商家编码
    private String relOuterCode;

    public Number getMapType() {
        return mapType;
    }

    public void setMapType(Number mapType) {
        this.mapType = mapType;
    }

    public Number getItemId() {
        return itemId;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public Number getSkuId() {
        return skuId;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public Number getUserId() {
        return userId;
    }

    public void setUserId(Number userId) {
        this.userId = userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    public Number getRelItemId() {
        return relItemId;
    }

    public void setRelItemId(Number relItemId) {
        this.relItemId = relItemId;
    }

    public String getRelUserNick() {
        return relUserNick;
    }

    public void setRelUserNick(String relUserNick) {
        this.relUserNick = relUserNick;
    }

    public Number getRelUserId() {
        return relUserId;
    }

    public void setRelUserId(Number relUserId) {
        this.relUserId = relUserId;
    }

    public String getRelOuterCode() {
        return relOuterCode;
    }

    public void setRelOuterCode(String relOuterCode) {
        this.relOuterCode = relOuterCode;
    }

}
