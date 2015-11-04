package com.scott.dev.taobao.api.favorite.domain;

/*
 * 商品或店铺的信息
 */
public class CollectItem {

    /*
     * 商品或店铺的id号
     */
    private Number itemNumid;

    /*
     * 收藏目标的标题名字
     */
    private String title;

    /*
     * 被收藏宝贝或店铺所有者的昵称
     */
    private String itemOwnerNick;

    public Number getItemNumid() {
        return itemNumid;
    }

    public void setItemNumid(Number itemNumid) {
        this.itemNumid = itemNumid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getItemOwnerNick() {
        return itemOwnerNick;
    }

    public void setItemOwnerNick(String itemOwnerNick) {
        this.itemOwnerNick = itemOwnerNick;
    }
}
