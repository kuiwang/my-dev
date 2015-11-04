package com.scott.dev.taobao.api.tmallbest.domain;

/**
 * 天猫搜索品牌信息
 */
public class TmallBrand {

    /**
     * 搜索品牌id
     */
    private Long brandId;

    /**
     * 搜索品牌名字
     */
    private String brandName;

    public Long getBrandId() {
        return this.brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

}
