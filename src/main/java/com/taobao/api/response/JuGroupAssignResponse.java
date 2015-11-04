package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GroupData;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ju.group.assign response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JuGroupAssignResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7343711682228417711L;

    /**
     * 返回单个组信息
     */
    @ApiField("group")
    private GroupData group;

    public void setGroup(GroupData group) {
        this.group = group;
    }

    public GroupData getGroup() {
        return this.group;
    }

}
