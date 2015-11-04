package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 外卖类目列表
 *
 * @author auto create
 * @since 1.0, null
 */
public class RootCategory extends TaobaoObject {

    private static final long serialVersionUID = 2714512499575972947L;

    /**
     * 一级类目对象
     */
    @ApiField("category")
    private Category category;

    /**
     * categroy的list
     */
    @ApiListField("childslist")
    @ApiField("category")
    private List<Category> childslist;

    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Category> getChildslist() {
        return this.childslist;
    }

    public void setChildslist(List<Category> childslist) {
        this.childslist = childslist;
    }

}
