package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.FavoriteItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.userrecommend.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UserrecommendItemsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7775341544874948573L;

    /**
     * 返回用户相关的关联宝贝集合
     */
    @ApiListField("favorite_items")
    @ApiField("favorite_item")
    private List<FavoriteItem> favoriteItems;

    public List<FavoriteItem> getFavoriteItems() {
        return this.favoriteItems;
    }

    public void setFavoriteItems(List<FavoriteItem> favoriteItems) {
        this.favoriteItems = favoriteItems;
    }

}
