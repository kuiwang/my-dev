package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 天猫搜索类目信息
 *
 * @author auto create
 * @since 1.0, null
 */
public class TmallCat extends TaobaoObject {

    private static final long serialVersionUID = 8525823169221621959L;

    /**
     * 搜索前台类目id
     */
    @ApiField("cat_id")
    private Long catId;

    /**
     * 搜索前台类目名字
     */
    @ApiField("cat_name")
    private String catName;

    public Long getCatId() {
        return this.catId;
    }

    public String getCatName() {
        return this.catName;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

}
