package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.SpItemInfo;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.sp.item.info.list.advanced.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SpItemInfoListAdvancedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8541124812478725398L;

    /**
     * 商品信息
     */
    @ApiListField("item_list")
    @ApiField("sp_item_info")
    private List<SpItemInfo> itemList;

    public void setItemList(List<SpItemInfo> itemList) {
        this.itemList = itemList;
    }

    public List<SpItemInfo> getItemList() {
        return this.itemList;
    }

}
