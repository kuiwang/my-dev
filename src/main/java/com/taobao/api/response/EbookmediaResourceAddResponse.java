package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebookmedia.resource.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookmediaResourceAddResponse extends TaobaoResponse {

    private static final long serialVersionUID = 8277765658283467399L;

    /**
     * 是否修改成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
