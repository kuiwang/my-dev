package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: alibaba.laiwang.pp.menu.remove response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class AlibabaLaiwangPpMenuRemoveResponse extends TaobaoResponse {

    private static final long serialVersionUID = 7128345966924749361L;

    /**
     * 删除成功的菜单数量
     */
    @ApiField("deletedcount")
    private Long deletedcount;

    public Long getDeletedcount() {
        return this.deletedcount;
    }

    public void setDeletedcount(Long deletedcount) {
        this.deletedcount = deletedcount;
    }

}
