package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 商品或店铺的信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class CollectItem extends TaobaoObject {

    private static final long serialVersionUID = 4698467583873597452L;

    /**
     * 商品或店铺的id号
     */
    @ApiField("item_numid")
    private Long itemNumid;

    /**
     * 被收藏宝贝或店铺所有者的昵称
     */
    @ApiField("item_owner_nick")
    private String itemOwnerNick;

    /**
     * 收藏目标的标题名字
     */
    @ApiField("title")
    private String title;

    public Long getItemNumid() {
        return this.itemNumid;
    }

    public String getItemOwnerNick() {
        return this.itemOwnerNick;
    }

    public String getTitle() {
        return this.title;
    }

    public void setItemNumid(Long itemNumid) {
        this.itemNumid = itemNumid;
    }

    public void setItemOwnerNick(String itemOwnerNick) {
        this.itemOwnerNick = itemOwnerNick;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
