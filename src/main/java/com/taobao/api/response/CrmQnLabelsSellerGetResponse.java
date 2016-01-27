package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.Group;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.crm.qn.labels.seller.get response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmQnLabelsSellerGetResponse extends TaobaoResponse {

    private static final long serialVersionUID = 3285111143211519948L;

    /**
     * 查询到的当前卖家的当前页的会员
     */
    @ApiListField("groups")
    @ApiField("group")
    private List<Group> groups;

    public List<Group> getGroups() {
        return this.groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

}
