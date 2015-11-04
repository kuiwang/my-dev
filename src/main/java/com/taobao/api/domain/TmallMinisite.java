package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫搜索Minisite信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallMinisite extends TaobaoObject {

    private static final long serialVersionUID = 1213598571266252457L;

    /**
     * 店铺id
     */
    @ApiField("id")
    private Long id;

    /**
     * 店铺优惠信息
     */
    @ApiField("promotions")
    private String promotions;

    /**
     * 店铺名字
     */
    @ApiField("title")
    private String title;

    /**
     * 店铺类型
     */
    @ApiField("type")
    private Long type;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPromotions() {
        return this.promotions;
    }

    public void setPromotions(String promotions) {
        this.promotions = promotions;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getType() {
        return this.type;
    }

    public void setType(Long type) {
        this.type = type;
    }

}
