package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.LaiwangUser;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.user.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangUserGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6866137553289378868L;

    /**
     * 来往用户信息
     */
    @ApiField("user")
    private LaiwangUser user;

    public void setUser(LaiwangUser user) {
        this.user = user;
    }

    public LaiwangUser getUser() {
        return this.user;
    }

}
