package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.HlUserDO;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.jds.hluser.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JdsHluserGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6762862299463261527L;

    /**
     * 回流用户信息
     */
    @ApiField("hl_user")
    private HlUserDO hlUser;

    public HlUserDO getHlUser() {
        return this.hlUser;
    }

    public void setHlUser(HlUserDO hlUser) {
        this.hlUser = hlUser;
    }

}
