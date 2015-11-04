package com.scott.dev.taobao.api.item.domain;

/*
 * 管控的类目以及品牌信息
 */
public class BrandCatControlInfo {

    /*
     *  管控的品牌类目信息，一组列表
     */
    private BrandCatControl[] brandCatControls;

    public BrandCatControl[] getBrandCatControls() {
        return brandCatControls;
    }

    public void setBrandCatControls(BrandCatControl[] brandCatControls) {
        this.brandCatControls = brandCatControls;
    }
}
