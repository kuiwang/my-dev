package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.ju.groupids.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JuGroupidsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2643132876249264835L;

    /**
     * 获得商品组id列表
     */
    @ApiListField("group_ids")
    @ApiField("number")
    private List<Long> groupIds;

    public List<Long> getGroupIds() {
        return this.groupIds;
    }

    public void setGroupIds(List<Long> groupIds) {
        this.groupIds = groupIds;
    }

}
