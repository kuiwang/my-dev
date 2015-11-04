package com.taobao.api.domain;

import com.taobao.api.TaobaoObject;
import com.taobao.api.internal.mapping.ApiField;

/**
 * 分销商品流量
 *
 * @author auto create
 * @since 1.0, null
 */
public class DistributorItemFlow extends TaobaoObject {

    private static final long serialVersionUID = 2423942884263392136L;

    /**
     * 分销商商品PV。返回KV串中可能不足一周数据，如新上架商品、中间下架以及删除等操作导致。
     */
    @ApiField("item_pv")
    private String itemPv;

    /**
     * 分销商商品UV。返回KV串中可能不足一周数据，如新上架商品、中间下架以及删除等操作导致。
     */
    @ApiField("item_uv")
    private String itemUv;

    /**
     * 产品ID
     */
    @ApiField("product_id")
    private Long productId;

    public String getItemPv() {
        return this.itemPv;
    }

    public void setItemPv(String itemPv) {
        this.itemPv = itemPv;
    }

    public String getItemUv() {
        return this.itemUv;
    }

    public void setItemUv(String itemUv) {
        this.itemUv = itemUv;
    }

    public Long getProductId() {
        return this.productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

}
