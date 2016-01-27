package com.taobao.api.response;

import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.mapping.ApiField;

/**
 * TOP API: tmall.promotag.taguser.judge response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TmallPromotagTaguserJudgeResponse extends TaobaoResponse {

    private static final long serialVersionUID = 6565249988914631969L;

    /**
     * 用户是否有标签
     */
    @ApiField("has_tag")
    private Boolean hasTag;

    /**
     * 服务调用是否成功
     */
    @ApiField("is_success")
    private Boolean isSuccess;

    public Boolean getHasTag() {
        return this.hasTag;
    }

    public Boolean getIsSuccess() {
        return this.isSuccess;
    }

    public void setHasTag(Boolean hasTag) {
        this.hasTag = hasTag;
    }

    public void setIsSuccess(Boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

}
