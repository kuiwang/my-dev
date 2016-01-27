package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.User;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.user.buyer.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class UserBuyerGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8544726366256926994L;

    /**
     * 只返回nick,avatar参数
     */
    @ApiField("user")
    private User user;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
