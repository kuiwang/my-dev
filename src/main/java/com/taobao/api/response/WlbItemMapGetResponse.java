package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.OutEntityItem;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.item.map.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemMapGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5592931577258845145L;

    /**
     * 外部商品实体列表
     */
    @ApiListField("out_entity_item_list")
    @ApiField("out_entity_item")
    private List<OutEntityItem> outEntityItemList;

    public void setOutEntityItemList(List<OutEntityItem> outEntityItemList) {
        this.outEntityItemList = outEntityItemList;
    }

    public List<OutEntityItem> getOutEntityItemList() {
        return this.outEntityItemList;
    }

}
