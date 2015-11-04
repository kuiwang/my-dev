package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.itemrecommend.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class ItemrecommendItemsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5359861387774814166L;

    /**
     * 返回的推荐商品列表结果集
     */
    @ApiListField("values")
    @ApiField("favorite_item")
    private List<FavoriteItem> values;

    public void setValues(List<FavoriteItem> values) {
        this.values = values;
    }

    public List<FavoriteItem> getValues() {
        return this.values;
    }

}
