package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.GroupData;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ju.citygroup.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JuCitygroupGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5712411162193442658L;

    /**
     * 生活服务团信息
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
