package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 包裹里面的商品类型
 *
 * @author auto create
 * @since 1.0, null
 */
public class PackageItem extends TaobaoObject {

    private static final long serialVersionUID = 2734655633354944845L;

    /**
     * 商品数量
     */
    @ApiField("count")
    private Long count;

    /**
     * 商品类型
     */
    @ApiField("item_name")
    private String itemName;

    public Long getCount() {
        return this.count;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

}
