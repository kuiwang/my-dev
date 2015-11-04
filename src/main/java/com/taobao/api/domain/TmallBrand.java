package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫搜索品牌信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallBrand extends TaobaoObject {

    private static final long serialVersionUID = 4165764833757549474L;

    /**
     * 搜索品牌id
     */
    @ApiField("brand_id")
    private Long brandId;

    /**
     * 搜索品牌名字
     */
    @ApiField("brand_name")
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
