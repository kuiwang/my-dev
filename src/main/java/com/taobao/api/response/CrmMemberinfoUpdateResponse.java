package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.crm.memberinfo.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CrmMemberinfoUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 1142817474363627988L;

    /**
     * 会员信息修改是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

}
