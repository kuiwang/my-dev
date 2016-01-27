package com.taobao.api.response;

import java.util.List;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.domain.WlbAuthorization;
import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.internal.mapping.ApiListField;

/**
 * TOP API: taobao.wlb.item.authorization.query response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class WlbItemAuthorizationQueryResponse extends TaobaoResponse {

    private static final long serialVersionUID = 2856994296458264782L;

    /**
     * 授权关系列表
     */
    @ApiListField("authorization_list")
    @ApiField("wlb_authorization")
    private List<WlbAuthorization> authorizationList;

    /**
     * 结果总数
     */
    @ApiField("total_count")
    private Long totalCount;

    public List<WlbAuthorization> getAuthorizationList() {
        return this.authorizationList;
    }

    public Long getTotalCount() {
        return this.totalCount;
    }

    public void setAuthorizationList(List<WlbAuthorization> authorizationList) {
        this.authorizationList = authorizationList;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

}
