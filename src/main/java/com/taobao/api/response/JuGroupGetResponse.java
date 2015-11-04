package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GroupData;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ju.group.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JuGroupGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7488816495571527866L;

    /**
     * 组信息的返回对象
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
