package com.scott.dev.taobao.api.tmallbest.domain;

/**
 * 天猫搜索类目信息
 */
public class TmallCat {

    /**
     * 搜索前台类目id
     */
    private Long catId;

    /**
     * 搜索前台类目名字
     */
    private String catName;

    public Long getCatId() {
        return this.catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

}
