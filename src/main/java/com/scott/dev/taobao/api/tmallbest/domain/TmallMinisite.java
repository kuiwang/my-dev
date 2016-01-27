package com.scott.dev.taobao.api.tmallbest.domain;

/**
 * 天猫搜索Minisite信息
 */
public class TmallMinisite {

    /**
     * 店铺id
     */
    private Long id;

    /**
     * 店铺优惠信息
     */
    private String promotions;

    /**
     * 店铺名字
     */
    private String title;

    /**
     * 店铺类型
     */
    private Long type;

    public Long getId() {
        return this.id;
    }

    public String getPromotions() {
        return this.promotions;
    }

    public String getTitle() {
        return this.title;
    }

    public Long getType() {
        return this.type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
