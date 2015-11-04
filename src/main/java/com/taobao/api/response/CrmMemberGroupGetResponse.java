package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Group;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.crm.member.group.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMemberGroupGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 5624219293128786512L;

    /**
     * 查询到的当前卖家的当前页的会员
     */
    @ApiListField("groups")
    @ApiField("group")
    private List<Group> groups;

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public List<Group> getGroups() {
        return this.groups;
    }

}
