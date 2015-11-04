package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 类目出价预估信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class ADGroupCatMatchForecast extends TaobaoObject {

    private static final long serialVersionUID = 2418665864535674164L;

    /**
     * 推广组ID
     */
    @ApiField("adgroup_id")
    private Long adgroupId;

    /**
     * 类目出价ID
     */
    @ApiField("catmatch_id")
    private Long catmatchId;

    /**
     * 昵称
     */
    @ApiField("nick")
    private String nick;

    /**
     * 点击预估；根据出价预估点击量 40:784,50:1007表示出价40分点击量为783；出价50分点击量为1007
     */
    @ApiField("price_click")
    private String priceClick;

    /**
     * 消耗预估；根据出价预估消耗。40:20,50:21表示出价40元分，消耗20分；出价50分消耗21分
     */
    @ApiField("price_cust")
    private String priceCust;

    /**
     * 排名预估;根据出价预估排名。 40:101,41:101表示出价40分排名101位；出价41分排名101位
     */
    @ApiField("price_rank")
    private String priceRank;

    public Long getAdgroupId() {
        return this.adgroupId;
    }

    public void setAdgroupId(Long adgroupId) {
        this.adgroupId = adgroupId;
    }

    public Long getCatmatchId() {
        return this.catmatchId;
    }

    public void setCatmatchId(Long catmatchId) {
        this.catmatchId = catmatchId;
    }

    public String getNick() {
        return this.nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getPriceClick() {
        return this.priceClick;
    }

    public void setPriceClick(String priceClick) {
        this.priceClick = priceClick;
    }

    public String getPriceCust() {
        return this.priceCust;
    }

    public void setPriceCust(String priceCust) {
        this.priceCust = priceCust;
    }

    public String getPriceRank() {
        return this.priceRank;
    }

    public void setPriceRank(String priceRank) {
        this.priceRank = priceRank;
    }

}
