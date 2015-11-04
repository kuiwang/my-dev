package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫搜索特卖类目信息（查询二级类目用）
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallTmCat extends TaobaoObject {

    private static final long serialVersionUID = 4582279318621874776L;

    /**
     * 特卖二级类目ID
     */
    @ApiField("sub_cat_id")
    private Long subCatId;

    /**
     * 特卖二级类目名称
     */
    @ApiField("sub_cat_name")
    private String subCatName;

    public Long getSubCatId() {
        return this.subCatId;
    }

    public void setSubCatId(Long subCatId) {
        this.subCatId = subCatId;
    }

    public String getSubCatName() {
        return this.subCatName;
    }

    public void setSubCatName(String subCatName) {
        this.subCatName = subCatName;
    }

}
