package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.UserLoginlog;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wangwang.eservice.newloginlogs.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WangwangEserviceNewloginlogsGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3429859417415363133L;

    /**
     * 用户登录日志
     */
    @ApiListField("userloginlogs")
    @ApiField("user_loginlog")
    private List<UserLoginlog> userloginlogs;

    public void setUserloginlogs(List<UserLoginlog> userloginlogs) {
        this.userloginlogs = userloginlogs;
    }

    public List<UserLoginlog> getUserloginlogs() {
        return this.userloginlogs;
    }

}
