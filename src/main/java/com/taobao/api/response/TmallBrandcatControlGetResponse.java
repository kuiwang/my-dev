package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.BrandCatControlInfo;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.brandcat.control.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallBrandcatControlGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8728782587675649354L;

    /**
     * 被管控的类目和品牌信息。如何判断一个产品是否被管控，是去品牌的信息和类目信息做一个交集。
     */
    @ApiField("brand_cat_control_info")
    private BrandCatControlInfo brandCatControlInfo;

    public BrandCatControlInfo getBrandCatControlInfo() {
        return this.brandCatControlInfo;
    }

    public void setBrandCatControlInfo(BrandCatControlInfo brandCatControlInfo) {
        this.brandCatControlInfo = brandCatControlInfo;
    }

}
