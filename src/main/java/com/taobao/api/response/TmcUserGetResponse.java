package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.TmcUser;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.tmc.user.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmcUserGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7751852236715675176L;

    /**
     * 开通的用户数据
     */
    @ApiField("tmc_user")
    private TmcUser tmcUser;

    public TmcUser getTmcUser() {
        return this.tmcUser;
    }

    public void setTmcUser(TmcUser tmcUser) {
        this.tmcUser = tmcUser;
    }

}
