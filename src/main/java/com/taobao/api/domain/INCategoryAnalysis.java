package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 类目数据分析对象
 *
 * @author auto create
 * @since 1.0, null
 */
public class INCategoryAnalysis extends TaobaoObject {

    private static final long serialVersionUID = 3311567233238585164L;

    /**
     * 地域占比 格式： 地域名称:占比;地域名称:占比;
     */
    @ApiField("category_area_per")
    private String categoryAreaPer;

    /**
     * 竞价分布 格式： 宝贝数:价格;宝贝数:价格;
     */
    @ApiField("category_hp_price")
    private String categoryHpPrice;

    /**
     * 类目id
     */
    @ApiField("category_id")
    private Long categoryId;

    /**
     * 类目名称
     */
    @ApiField("category_name")
    private String categoryName;

    /**
     * 来源占比 格式： 来源名称:比例;来源名称:比例;
     */
    @ApiField("category_source_per")
    private String categorySourcePer;

    public String getCategoryAreaPer() {
        return this.categoryAreaPer;
    }

    public String getCategoryHpPrice() {
        return this.categoryHpPrice;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public String getCategorySourcePer() {
        return this.categorySourcePer;
    }

    public void setCategoryAreaPer(String categoryAreaPer) {
        this.categoryAreaPer = categoryAreaPer;
    }

    public void setCategoryHpPrice(String categoryHpPrice) {
        this.categoryHpPrice = categoryHpPrice;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setCategorySourcePer(String categorySourcePer) {
        this.categorySourcePer = categorySourcePer;
    }

}
