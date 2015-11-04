package com.taobao.api.domain;

import java.util.List;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * 内含外卖后台类目的list
 *
 * @author auto create
 * @since 1.0, null
 */
public class CategoryResult extends TaobaoObject {

    private static final long serialVersionUID = 8451611868339122881L;

    /**
     * 类目列表集合
     */
    @ApiListField("categorylist")
    @ApiField("root_category")
    private List<RootCategory> categorylist;

    public List<RootCategory> getCategorylist() {
        return this.categorylist;
    }

    public void setCategorylist(List<RootCategory> categorylist) {
        this.categorylist = categorylist;
    }

}
