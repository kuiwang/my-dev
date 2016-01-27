package com.scott.dev.taobao.api.shop.domain;

import java.util.Date;

public class Shop {

    /*
     * 总橱窗数量，对于C卖家返回总橱窗数，对于B卖家返回0（只有taobao.shop.remainshowcase.get可以返回）
     */
    private Number allCount;

    /*
     * 店铺公告
     */
    private String bulletin;

    /*
     * 店铺所属的类目编号
     */
    private Number cid;

    /*
     * 开店时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private Date created;

    /*
     * 店铺描述
     */
    private String desc;

    /*
     * 最后修改时间。格式：yyyy-MM-dd HH:mm:ss
     */
    private Date modified;

    /*
     * 卖家昵称
     */
    private String nick;

    /*
     * 店标地址。返回相对路径，可以用"http://logo.taobao.com/shop-logo"来拼接成绝对路径
     */
    private String picPath;

    /*
     * 剩余橱窗数量，对于C卖家返回剩余橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
     */
    private Number remainCount;

    /*
     * 店铺动态评分信息
     */
    private ShopScore[] shopScore;

    /*
     * 店铺编号。shop+sid.taobao.com即店铺地址，如shop123456.taobao.com
     */
    private Number sid;

    /*
     * 店铺标题
     */
    private String title;

    /*
     * 已用的橱窗数量，对于C卖家返回已使用的橱窗数，对于B卖家返回-1（只有taobao.shop.remainshowcase.get可以返回）
     */
    private Number usedCount;

    public Number getAllCount() {
        return allCount;
    }

    public String getBulletin() {
        return bulletin;
    }

    public Number getCid() {
        return cid;
    }

    public Date getCreated() {
        return created;
    }

    public String getDesc() {
        return desc;
    }

    public Date getModified() {
        return modified;
    }

    public String getNick() {
        return nick;
    }

    public String getPicPath() {
        return picPath;
    }

    public Number getRemainCount() {
        return remainCount;
    }

    public ShopScore[] getShopScore() {
        return shopScore;
    }

    public Number getSid() {
        return sid;
    }

    public String getTitle() {
        return title;
    }

    public Number getUsedCount() {
        return usedCount;
    }

    public void setAllCount(Number allCount) {
        this.allCount = allCount;
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }

    public void setCid(Number cid) {
        this.cid = cid;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public void setRemainCount(Number remainCount) {
        this.remainCount = remainCount;
    }

    public void setShopScore(ShopScore[] shopScore) {
        this.shopScore = shopScore;
    }

    public void setSid(Number sid) {
        this.sid = sid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUsedCount(Number usedCount) {
        this.usedCount = usedCount;
    }

}
