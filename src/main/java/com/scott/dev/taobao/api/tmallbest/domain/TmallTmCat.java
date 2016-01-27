package com.scott.dev.taobao.api.tmallbest.domain;

/**
 * 天猫搜索特卖类目信息（查询二级类目用）
 */
public class TmallTmCat {

    /**
     * 特卖二级类目ID
     */
    private Long subCatId;

    /**
     * 特卖二级类目名称
     */
    private String subCatName;

    public Long getSubCatId() {
        return this.subCatId;
    }

    public String getSubCatName() {
        return this.subCatName;
    }

    public void setSubCatId(Long subCatId) {
        this.subCatId = subCatId;
    }

    public void setSubCatName(String subCatName) {
        this.subCatName = subCatName;
    }

}
