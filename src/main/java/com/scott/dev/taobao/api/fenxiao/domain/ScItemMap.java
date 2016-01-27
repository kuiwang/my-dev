package com.scott.dev.taobao.api.fenxiao.domain;

//后端商品映射关系对象
public class ScItemMap {

    //map_type=1时，item_id为IC商品id map_type=7时，item_id为分销商品id
    private Number itemId;

    //1:前台和后台关系 7:分销和后台关系
    private Number mapType;

    //后端商品ID
    private Number relItemId;

    //后端商品所有者商家编码
    private String relOuterCode;

    //后端商品所有者id
    private Number relUserId;

    ///后端商品所有者名称
    private String relUserNick;

    //当宝贝下没SKU时该字段为空
    private Number skuId;

    //Ic商家id(分销商id)
    private Number userId;

    //Ic商家nick(分销商nick)
    private String userNick;

    public Number getItemId() {
        return itemId;
    }

    public Number getMapType() {
        return mapType;
    }

    public Number getRelItemId() {
        return relItemId;
    }

    public String getRelOuterCode() {
        return relOuterCode;
    }

    public Number getRelUserId() {
        return relUserId;
    }

    public String getRelUserNick() {
        return relUserNick;
    }

    public Number getSkuId() {
        return skuId;
    }

    public Number getUserId() {
        return userId;
    }

    public String getUserNick() {
        return userNick;
    }

    public void setItemId(Number itemId) {
        this.itemId = itemId;
    }

    public void setMapType(Number mapType) {
        this.mapType = mapType;
    }

    public void setRelItemId(Number relItemId) {
        this.relItemId = relItemId;
    }

    public void setRelOuterCode(String relOuterCode) {
        this.relOuterCode = relOuterCode;
    }

    public void setRelUserId(Number relUserId) {
        this.relUserId = relUserId;
    }

    public void setRelUserNick(String relUserNick) {
        this.relUserNick = relUserNick;
    }

    public void setSkuId(Number skuId) {
        this.skuId = skuId;
    }

    public void setUserId(Number userId) {
        this.userId = userId;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

}
