package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LaiwangUsers;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.user.list.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangUserListGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6456484324959624569L;

    /**
     * 关注者列表
     */
    @ApiField("users")
    private LaiwangUsers users;

    public void setUsers(LaiwangUsers users) {
        this.users = users;
    }

    public LaiwangUsers getUsers() {
        return this.users;
    }

}
