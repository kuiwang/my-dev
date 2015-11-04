package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.ItemData;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ju.items.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JuItemsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8424635948863251976L;

    /**
     * 聚划算商品对象列表
     */
    @ApiListField("item_list")
    @ApiField("item_data")
    private List<ItemData> itemList;

    public void setItemList(List<ItemData> itemList) {
        this.itemList = itemList;
    }

    public List<ItemData> getItemList() {
        return this.itemList;
    }

}
