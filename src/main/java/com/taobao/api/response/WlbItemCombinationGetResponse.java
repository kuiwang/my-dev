package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.item.combination.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemCombinationGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4616321251897431497L;

    /**
     * 组合子商品id列表
     */
    @ApiListField("item_id_list")
    @ApiField("number")
    private List<Long> itemIdList;

    public List<Long> getItemIdList() {
        return this.itemIdList;
    }

    public void setItemIdList(List<Long> itemIdList) {
        this.itemIdList = itemIdList;
    }

}
