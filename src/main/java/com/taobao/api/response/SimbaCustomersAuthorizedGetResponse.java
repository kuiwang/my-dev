package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.simba.customers.authorized.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class SimbaCustomersAuthorizedGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7584674323784868556L;

    /**
     * 授权当前登录账户为代理账户的昵称列表
     */
    @ApiListField("nicks")
    @ApiField("string")
    private List<String> nicks;

    public void setNicks(List<String> nicks) {
        this.nicks = nicks;
    }

    public List<String> getNicks() {
        return this.nicks;
    }

}
