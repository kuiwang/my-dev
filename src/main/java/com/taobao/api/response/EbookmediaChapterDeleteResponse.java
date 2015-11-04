package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: taobao.ebookmedia.chapter.delete response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class EbookmediaChapterDeleteResponse extends TaobaoResponse {

    private static final long serialVersionUID = 4138563647137545381L;

    /**
     * 是否删除成功
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
