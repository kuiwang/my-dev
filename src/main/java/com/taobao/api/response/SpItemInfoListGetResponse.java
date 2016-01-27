package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.sp.item.info.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpItemInfoListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5171564841451965347L;

    /**
     * 商品信息
     */
    @ApiListField("item_list")
    @ApiField("sp_item")
    private List<SpItem> itemList;

    public List<SpItem> getItemList() {
        return this.itemList;
    }

    public void setItemList(List<SpItem> itemList) {
        this.itemList = itemList;
    }

}
