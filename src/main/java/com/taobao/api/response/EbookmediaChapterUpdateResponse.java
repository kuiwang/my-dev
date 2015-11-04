package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebookmedia.chapter.update response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookmediaChapterUpdateResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6524411674245121744L;

    /**
     * 是否修改成功
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
