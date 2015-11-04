package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.JdpUser;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.jushita.jdp.users.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class JushitaJdpUsersGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7281777672239599711L;

    /**
     * 总记录数
     */
    @ApiField("total_results")
    private Long totalResults;

    /**
     * 用户列表
     */
    @ApiListField("users")
    @ApiField("jdp_user")
    private List<JdpUser> users;

    public void setTotalResults(Long totalResults) {
        this.totalResults = totalResults;
    }

    public Long getTotalResults() {
        return this.totalResults;
    }

    public void setUsers(List<JdpUser> users) {
        this.users = users;
    }

    public List<JdpUser> getUsers() {
        return this.users;
    }

}
